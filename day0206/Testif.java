package day0206;

/**
 * ���� if�� ���.<br>
 * ���ǿ� ���� ������ �ڵ尡 ����Ǿ���� ��.<br>
 * ����) if( ���ǽ�){<br>
 * 			���ǿ� ���� �� ������ ����....;<br>
 * 			}
 * @author sist
 */
public class Testif {

	public static void main(String[] args) {

		//�ԷµǴ� ���� ���밪 ���ϱ�
		int tempNum= Integer.parseInt(args[0]);
				
		if( tempNum <0 ) {
			tempNum = -tempNum;
		}//end if
		
		//���ڿ��� �񱳴� ==�� equals�� ����. equals ��������� ������� �񱳰���
		//�ι�° �Է°��� �̸��� �޴µ� "James Gosling" �̶�� 
		//�̸��տ� "�ڹ��� �ƹ���"�� ����ϰ� �׷��� �ʴٸ� �̸��� ���
		
		if(args[1].equals("James_Gosling")) {
			System.out.println("�ڹ��� �ƹ���");
		}//end if
		
		System.out.println(args[1]);
		
		System.out.println(args[0] + "�� ���밪 : " + tempNum);
		
		//�Էµ� ���� 0~100 ������ ���� "��ȿ����" �� ���.
		if(tempNum >= 0 && tempNum <=100); {
			System.out.println("��ȿ����");
		}
	}//main

}//class