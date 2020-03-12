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
			
			//2.Ŭ���̾�Ʈ : ���� ������ ����
			System.out.println("2.Ŭ���̾�Ʈ :" +dis.readUTF());
			
			//3.Ŭ���̾�Ʈ : ������ ����
			dos.writeUTF("�ȳ��ϼ���~ ������~");
			System.out.println("3.Ŭ���̾�Ʈ : �޽��� ����");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
