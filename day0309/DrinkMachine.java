package day0309;

public class DrinkMachine {
	
	String[] drinkList = {"�ݶ�","���̴�","Ŀ��","����","����"};
	
	//putDrink
	synchronized public void putDrink(String name) {
		System.out.println(name + "-----> �ֱ�");
		for (int i = 0; i < 5; i++) {
			System.out.println(drinkList[i] + "-----> ����");
		}
		System.out.println(name + "--------->> �ֱ� �Ϸ�");
	}

	//getDrink
	public synchronized void getDrink(String name) {
		System.out.println(name + "-------->> ������");
		for (int i = 0; i < drinkList.length; i++) {
			System.out.println(drinkList[i]+"------>>����");
		}
		System.out.println(name + "-------->> ������ �Ϸ�");
	}
}
