package day2018;

public class ConstructorTest {

	public static void main(String[] args) {
			
		ConstructorObject co = new ConstructorObject();
		ConstructorObject co2 = new ConstructorObject("현빈","서울");
		ConstructorObject co3 = new ConstructorObject("손예진","부산",90,100,100);
		co.test();
		co2.test();
		co3.test();
	}

}