package multi_echo_chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiEchoChatServer {
	//Field
	ServerSocket server;
	Socket s;
	DataInputStream dis;
	DataOutputStream dos;
	
	//Constructor
	public MultiEchoChatServer() {
		this(7000);
		
	}
	
	public MultiEchoChatServer(int port) {
		try {
			server = new ServerSocket(port);
			System.out.println("서버 실행 중~~");
			while(true) {
			s= server.accept();
			ServiceThread st = new ServiceThread(s);
			st.start();
//			dis = new DataInputStream(s.getInputStream());
//			dos = new DataOutputStream(s.getOutputStream());
//			
////			while(true) {
//				
//			//2. 수신
//			String str = dis.readUTF();
//			System.out.println("str==>" + str);
//			
//			//3. 송신
//			dos.writeUTF(str);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//Method
}
