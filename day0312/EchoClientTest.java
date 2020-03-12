package day0312;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class EchoClientTest {

	public static void main(String[] args) {
			
		try {
			Socket s = new Socket("localhost",7000);
			DataInputStream dis = new DataInputStream(s.getInputStream());
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			Scanner scan = new Scanner(System.in);
			boolean flag = true;
			
			while(flag) {
				
			//1. ������ ������ ����
			System.out.print("�Է�>");
			dos.writeUTF(scan.nextLine());
			
			//4.������ ����
			String str = dis.readUTF();
			if(!str.equals("quit")) {
			System.out.println("���� : " + str );
			}else {
				flag = false;
			}
			}
			System.out.println("== Ŭ���̾�Ʈ ���� ==");
		} catch (Exception e) {
			e.printStackTrace();
		}
	

	}

}
