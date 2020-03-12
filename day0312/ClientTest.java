package day0312;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class ClientTest {

	public static void main(String[] args) {
		try {
			Socket s = new Socket("localhost",7000);
			DataInputStream dis = new DataInputStream(s.getInputStream());
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			
			//2.클라이언트 : 서버 데이터 수신
			System.out.println("2.클라이언트 :" +dis.readUTF());
			
			//3.클라이언트 : 서버에 전송
			dos.writeUTF("안녕하세요~ 서버님~");
			System.out.println("3.클라이언트 : 메시지 전송");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
