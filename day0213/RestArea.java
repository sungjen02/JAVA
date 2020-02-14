package day0213;

public class RestArea {

	public static void main(String[] args) {
		System.out.println("== 평창휴게소에 오신것을 환영합니다 ==");
		CoffeeMachine.showMenu();
		CoffeeMachine 맥심자판기 = new CoffeeMachine();
		맥심자판기.showMenu();
		Person 보검 = new Person();
		boolean flag = true;
		//보검 생성
		
		//int money = 보검.input();
		//맥심자판기.check(money);
		while(flag) {
			
		if(맥심자판기.check(보검.input())) {			
		맥심자판기.make(보검.choice());
		맥심자판기.response();
		flag = false;
		}//end if
		}//end while
	}

}