package day2018;

public class ConstructorObject {
	//Field - ��������
	String name,address;
	int kor,eng,math;
	
	//Constructor - ������ : public �����ڸ�[Ŭ������](�Ķ����){ ��� ~ }
	/*
	 * 1. ��ü ������ ȣ��Ǵ� �޼ҵ�
	 * 2. �����ڸ� �ϳ��� �������� ���� ��쿡�� JVM�� ������ ��
	 * 	  �⺻ �����ڸ� ������ ex) public ConstructorObject(){}
	 * 3. �������� �����ε��� ������
	 * 4. ����Ÿ���� ����
	 * 5. this()�� �̿��Ͽ� ������ ȣ���� ������
	 */
	public ConstructorObject() {
		this("ȫ�浿","����",50,50,50); //this�� �׻� ����
//		this("ȫ�浿","����"); // this�� �ϳ�����밡��
//		System.out.println("�⺻ ������ ȣ��~~~!!!");
//		this.name = "ȫ�浿";
//		this.address = "����";
//		this.kor = 50;
//		this.eng = 50;
//		this.math = 50;
	}
	public ConstructorObject(String name, String address) {
		this(name,address,0,0,0);
//		this.name = name;
//		this.address = address;
	}
	public ConstructorObject(String name, String address, int kor, int eng, int math) {
		System.out.println("�⺻ ������ ȣ��~~~!!!");
		this.name = name;
		this.address = address;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	//Method - �޼ҵ�
	public void test() {
		System.out.println("�̸� = " + name);
		System.out.println("�ּ� = " + address);
		System.out.println("���� = " + kor);
		System.out.println("���� = " + eng);
		System.out.println("���� = " + math);
	}
}