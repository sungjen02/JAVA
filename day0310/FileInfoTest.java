package day0310;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FileInfoTest {

	public static void main(String[] args) {
		File f = new File("c:/dev/test.txt");
		FileOutputStream fos = null;
		FileInputStream fis = null;
		
		try {
			if(f.exists()) {
				System.out.println("���� ����");	
				//���Ͽ� ������ ����
				fos = new FileOutputStream(f, true);	
				fos.write(new String("Hello~JAVA!!!").getBytes());
				fos.flush();
				System.out.println("���� ���� �Ϸ�~");
				
				//������ ������ ��������
				fis = new FileInputStream(f);
				byte[] b = new byte[1];
				//int d = fis.read();
				System.out.println("-------- ���� ���� ������ -------");
				while(fis.read(b) != -1) {
					System.out.println(new String(b));
				}	
				System.out.println("-------- ���� ���� �Ϸ� -------");
				

			}else {
				System.out.println("���� ����");			
					if(f.createNewFile()) {
						System.out.println("���� ���� �Ϸ�!");
					}else {
						System.out.println("���� ���� ����!!");
					}			
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}//main

}//class











