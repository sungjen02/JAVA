package day0312;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServerTest {

	public static void main(String[] args) {
			
		try {
			ServerSocket server = new ServerSocket(7000);
			System.out.println("���� ������~");
			Socket s = server.accept();
			DataInputStream dis = new DataInputStream(s.getInputStream());
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			boolean flag = true;
			
			while(flag) {
				String str = dis.readUTF();
				
			//2. Ŭ���̾�Ʈ ������ ���� �� �۽�
//			String data = dis.readUTF();
			
			//3. Ŭ���̾�Ʈ ������ �۽�
			if(!str.equals("quit")) {
				dos.writeUTF(str);
			}else {
				dos.writeUTF("quit");
				flag = false;
			}
		}
			System.out.println("== ���α׷� ���� ==");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
