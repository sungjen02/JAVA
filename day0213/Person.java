package day0213;

import java.util.Scanner;

public class Person {
	//Field
	private int money = 0;
	Scanner scan = new Scanner(System.in);
	
	
	//Constructor
	//Method			Person��ü.input()
	public int input() {
		System.out.println("�����Է�>");
		money = scan.nextInt();
		return money;
	}
	
	public String choice() {
		System.out.println("�޴��Է�>");
//		String menu = scan.next();
		return scan.next();
	}
	
}
