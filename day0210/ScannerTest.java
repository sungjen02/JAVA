package day0210;

import java.util.Scanner;
public class ScannerTest {

	public static void main(String[] args) {
		// ������ �� ���� �Է¹޾� ȭ�鿡 ���
		Scanner scan = new Scanner(System.in);
		System.out.println("����1>");
		int num1 = scan.nextInt();
		System.out.println(num1);
		
		System.out.println("����2>");
		int num2 = scan.nextInt();
		System.out.println("�հ� = " +(num1+num2));
		
	}

}
