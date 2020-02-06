package day0206;

/**
 * if~else : 둘 중 하나의 코드를 실행해야할 때<br>
 * 문법) if(조건식){<br>
 * 			조건에 맞을 때 수행할 문장;<br>
 * 			}else<br>
 * 			조건에 맞지 않을 때 수행할 문장;<br>
 * @author sist
 */
public class TestIfElse {

	public static void main(String[] args) {
		//입력된 수가 홀수인지 짝수인지 구분하여 출력
		int num=Integer.parseInt(args[0]);
		
		System.out.println(num+"은(는)");
		if(num % 2 == 0 ) {
			System.out.println("짝수");
			
		}else {
			System.out.println("홀수");
			
		}//end else
		
		//입력받은 수를 출력하고
		//입력받은 수가 0 ~ 100 사이라면 "유효점수"를 출력하고 점수가 "과락"
		//인지를 판단하여 과락을 출력하고
		//그렇지 않으면 "무효점수"를 출력하는 코드.

		System.out.println(num + "점");
		
		if(num >= 0 && num <= 100){
			System.out.println("유효점수");
		
			if(num < 40) 
				System.out.println("과락");
			
			
		}else 
			System.out.println("무효점수");
		
		
		//두번째 입력값은 고객 등급입니다. 세번째 입력값을 상품가격입니다.
		//고객 등급은 "일반" , "특별"인 경우에만 일반은 상품가격의 10%를
		//할인해주고 "특별"은 상품가격의 30%를 할인가격을 책정하여
		//아래와 같이 출력
		//고객등급 "일반|특별" 상품가격 : xxx원 할인가격 xx원 입니다.
		
		int price =Integer.parseInt(args[2]);
		
		
		if(args[1].equals("일반") | args[1].equals("특별")) {
			double sale = 0.9; //일반고객의 할인가
			if(args[1].equals("특별")) {
				sale = 0.7;
			}// end if
			System.out.println(args[1] + "고객님의 정상가" + price + "원 할인가" + 
									(price*sale) + "원 입니다.");
		}else {
			System.out.println("잘못입력했습니다.");
		}
		
	}//main

}//class
