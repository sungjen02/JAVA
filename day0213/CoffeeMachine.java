package day0213;

import java.util.ArrayList;



public class CoffeeMachine {
	//Field - ��������(Global Variable)
	private int money = 0;
	int choiceMenuPrice = 0;
	String menu = "";
	
	public static final String[] menuList = {"�Ƹ޸�ī��","��ũĿ��","���̽��Ƹ޸�ī��","����"};
	public static final int[] menuPrice = {500,300,700,400};
	String[] choiceMenu = new String[menuList.length];
	
	
//	public static final String MILKCOFFEE = "��ũĿ��";
//	public static final String ICEAMERICANO = "���̽��Ƹ޸�ī��";
//	public static final String MILK = "����";
	
//	public static final int AMERICANO_PRICE = 500;
//	public static final int MILKCOFFEE_PRICE = 300;
//	public static final int ICEAMERICANO_PRICE = 700;
//	public static final int MILK_PRICE = 400;
	
	//Constructor
	//Method
	
	/**
	 * �޴� ����Ʈ ���
	 */
	public static void showMenu() {
		System.out.println("*********** ���Ǳ� �޴� ����Ʈ ***********");
		for (int i = 0; i < menuList.length; i++) {
			System.out.println(menuList[i]+"-"+menuPrice[i]+"��\n");
		}
		System.out.println("\n*****************************************");
	}
	
	/**
	 * ���� ���� ���� üũ
	 * @param money
	 */
	
	public boolean check(int money) {
		boolean result = false;
		this.money = money;
		//String choiceMenu = "";
		int count = 0;
		for (int i = 0; i < menuPrice.length; i++) {
			if(money >= menuPrice[i]){
				choiceMenu[count] = menuList[i];
				count++;
			}
		}

		
		
//		if(money >= AMERICANO_PRICE) {
//			choiceMenu += AMERICANO + ",";
//		}else if(money >= MILKCOFFEE_PRICE) {
//			choiceMenu += MILKCOFFEE + ",";
//		}else if(money >= ICEAMERICANO_PRICE) {
//			choiceMenu += ICEAMERICANO + ",";
//		}else if(money >= MILK_PRICE) {
//			choiceMenu += MILK + ",";
//		}

		
		//��ǥ�� �и��Ͽ� ��¸޴� ����
		ArrayList<String> cMenu = new ArrayList<String>();
		for(String str : choiceMenu) {
			if(str != null) {
				cMenu.add(str);
			}
		}
		if(count == 0) {
			System.out.println("�ݾ��� �����մϴ�.");
			//false
		}else {
			System.out.println("���ð����� �޴� : " + String.join(",",cMenu));
			result = true;//true
		}
		return result;
	}
	
	public void make(String menu) {
		this.menu = menu;
		//������ �޴� ���� choiceMenuPrice�� �ֱ�
		for (int i = 0; i < menuList.length; i++) {
			if(menuList[i].equals(menu)) {
				choiceMenuPrice = menuPrice[i];
				i = menuList.length;
			}
		}
		
		
		//���� �����
		System.out.println(menu + "���Ḧ �������Դϴ�.");
	}
	
	public int change_cal() {
		//���� �Է��� �� - ������ �޴��� ���� ����	
		int change = money - choiceMenuPrice;
		return change;
	}
	
	public void response() {
		//���� ����
		change_cal();
		System.out.println("�ֹ��Ͻ� " + menu + "�� " + change_cal() + "�� �Դϴ�.");
		
	}
}//class
