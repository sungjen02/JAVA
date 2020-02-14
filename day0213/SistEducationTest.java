package day0213;

public class SistEducationTest {

	public static void main(String[] args) {
		System.out.println("== 교육센터에 오신것을 환영합니다");
		CoffeeMachine.showMenu();
		CoffeeMachine 맥심자판기 = new CoffeeMachine();
		CoffeeMachine 맥심자판기2 = new CoffeeMachine();
		맥심자판기2 = new CoffeeMachine();
		맥심자판기2 = new CoffeeMachine();
		Person 학생 = new Person();
		
		맥심자판기.check(학생.input());
		맥심자판기.make(학생.choice());
		맥심자판기.response();
		System.out.println("--------------------------------------");
		맥심자판기2.check(학생.input());
		맥심자판기2.make(학생.choice());
		맥심자판기2.response();
		
	}

}