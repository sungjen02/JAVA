package day0213;

public class RestArea {

	public static void main(String[] args) {
		//Ŀ�����Ǳ� ��ü ���� : ��ü�������� ����
		//Ŭ������ ���������� = new Ŭ������ ������();
		CoffeeMachine �ƽ����Ǳ� = new CoffeeMachine();
		Person ���� = new Person();
		//���� ����
		
		//int money = ����.input();
		//�ƽ����Ǳ�.check(money);
		�ƽ����Ǳ�.check(����.input());
		�ƽ����Ǳ�.make(����.choice());
		�ƽ����Ǳ�.response();
	}

}
