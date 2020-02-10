package day0210;

import java.util.Scanner;
public class ScannerTest {

	public static void main(String[] args) {
		// 임의의 두 수를 입력받아 화면에 출력
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자1>");
		int num1 = scan.nextInt();
		System.out.println(num1);
		
		System.out.println("숫자2>");
		int num2 = scan.nextInt();
		System.out.println("합계 = " +(num1+num2));
		
	}

}
