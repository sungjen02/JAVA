package multi_chat_object;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MultiChatServer {
	//Field
	ServerSocket server;
	Socket s;
	DataInputStream dis;
	DataOutputStream dos;
	static ArrayList<ServiceThread> sList = new ArrayList<ServiceThread>();
	
	//Constructor
	public MultiChatServer() {
		this(7000);
	}
	
	public MultiChatServer(int port) {
		try {
			server = new ServerSocket(port);
			System.out.println("���� ���� ��~~");
	
			while(true) {
				s = server.accept();
				ServiceThread st = new ServiceThread(s);
				st.start();
				sList.add(st);
				System.out.println("�����ڼ� : " + sList.size());
			}		
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	//Method
}










