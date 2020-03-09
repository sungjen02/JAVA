package day0309;

import java.net.ServerSocket;

public class ExceptionTest {

	public static void main(String[] args) {
		//Runtime Exception 발생 및 처리
		String[] nameList = new String[3];
		nameList[0] = "홍길동";
		nameList[1] = "홍길동1";
		nameList[2] = "홍길동2";
		
		try {
			
		for (int i = 0; i < 5; i++) {
			System.out.println(nameList[i]);
		}
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("예외처리 완료~");
	}finally {
		System.out.println("finally");
	}

}
}