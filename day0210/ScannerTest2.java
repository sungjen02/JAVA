package day0210;

import java.util.Scanner;
/**
 * �̸��� �ּҸ� �Է¹޾� ������ּ���
 * @author sist
 */
public class ScannerTest2 {
	//Field
	//Constructor	
	//Method
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		boolean flag2 = true;
		while(flag) {
		
		System.out.println("�̸�>");
		String name = scan.nextLine();
		
		//name validation check(��ȿ��üũ)
		if(name == "" || name.equals("")) {
			System.out.println("�̸��� �Է����ּ���");
		}else {
			while(flag2) {
			System.out.println("�ּ�>");
			String addr = scan.nextLine();
			if(addr == "" || addr.equals("")) {
				System.out.println("�ּҸ� �Է����ּ���");
			}else {
			System.out.println("�̸�="+name);
			System.out.println("�ּ�="+addr);	
		flag = false;
		flag2 = false;
		}
			}//end of while - flag2
		}//end else
		}//end of while	
	}//main

}//class