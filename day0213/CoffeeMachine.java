package day0213;

public class CoffeeMachine {
	//Field
	private int money = 0;
	public static final String AMERICANO = "�Ƹ޸�ī��";
	public static final String MILKCOFFEE = "��ũĿ��";
	public static final String ICEAMERICANO = "���̽��Ƹ޸�ī��";
	public static final String MILK = "����";
	
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
		System.out.println("==>2. ���Ǳ� : ������ üũ�Ѵ�.");
		return choiceMenu + "�� �����Ͻ� �� �ֽ��ϴ�.";
	}
	
	public void make(String menu) {
		//���� �����
		System.out.println("==>4. ���Ǳ� : ���Ḧ �����.");
		System.out.println(menu + "���Ḧ �����");
	}
	
	public int change_cal() {
		//���� �Է��� �� - ������ �޴��� ���� ����
		return 0;
	}
	
	public void response() {
		//���� ����
		System.out.println("==>5. ���Ǳ� : ���Ḧ �����Ѵ�.");
		System.out.println("����� �ܵ��� �����Ѵ�.");
		
	}
}//class
