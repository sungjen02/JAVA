package simple_echo_chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleEchoServer {

	//Field
	ServerSocket server;
	Socket s;
	DataInputStream dis;
	DataOutputStream dos;
			
	//Constructor
	public SimpleEchoServer() {
		try {
		server = new ServerSocket(7000);
		System.out.println("서버 실행 중~~");
		s = server.accept();
		dis = new DataInputStream(s.getInputStream());
		dos = new DataOutputStream(s.getOutputStream());
		boolean flag = true;
		
		//2,3 단계
		while(flag) {
			String str = dis.readUTF();
			if(!str.contentEquals("quit")) 
				dos.writeUTF(str);
				else flag = false;
			}
			System.out.println("== 서버 종료 ==");
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	//Method
}
