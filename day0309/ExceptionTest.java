package day0309;

import java.net.ServerSocket;

public class ExceptionTest {

	public static void main(String[] args) {
		//Runtime Exception �߻� �� ó��
		String[] nameList = new String[3];
		nameList[0] = "ȫ�浿";
		nameList[1] = "ȫ�浿1";
		nameList[2] = "ȫ�浿2";
		
		try {
			
		for (int i = 0; i < 5; i++) {
			System.out.println(nameList[i]);
		}
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("����ó�� �Ϸ�~");
	}finally {
		System.out.println("finally");
	}

}
}