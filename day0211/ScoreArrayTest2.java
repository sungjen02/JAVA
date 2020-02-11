package day0211;

import java.util.Scanner;

public class ScoreArrayTest2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			System.out.println("배열을 생성하시겠습니까? Yes[1], No[2]");
			int start = scan.nextInt();
			
			if(start==1) {
				//배열갯수 물어보기
				System.out.println("배열갯수 입력 > ");
				int scoresize = scan.nextInt();
				int[] scorelist = new int [scoresize];
				int sum = 0;
				if(scorelist.length !=0) {
				for (int i = 0; i < scorelist.length; i++) {
					
					System.out.println("점수를 입력하시겠습니까? (Y/N) > ");
					String check = scan.next();
					if (check.equals("Y")) {
						
					System.out.println("scorelist["+i+"]점수입력 > ");
					scorelist[i] = scan.nextInt();
					sum += scorelist[i];
					}else {
						i = scorelist.length;
					}
				}//for
				//출력
				for(int i : scorelist) 
					System.out.println("score = "+i);
				
				System.out.println("sum = " + sum);
				System.out.println("avg = " + sum/scorelist.length);
				
				}else {
					System.out.println("프로그램 종료");
				}
				flag =false;
			}else if(start==2) {
				//종료
				flag =false;
				System.out.println("프로그램 종료");
			}else {		
				//다시 입력해주세요
				System.out.println("다시 선택해주세요");
			}//end if
		}//end while
	}//main

}//class
