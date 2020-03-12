package day0312;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServerTest {

	public static void main(String[] args) {
			
		try {
			ServerSocket server = new ServerSocket(7000);
			System.out.println("서버 실행중~");
			Socket s = server.accept();
			DataInputStream dis = new DataInputStream(s.getInputStream());
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			boolean flag = true;
			
			while(flag) {
				String str = dis.readUTF();
				
			//2. 클라이언트 데이터 수신 후 송신
//			String data = dis.readUTF();
			
			//3. 클라이언트 데이터 송신
			if(!str.equals("quit")) {
				dos.writeUTF(str);
			}else {
				dos.writeUTF("quit");
				flag = false;
			}
		}
			System.out.println("== 프로그램 종료 ==");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
