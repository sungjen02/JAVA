package day0213;

import java.util.Scanner;

public class Person {
	//Field
	private int money = 0;
	Scanner scan = new Scanner(System.in);
	
	
	//Constructor
	//Method			Person객체.input()
	public int input() {
		System.out.println("동전입력>");
		money = scan.nextInt();
		return money;
	}
	
	public String choice() {
		System.out.println("메뉴입력>");
//		String menu = scan.next();
		return scan.next();
	}
	
}
