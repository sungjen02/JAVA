package day0213;

public class RestArea {

	public static void main(String[] args) {
		//커피자판기 객체 생성 : 객체참조변수 생성
		//클래스명 참조변수명 = new 클래스의 생성자();
		CoffeeMachine 맥심자판기 = new CoffeeMachine();
		Person 보검 = new Person();
		//보검 생성
		
		//int money = 보검.input();
		//맥심자판기.check(money);
		맥심자판기.check(보검.input());
		맥심자판기.make(보검.choice());
		맥심자판기.response();
	}

}
