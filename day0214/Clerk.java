package day0214;

public class Clerk {

	public static final String[] menuList = {"�Ա�","���","�ܾ�Ȯ��"};
	String[] choiceMenu = new String[menuList.length];
	
	public static void Showmenu() {
		System.out.println("�޴�����Ʈ");
		for (int i = 0; i < menuList.length; i++) {
			System.out.println(menuList[i]);
		}
	}

}//class
