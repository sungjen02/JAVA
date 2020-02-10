package day0210;

import java.util.Scanner;
/**
 * 커피 주문 : 아메리카노, 라떼,  모카, 프라프치노
 * @author sist
 */
public class ScannerTest4 {
	//Field
	public static final String AMERICANO = "아메리카노";
	public static final String LATTE = "라떼";
	public static final String MOCHA = "모카";
	public static final String ICE_AMERICANO = "아이스 아메리카노";



	public static void main(String[] args) {
		//커피 메뉴
		System.out.println("****************************************************");
		System.out.println("**                       menu                         **");
		System.out.println("** 1. 아메리카노 2. 라떼 3. 모카 4. 프라프치노 **");
		System.out.println("****************************************************");
		
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		String choiceMenu = "";
		while(flag) {
		System.out.println("메뉴 번호를 선택해주세요 >");
		int menu = scan.nextInt();
	
			
		switch(menu) {
		case 1 : choiceMenu = AMERICANO; flag = false; break;
		case 2 : choiceMenu = LATTE; flag = false; break;
		case 3 : choiceMenu = MOCHA; flag = false; break;
		case 4 : choiceMenu = ICE_AMERICANO; flag = false; break;
		default : System.out.println("준비중인 메뉴 입니다");
		
		}//end switch
		}//end while
		System.out.println("선택하신 메뉴 : " + choiceMenu);
	}//main

}//class
