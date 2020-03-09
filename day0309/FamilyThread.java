package day0309;

public class FamilyThread extends Thread {
	//Field
	LivingRoom livingRoom;
	BathRoom bathRoom;
	String name;
	
	//Constructor
	public FamilyThread() {}
	public FamilyThread(String name, LivingRoom livingRoom) {
		this.name = name;
		this.livingRoom = livingRoom;
	}
	
	public FamilyThread(String name, BathRoom bathRoom) {
		this.name = name;
		this.bathRoom = bathRoom;
	}
	
	public void run() {
//		livingRoom.openDoor(name);
		bathRoom.openDoor(name);
	}
}