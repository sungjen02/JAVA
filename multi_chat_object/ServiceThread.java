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
			System.out.println("------->> ServiceThread ����");
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
				//2. ����
				MessageVO msg = (MessageVO)ois.readObject();
				if(msg.status == MessageVO.CONNECT) {	//ó�� ����
					broadCasting(new MessageVO(msg.name,"�� ����~"));
				}else if(msg.status == MessageVO.TALKING) {	//������
					broadCasting(new MessageVO(msg.name+">", msg.content));
				}else if(msg.status == MessageVO.EXIT) {	//���� ����
					broadCasting(new MessageVO(msg.name,"�� ����~"));
					flag = false;
				}
			}
			System.out.println("--------> ����");
			} catch (Exception e) {
				e.printStackTrace();
			}		
				
				
//				String str = dis.readUTF();
//				System.out.println("str==>" + str);
				
//				if(!str.equals("quit")) {
//					//3. �۽�
//					//dos.writeUTF(str);
//					broadCasting(str);	//���ӵǾ��ִ� ��� Ŭ���̾�Ʈ���� �۽�
//				}else {
//					flag = false;
//				}			
//			}
//			System.out.println("-----> ServiceThread ����!!");
	}//run
	
	//���ӵǾ��ִ� ��� Ŭ���̾�Ʈ���� �����ϴ¸޼ҵ�
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



