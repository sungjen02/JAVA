package multi_chat_object;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ServiceThread extends Thread{
	//Field
	Socket s;
//	DataInputStream dis;
//	DataOutputStream dos;
	ObjectInputStream ois;
	ObjectOutputStream oos;
	
	//Constructor
	public ServiceThread() {}
	public ServiceThread(Socket s) {
		try {
			System.out.println("------->> ServiceThread 생성");
			this.s = s;
//			dis = new DataInputStream(s.getInputStream());
//			dos = new DataOutputStream(s.getOutputStream());
			oos = new ObjectOutputStream(s.getOutputStream());
			ois = new ObjectInputStream(s.getInputStream());
		}catch(Exception e) { e.printStackTrace();}
	}
	
	//Method
	public void run() {
		try {
			boolean flag = true;
			while(flag) {
				//2. 수신
				MessageVO msg = (MessageVO)ois.readObject();
				if(msg.status == MessageVO.CONNECT) {	//처음 접속
					broadCasting(new MessageVO(msg.name,"님 입장~"));
				}else if(msg.status == MessageVO.TALKING) {	//접속중
					broadCasting(new MessageVO(msg.name+">", msg.content));
				}else if(msg.status == MessageVO.EXIT) {	//접속 종료
					broadCasting(new MessageVO(msg.name,"님 퇴장~"));
					flag = false;
				}
			}
			System.out.println("--------> 종료");
			} catch (Exception e) {
				e.printStackTrace();
			}		
				
				
//				String str = dis.readUTF();
//				System.out.println("str==>" + str);
				
//				if(!str.equals("quit")) {
//					//3. 송신
//					//dos.writeUTF(str);
//					broadCasting(str);	//접속되어있는 모든 클라이언트에게 송신
//				}else {
//					flag = false;
//				}			
//			}
//			System.out.println("-----> ServiceThread 종료!!");
	}//run
	
	//접속되어있는 모든 클라이언트에게 전송하는메소드
	public void broadCasting(MessageVO msg) {
		try {
			for(ServiceThread st : MultiChatServer.sList) {
				st.oos.writeObject(msg);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}



