package day0206;

/**
 * if~else : �� �� �ϳ��� �ڵ带 �����ؾ��� ��<br>
 * ����) if(���ǽ�){<br>
 * 			���ǿ� ���� �� ������ ����;<br>
 * 			}else<br>
 * 			���ǿ� ���� ���� �� ������ ����;<br>
 * @author sist
 */
public class TestIfElse {

	public static void main(String[] args) {
		//�Էµ� ���� Ȧ������ ¦������ �����Ͽ� ���
		int num=Integer.parseInt(args[0]);
		
		System.out.println(num+"��(��)");
		if(num % 2 == 0 ) {
			System.out.println("¦��");
			
		}else {
			System.out.println("Ȧ��");
			
		}//end else
		
		//�Է¹��� ���� ����ϰ�
		//�Է¹��� ���� 0 ~ 100 ���̶�� "��ȿ����"�� ����ϰ� ������ "����"
		//������ �Ǵ��Ͽ� ������ ����ϰ�
		//�׷��� ������ "��ȿ����"�� ����ϴ� �ڵ�.

		System.out.println(num + "��");
		
		if(num >= 0 && num <= 100){
			System.out.println("��ȿ����");
		
			if(num < 40) 
				System.out.println("����");
			
			
		}else 
			System.out.println("��ȿ����");
		
		
		//�ι�° �Է°��� �� ����Դϴ�. ����° �Է°��� ��ǰ�����Դϴ�.
		//�� ����� "�Ϲ�" , "Ư��"�� ��쿡�� �Ϲ��� ��ǰ������ 10%��
		//�������ְ� "Ư��"�� ��ǰ������ 30%�� ���ΰ����� å���Ͽ�
		//�Ʒ��� ���� ���
		//����� "�Ϲ�|Ư��" ��ǰ���� : xxx�� ���ΰ��� xx�� �Դϴ�.
		
		int price =Integer.parseInt(args[2]);
		
		
		if(args[1].equals("�Ϲ�") | args[1].equals("Ư��")) {
			double sale = 0.9; //�Ϲݰ��� ���ΰ�
			if(args[1].equals("Ư��")) {
				sale = 0.7;
			}// end if
			System.out.println(args[1] + "������ ����" + price + "�� ���ΰ�" + 
									(price*sale) + "�� �Դϴ�.");
		}else {
			System.out.println("�߸��Է��߽��ϴ�.");
		}
		
	}//main

}//class
