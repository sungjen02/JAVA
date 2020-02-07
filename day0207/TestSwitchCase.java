package day0207;

/**
 * switch~case : 일치하는 정수를 비교할 때<br>
 * 문법)switch(변수명){<br>
 * 			case 상수 : 실행문장들; break;
 * 			.<br>
 * 			.<br>
 * 			default : 실행문장;<br>
 * 			}
 * @author sist
 */
public class TestSwitchCase {

	public static void main(String[] args) {
		
		int temp=2;
		
		switch(temp) {
		case 0 : System.out.println("0인경우의 실행 코드");
		case 1 : System.out.println("1인경우의 실행 코드"); break;
		case 2 : System.out.println("2인경우의 실행 코드");
		case 3 : System.out.println("3인경우의 실행 코드"); break;
		default : System.out.println("변수와 일치하는 상수가 없는 경우실행코드");
		}//end switch
		
		char flag ='A'; //byte, short, int
		switch(flag) { //long은 사용 불가능
		//case의 상수는 switch에 입력되는 범위까지만 정의할 수 있다.
		case 0 : System.out.println("0"); break;
		case 1 : System.out.println("1"); break;
		case 'A' : System.out.println("2"); break;
		default : System.out.println("그외"); break;
		}//end switch
		
		 // JDK1.7에서 부터는 문자열도 비교 가능
		String lang="assembly";
		switch (lang) {
		case "java": System.out.println("완벽한 OOP언어"); break; 
		case "assembly": System.out.println("기계어"); break; 
		
		default: System.out.println("준비된 언어 없음");
		}//switch
		
	}//main

}//class
