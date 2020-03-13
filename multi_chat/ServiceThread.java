package multi_chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class ServiceThread extends Thread{
	//Field
	Socket s;
	DataInputStream dis;
	DataOutputStream dos;
	
	//Constructor
	public ServiceThread() {}
	public ServiceThread(Socket s) {
		try {
			System.out.println("------->> ServiceThread 생성");
			this.s = s;
			dis = new DataInputStream(s.getInputStream());
			dos = new DataOutputStream(s.getOutputStream());
		}catch(Exception e) { e.printStackTrace();}
	}
	
	//Method
	public void run() {
		try {
			boolean flag = true;
			while(flag) {
				//2. 수신
				String str = dis.readUTF();
				System.out.println("str==>" + str);
				
				if(!str.equals("quit")) {
					//3. 송신
					//dos.writeUTF(str);
					broadCasting(str);	//접속되어있는 모든 클라이언트에게 송신
				}else {
					flag = false;
				}			
			}
			System.out.println("-----> ServiceThread 종료!!");
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}//run
	
	//접속되어있는 모든 클라이언트에게 전송하는메소드
	public void broadCasting(String str) {
		try {
			for(ServiceThread st : MultiChatServer.sList) {
				st.dos.writeUTF(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}



