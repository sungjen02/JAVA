package day0211;

import java.util.Scanner;

public class ScoreArrayTest2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			System.out.println("�迭�� �����Ͻðڽ��ϱ�? Yes[1], No[2]");
			int start = scan.nextInt();
			
			if(start==1) {
				//�迭���� �����
				System.out.println("�迭���� �Է� > ");
				int scoresize = scan.nextInt();
				int[] scorelist = new int [scoresize];
				int sum = 0;
				if(scorelist.length !=0) {
				for (int i = 0; i < scorelist.length; i++) {
					
					System.out.println("������ �Է��Ͻðڽ��ϱ�? (Y/N) > ");
					String check = scan.next();
					if (check.equals("Y")) {
						
					System.out.println("scorelist["+i+"]�����Է� > ");
					scorelist[i] = scan.nextInt();
					sum += scorelist[i];
					}else {
						i = scorelist.length;
					}
				}//for
				//���
				for(int i : scorelist) 
					System.out.println("score = "+i);
				
				System.out.println("sum = " + sum);
				System.out.println("avg = " + sum/scorelist.length);
				
				}else {
					System.out.println("���α׷� ����");
				}
				flag =false;
			}else if(start==2) {
				//����
				flag =false;
				System.out.println("���α׷� ����");
			}else {		
				//�ٽ� �Է����ּ���
				System.out.println("�ٽ� �������ּ���");
			}//end if
		}//end while
	}//main

}//class
