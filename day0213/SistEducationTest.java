package day0213;

public class SistEducationTest {

	public static void main(String[] args) {
		System.out.println("== �������Ϳ� ���Ű��� ȯ���մϴ�");
		CoffeeMachine.showMenu();
		CoffeeMachine �ƽ����Ǳ� = new CoffeeMachine();
		CoffeeMachine �ƽ����Ǳ�2 = new CoffeeMachine();
		�ƽ����Ǳ�2 = new CoffeeMachine();
		�ƽ����Ǳ�2 = new CoffeeMachine();
		Person �л� = new Person();
		
		�ƽ����Ǳ�.check(�л�.input());
		�ƽ����Ǳ�.make(�л�.choice());
		�ƽ����Ǳ�.response();
		System.out.println("--------------------------------------");
		�ƽ����Ǳ�2.check(�л�.input());
		�ƽ����Ǳ�2.make(�л�.choice());
		�ƽ����Ǳ�2.response();
		
	}

}