package day0206;



/**
 * else~if (���� if) : ������ ���� ������ ���� �� ���
 * @author sist
 */
public class TestElseIf {

	public static void main(String[] args) {

		//�Է¹��� ������ ��ȿ�� ���� : 0���� �۰ų�, 100���� ũ�ٸ� ��Ȳ��
		//�°� ���и޼����� ����ϰ� �׷��� �ʴٸ� ������ �Բ� ������ ���
		
		int score = 110;
		System.out.println(score + "����");
		if(score < 0) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}else if(score > 100) {
			System.out.println("100���� Ŭ �� �����ϴ�.");
		}else {
			System.out.println("�ùٸ� ���� �Դϴ�.");
		}//end else
		
		//�¾�ط� �� ���ϱ�
		int birth = 1994;
		int zodiacFlag= birth % 12;
		//������,��,��,����,��,��,ȣ����,�䳢,��,��,��,��
		
		if(zodiacFlag == 0){
			System.out.println("�����̶�");
		
		}else if(zodiacFlag == 1){
			System.out.println("��");
		}else if(zodiacFlag == 2){
			System.out.println("��");
		}else if(zodiacFlag == 3){
			System.out.println("����");
		}else if(zodiacFlag == 4){
			System.out.println("��");
		}else if(zodiacFlag == 5){
			System.out.println("��");
		}else if(zodiacFlag == 6){
			System.out.println("ȣ����");
		}else if(zodiacFlag == 7){
			System.out.println("�䳢");
		}else if(zodiacFlag == 8){
			System.out.println("��");
		}else if(zodiacFlag == 9){
			System.out.println("��");
		}else if(zodiacFlag == 10){
			System.out.println("��");
		}else if(zodiacFlag == 11){
			System.out.println("��");
		}
	}//main

}//class