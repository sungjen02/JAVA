package day0310;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileInfoTest2 {

	//FileReader, FileWriter ��ü  
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���ϸ�>");
		String fname = scan.next();
		
		File f = new File("c:/dev/"+fname);
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			if(f.exists()) {
				String str = "Hello~~JAVA!!";
				fw = new FileWriter(f, true);
				fw.write(str,0,str.length());
				fw.flush();
				System.out.println("----------->> ������ ���� �Ϸ�");
				
				fr = new FileReader(f);
				char[] c = new char[100];
				//fr.read();
				fr.read(c,0,c.length);
				System.out.println("����--->>"+  new String(c));				
				
			}else {
				f.createNewFile();
				System.out.println("------------->> ���ϻ��� �Ϸ�");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}//main

}//class










