package day0212;

import java.util.Random;
import java.util.Scanner;

public class LottoSystemTest {

	public static void main(String[] args) {
		// 1)수동 2)자동 3)확인 4)번호추첨 5)당첨확인 0)종료
		System.out.println("----------------------------------------------------------");
		System.out.println("1)수동 2)자동 3)확인 4)번호추첨 5)당첨확인 0)종료");
		System.out.println("----------------------------------------------------------");
		
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		int[] mylotto = new int[6];
		int[] winlotto = new int[6];
		boolean nflag = true;
		boolean check = false;
		int count = 0;
		 
		while(flag) {
		System.out.println("\n메뉴선택(번호)>");
		int menu = scan.nextInt();
		if(menu == 1) { //수동
			check = true;
			//mylotto = new int[6];
			//6자리 숫자를 입력받아서 저장, 단 범위는 1~45

			while(nflag) {
				System.out.println("번호>");
				int number = scan.nextInt();
				if(number > 0 && number < 46) {
					//번호 저장
					mylotto[count] = number;
					count++;
					
					//입력 종료
					if(count == mylotto.length) {
						System.out.println("== 번호 입력 종료==");
						nflag = false;
					}
				}else {
					System.out.println("1~45까지만 입력가능!!");
					
				}//end if
				
			}//end while
				
			
		}else if(menu == 2) { //자동
			check = true;
			mylotto = new int[6];

			for (int i = 0; i < mylotto.length; i++) {
				mylotto[i] = new Random().nextInt(45)+1;
			}
			System.out.println("== 번호 입력 종료 ==");
			
		}else if(menu == 3) { //번호확인
			if(check) {
			System.out.println("======== 번호확인 ========");
			for (int i = 0; i < mylotto.length; i++) {
				System.out.print(mylotto[i] + "\t");
			}
			}else {
				System.out.println("수동 또는 자동 번호 선택");
			}
		}else if(menu == 4) { //당첨번호 추첨
			
			
			winlotto = new int[6];

			System.out.println("======== 당첨 번호 ========");
			for (int i = 0; i < winlotto.length; i++) {
				winlotto[i] = new Random().nextInt(45)+1;
				System.out.print(winlotto[i] + "\t");
			}
			System.out.print("\n== 당첨 번호 생성 완료 ==");
			
		}else if(menu == 5) { //당첨 확인

			int winNumbers = 0;
			System.out.println("== 당첨확인 ==");
			for (int i = 0; i < mylotto.length; i++) {
				for (int j = 0; j < winlotto.length; j++) {
					if(mylotto[i] == winlotto[i]) {
						System.out.println("당첨번호 : " + winlotto[i]);
						winNumbers++;
						j=winlotto.length;
					}
				}
			}
			System.out.println("당첨개수 : " + winNumbers+"개");
			System.out.println("============");
		}else if(menu == 0) { //종료
			
			flag = false;
		}
		
		}//end while
		
		System.out.println("== 프로그램 종료 ==");
		
		
		}//main

}//class
