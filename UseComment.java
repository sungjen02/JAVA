/**
Java API Document 주석 : 클래스의 설명
*/
class UseComment{
	/**
	Java Application을 만들기 위한 main method
	*/
	public static void main(String[] args){
	int age=0; //초기화된 지역변수의 선언 (나이 저장 목적)
	age=25; // 현재 나이를 할당
	age++; //내년의 나이를 계산 증가연산자를 사용.
	System.out.println(age);
	/* 여러 줄의 코드실행을 한번에 묶어서 막을 때
	System.out.println(++age);
	System.out.println(++age);
	System.out.println(++age);
	*/
	}//main

}//class