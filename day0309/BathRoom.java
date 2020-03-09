package day0309;

public class BathRoom {

		synchronized public void openDoor(String name) {
			System.out.println(name + "--->> 입장");
			for (int i = 0; i < 20; i++) {
				System.out.println(name + "--->> 씻는중~~");
			}
			System.out.println(name + "--->> 퇴장");
		}
}