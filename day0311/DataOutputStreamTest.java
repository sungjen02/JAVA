package day0311;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class DataOutputStreamTest {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			File f = new File("c:/dev/sample2.dat");
			if(!f.exists()) f.createNewFile();
			
			fos = new FileOutputStream(f);
			dos = new DataOutputStream(fos);
			
			dos.writeUTF("ȫ�浿");
			dos.writeInt(100);
			dos.writeLong(100000);
			dos.writeDouble(100.234);
			dos.writeBoolean(true);
			
//			if(dos != null) dos.close();
//			if(fos != null) fos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(dos != null) dos.close();
				if(fos != null) fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}

}
