package day0214;

public class Clerk {

	public static final String[] menuList = {"입금","출금","잔액확인"};
	String[] choiceMenu = new String[menuList.length];
	
	public static void Showmenu() {
		System.out.println("메뉴리스트");
		for (int i = 0; i < menuList.length; i++) {
			System.out.println(menuList[i]);
		}
	}

}//class
