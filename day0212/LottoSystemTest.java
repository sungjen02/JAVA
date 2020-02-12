package day0212;

import java.util.Random;
import java.util.Scanner;

public class LottoSystemTest {

	public static void main(String[] args) {
		// 1)���� 2)�ڵ� 3)Ȯ�� 4)��ȣ��÷ 5)��÷Ȯ�� 0)����
		System.out.println("----------------------------------------------------------");
		System.out.println("1)���� 2)�ڵ� 3)Ȯ�� 4)��ȣ��÷ 5)��÷Ȯ�� 0)����");
		System.out.println("----------------------------------------------------------");
		
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		int[] mylotto = new int[6];
		int[] winlotto = new int[6];
		boolean nflag = true;
		boolean check = false;
		int count = 0;
		 
		while(flag) {
		System.out.println("\n�޴�����(��ȣ)>");
		int menu = scan.nextInt();
		if(menu == 1) { //����
			check = true;
			//mylotto = new int[6];
			//6�ڸ� ���ڸ� �Է¹޾Ƽ� ����, �� ������ 1~45

			while(nflag) {
				System.out.println("��ȣ>");
				int number = scan.nextInt();
				if(number > 0 && number < 46) {
					//��ȣ ����
					mylotto[count] = number;
					count++;
					
					//�Է� ����
					if(count == mylotto.length) {
						System.out.println("== ��ȣ �Է� ����==");
						nflag = false;
					}
				}else {
					System.out.println("1~45������ �Է°���!!");
					
				}//end if
				
			}//end while
				
			
		}else if(menu == 2) { //�ڵ�
			check = true;
			mylotto = new int[6];

			for (int i = 0; i < mylotto.length; i++) {
				mylotto[i] = new Random().nextInt(45)+1;
			}
			System.out.println("== ��ȣ �Է� ���� ==");
			
		}else if(menu == 3) { //��ȣȮ��
			if(check) {
			System.out.println("======== ��ȣȮ�� ========");
			for (int i = 0; i < mylotto.length; i++) {
				System.out.print(mylotto[i] + "\t");
			}
			}else {
				System.out.println("���� �Ǵ� �ڵ� ��ȣ ����");
			}
		}else if(menu == 4) { //��÷��ȣ ��÷
			
			
			winlotto = new int[6];

			System.out.println("======== ��÷ ��ȣ ========");
			for (int i = 0; i < winlotto.length; i++) {
				winlotto[i] = new Random().nextInt(45)+1;
				System.out.print(winlotto[i] + "\t");
			}
			System.out.print("\n== ��÷ ��ȣ ���� �Ϸ� ==");
			
		}else if(menu == 5) { //��÷ Ȯ��

			int winNumbers = 0;
			System.out.println("== ��÷Ȯ�� ==");
			for (int i = 0; i < mylotto.length; i++) {
				for (int j = 0; j < winlotto.length; j++) {
					if(mylotto[i] == winlotto[i]) {
						System.out.println("��÷��ȣ : " + winlotto[i]);
						winNumbers++;
						j=winlotto.length;
					}
				}
			}
			System.out.println("��÷���� : " + winNumbers+"��");
			System.out.println("============");
		}else if(menu == 0) { //����
			
			flag = false;
		}
		
		}//end while
		
		System.out.println("== ���α׷� ���� ==");
		
		
		}//main

}//class
