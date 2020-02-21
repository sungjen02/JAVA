package day0221;

public class HidingTest {

	public static void main(String[] args) {
		HidingObject ho = new HidingObject();
		System.out.println("public = " + ho.name1);
//		System.out.println("private = " + ho.name2);
		System.out.println("private getter = " + ho.getName2());
		System.out.println("friendly(default) = " + ho.name3);
	}

}
