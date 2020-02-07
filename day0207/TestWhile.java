package day0207;

/**
 * while : 시작과 끝을 모를때 사용하는 반복문
 * @author sist
 */
public class TestWhile {

	public static void main(String[] args) {
		int i = 1; //초기값
		
//		while(i < 10) { //조건식
//		System.out.println(i); //반복수행문장
//		i++; //증.감소식
//		}//end while
		
		/////while을 사용하여 구구단 5단 출력
		
		while(i<10) {
			System.out.println(5*i);
			i++;
			
		}//end while
		
	}//main

}//class
