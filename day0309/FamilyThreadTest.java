package day0309;

public class FamilyThreadTest {

	public static void main(String[] args) {
		LivingRoom livingRoom = new LivingRoom();
		BathRoom bathRoom = new BathRoom();
		
//		FamilyThread father = new FamilyThread("father", livingRoom	);
//		FamilyThread mother = new FamilyThread("mother", livingRoom	);
//		FamilyThread sister = new FamilyThread("sister", livingRoom	);
//		FamilyThread brother = new FamilyThread("brother", livingRoom);
		
		FamilyThread father = new FamilyThread("father", bathRoom	);
		FamilyThread mother = new FamilyThread("mother", bathRoom);
		FamilyThread sister = new FamilyThread("sister", bathRoom	);
		FamilyThread brother = new FamilyThread("brother", bathRoom);
		
		father.start();
		mother.start();
		sister.start();
		brother.start();
		
	}

}