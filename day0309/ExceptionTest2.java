package day0309;

import java.util.StringTokenizer;

public class ExceptionTest2 {

	public static void main(String[] args) {
		//Runtime Exception - Nullpointer Exception
		StringTokenizer st = new StringTokenizer("자바 수업입니다");
		try {
		
		int tokens = st.countTokens();
		System.out.println(tokens);
		}catch(Exception e) {
			System.out.println("예외처리 완료~");
		}
	}

}
