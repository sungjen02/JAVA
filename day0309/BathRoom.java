package day0309;

public class BathRoom {

		synchronized public void openDoor(String name) {
			System.out.println(name + "--->> ����");
			for (int i = 0; i < 20; i++) {
				System.out.println(name + "--->> �Ĵ���~~");
			}
			System.out.println(name + "--->> ����");
		}
}