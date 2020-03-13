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
			System.out.println("------->> ServiceThread ����");
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
				//2. ����
				String str = dis.readUTF();
				System.out.println("str==>" + str);
				
				if(!str.equals("quit")) {
					//3. �۽�
					//dos.writeUTF(str);
					broadCasting(str);	//���ӵǾ��ִ� ��� Ŭ���̾�Ʈ���� �۽�
				}else {
					flag = false;
				}			
			}
			System.out.println("-----> ServiceThread ����!!");
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}//run
	
	//���ӵǾ��ִ� ��� Ŭ���̾�Ʈ���� �����ϴ¸޼ҵ�
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



