package day0210;

import java.util.Scanner;
/**
 * ������ ������ �ܼ��� �Է¹޾� �������� ������ּ���.
 * @author sist
 */
public class ScannerTest3 {
	//Field
	//Constructor	
	//Method

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
		System.out.println("�������� �Է����ּ��� > ");
		int dan = scan.nextInt();
		
		if(dan>0) {
			//��� �� ����
			for (int i = 1; i < 10; i++) {
				System.out.println(dan + "*" + i + "=" + (dan*i));
			}
			flag = false;
			}else {
			//�ٽ��Է�
				System.out.println("�ٽ� �Է����ּ���");
			}//end else
			
			
		}//end while
		
		System.out.println("���α׷��� ����Ǿ����ϴ�.");

	}//main

}//class
