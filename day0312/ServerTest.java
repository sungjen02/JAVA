package day0312;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(7000);
			System.out.println("서버 실행 중~");
			Socket s = server.accept();
			DataInputStream dis = new DataInputStream(s.getInputStream());
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			
			//1.서버 : 환영 메세지 전송
			dos.writeUTF("환영합니다~");
			System.out.println("1.서버 : 메시지 전송");
			
			//4. 서버 : 클라이언트 메세지 수신
			System.out.println("4. 서버 : " + dis.readUTF());
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
