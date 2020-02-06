package day0206;

/**
 * 단일 if의 사용.<br>
 * 조건에 맞을 때에만 코드가 실행되어야할 때.<br>
 * 문법) if( 조건식){<br>
 * 			조건에 맞을 때 수행할 문장....;<br>
 * 			}
 * @author sist
 */
public class Testif {

	public static void main(String[] args) {

		//입력되는 수의 절대값 구하기
		int tempNum= Integer.parseInt(args[0]);
				
		if( tempNum <0 ) {
			tempNum = -tempNum;
		}//end if
		
		//문자열의 비교는 ==과 equals가 가능. equals 생성방법에 상관없이 비교가능
		//두번째 입력값이 이름을 받는데 "James Gosling" 이라면 
		//이름앞에 "자바의 아버지"를 출력하고 그렇지 않다면 이름만 출력
		
		if(args[1].equals("James_Gosling")) {
			System.out.println("자바의 아버지");
		}//end if
		
		System.out.println(args[1]);
		
		System.out.println(args[0] + "의 절대값 : " + tempNum);
		
		//입력된 수가 0~100 사이일 때만 "유효점수" 를 출력.
		if(tempNum >= 0 && tempNum <=100); {
			System.out.println("유효점수");
		}
	}//main

}//class