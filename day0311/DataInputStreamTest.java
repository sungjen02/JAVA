package day0311;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class DataInputStreamTest {

	public static void main(String[] args) {
		try {
			File f = new File("c:/dev/sample2.dat");
			FileInputStream fis = new FileInputStream(f);
			DataInputStream dis = new DataInputStream(fis);
			
			String data = dis.readUTF(); //writeUTF를 통해 저장된 형식만 가능!!
			int d1 = dis.readInt();
			long d2 = dis.readLong();
			double d3 = dis.readDouble();
			boolean d4 = dis.readBoolean();
			
			System.out.println(data);
			System.out.println(d1);
			System.out.println(d2);
			System.out.println(d3);
			System.out.println(d4);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}//main

}//class
