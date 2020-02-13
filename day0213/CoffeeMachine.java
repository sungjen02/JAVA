package day0213;

public class CoffeeMachine {
	//Field
	private int money = 0;
	public static final String AMERICANO = "아메리카노";
	public static final String MILKCOFFEE = "밀크커피";
	public static final String ICEAMERICANO = "아이스아메리카노";
	public static final String MILK = "우유";
	
	public static final int AMERICANO_PRICE = 500;
	public static final int MILKCOFFEE_PRICE = 300;
	public static final int ICEAMERICANO_PRICE = 700;
	public static final int MILK_PRICE = 400;
	
	//Constructor
	//Method
	public String check(int money) {
		String choiceMenu = "";
		
		if(money >= AMERICANO_PRICE) {
			choiceMenu += AMERICANO + ",";
		}else if(money >= MILKCOFFEE_PRICE) {
			choiceMenu += MILKCOFFEE + ",";
		}else if(money >= ICEAMERICANO_PRICE) {
			choiceMenu += ICEAMERICANO + ",";
		}else if(money >= MILK_PRICE) {
			choiceMenu += MILK + ",";
		}
		System.out.println("==>2. 자판기 : 동전을 체크한다.");
		return choiceMenu + "를 선택하실 수 있습니다.";
	}
	
	public void make(String menu) {
		//음료 만들기
		System.out.println("==>4. 자판기 : 음료를 만든다.");
		System.out.println(menu + "음료를 만든다");
	}
	
	public int change_cal() {
		//고객이 입력한 돈 - 선택한 메뉴의 값을 뺀다
		return 0;
	}
	
	public void response() {
		//음료 전달
		System.out.println("==>5. 자판기 : 음료를 전달한다.");
		System.out.println("음료와 잔돈을 전달한다.");
		
	}
}//class
