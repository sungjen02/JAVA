package day0210;

import java.util.Scanner;
/**
 * 이름과 주소를 입력받아 출력해주세요
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
		
		System.out.println("이름>");
		String name = scan.nextLine();
		
		//name validation check(유효성체크)
		if(name == "" || name.equals("")) {
			System.out.println("이름을 입력해주세요");
		}else {
			while(flag2) {
			System.out.println("주소>");
			String addr = scan.nextLine();
			if(addr == "" || addr.equals("")) {
				System.out.println("주소를 입력해주세요");
			}else {
			System.out.println("이름="+name);
			System.out.println("주소="+addr);	
		flag = false;
		flag2 = false;
		}
			}//end of while - flag2
		}//end else
		}//end of while	
	}//main

}//class