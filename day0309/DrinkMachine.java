package day0309;

public class DrinkMachine {
	
	String[] drinkList = {"콜라","사이다","커피","생수","우유"};
	
	//putDrink
	synchronized public void putDrink(String name) {
		System.out.println(name + "-----> 넣기");
		for (int i = 0; i < 5; i++) {
			System.out.println(drinkList[i] + "-----> 넣음");
		}
		System.out.println(name + "--------->> 넣기 완료");
	}

	//getDrink
	public synchronized void getDrink(String name) {
		System.out.println(name + "-------->> 꺼내기");
		for (int i = 0; i < drinkList.length; i++) {
			System.out.println(drinkList[i]+"------>>꺼냄");
		}
		System.out.println(name + "-------->> 꺼내기 완료");
	}
}
