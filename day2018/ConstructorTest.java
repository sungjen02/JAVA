package day2018;

public class ConstructorTest {

	public static void main(String[] args) {
			
		ConstructorObject co = new ConstructorObject();
		ConstructorObject co2 = new ConstructorObject("����","����");
		ConstructorObject co3 = new ConstructorObject("�տ���","�λ�",90,100,100);
		co.test();
		co2.test();
		co3.test();
	}

}