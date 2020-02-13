package day0213;

public class Person {
	//Field
	private int money = 500;
	//Constructor
	//Method			Person객체.input()
	public int input() {
		System.out.println("==>1. 사람 : 동전을 넣는다.");
		return money;
	}
	
	public String choice() {
		System.out.println("==>3. 사람 : 메뉴를 선택한다.");
		return "밀크커피";
	}
	
}
