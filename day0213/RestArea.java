package day0213;

public class RestArea {

	public static void main(String[] args) {
		System.out.println("== ��â�ްԼҿ� ���Ű��� ȯ���մϴ� ==");
		CoffeeMachine.showMenu();
		CoffeeMachine �ƽ����Ǳ� = new CoffeeMachine();
		�ƽ����Ǳ�.showMenu();
		Person ���� = new Person();
		boolean flag = true;
		//���� ����
		
		//int money = ����.input();
		//�ƽ����Ǳ�.check(money);
		while(flag) {
			
		if(�ƽ����Ǳ�.check(����.input())) {			
		�ƽ����Ǳ�.make(����.choice());
		�ƽ����Ǳ�.response();
		flag = false;
		}//end if
		}//end while
	}

}