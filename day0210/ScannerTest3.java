package day0210;

import java.util.Scanner;
/**
 * 임의의 구구단 단수를 입력받아 구구단을 출력해주세요.
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
		System.out.println("구구단을 입력해주세요 > ");
		int dan = scan.nextInt();
		
		if(dan>0) {
			//출력 후 종료
			for (int i = 1; i < 10; i++) {
				System.out.println(dan + "*" + i + "=" + (dan*i));
			}
			flag = false;
			}else {
			//다시입력
				System.out.println("다시 입력해주세요");
			}//end else
			
			
		}//end while
		
		System.out.println("프로그램이 종료되었습니다.");

	}//main

}//class
