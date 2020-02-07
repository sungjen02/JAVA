package day0207;


/**
 * for : 시작과 끝을 알 대 사용하는 반복문<br>
 * for(초기값; 조건식; 증.감소식){<br>
 *  반복수행문장들;<br>
 *  }
 * @author sist
 */
public class TestFor {

	public static void main(String[] args) {
		
		for(int i= 0; i< 10; i++) {
		System.out.print("안녕하세요?" + i);
		}//end for
		
		//1~9까지 출력
		// 단을 입력받아 입력한 단의 구구단을 출력. 단, 구구단은 2~9단까지
		//일때만 단을 출력
		int num = Integer.parseInt(args[0]);
		
		if(num>1 && num <10) {
		
		for(int i =1; i < 10; i++) {
			System.out.println(num+ "x" + i +" "+ "="+  (num * i));
		}
		}else {
			System.out.println("입력하신 숫자는 2~9가 아닙니다");
		}
		//대문자 A~Z까지 출력
				
		for(char i ='A'; i <= 'Z'; i++ ) {
			
			System.out.print(" " + i);
		}
		
		for(char i= 65; i <91; i++) {
			System.out.print(i);
		}//end for
		
		
		//0 에서부터 65535까지 반복시키면서 숫자 0~9, 영문자 소문자, 영문자대문자만 출력
		System.out.println("-----");
		System.out.println((int)'0' + " " + (int)'9' + " " + (int)'A' + " " + (int)'Z' + " " + (int)'a' + " " + (int)'z');
		for (int i = 0; i < 65536; i++) {
			//if((i>='0' && i<='9') || (i >= 'A' && i <= 'Z') ||
					//(i>='a' && i<='z')) {
			if((i > 47 && i < 58) || (i > 64 && i < 91) || (i > 96 && i < 123)) {
				
				System.out.println((char)i+"");
		
			
			}//end if
		
	
	}//end for
		
		
	}//main

}//class
