package day0211;

public class ScoreArrayTest {

	public static void main(String[] args) {
		int scorelist[] = {90,100,100,80,90,100};
		String[] sublist = {"����","����","����","����","�̼�","ü��"};
		
		//�ε����� ����, ����, ����, ����, ��� ���
		int sum = 0;
		for (int i = 0; i < scorelist.length; i++) {
			//sum = sum + scorelist[i];
			sum += scorelist[i];
			System.out.println(sublist[i] + " : " + scorelist[i]);
		}
		System.out.println("-----------------------------------");
		System.out.println("���� : " + sum);
		System.out.println("��� : " + sum/scorelist.length);
	}//main

}//class
