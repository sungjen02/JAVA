package day0217;

import java.util.Scanner;

public class Staff {
	//Field
	String isbn = "12-1234", name = "JAVA�� ����", author = "���� ��";
	int price;
	Scanner scan = new Scanner(System.in);
	
	//Constructor
	//Method
	public String[] input() {
		String[] book = new String[4];
		
		System.out.println("���� : ISBN>");
		book[0] = scan.next();
		System.out.println("���� : ������>");
		book[1] = scan.next();
		System.out.println("���� : ����>");
		book[2] = scan.next();
		System.out.println("���� : ����>");
		book[3] = scan.next();
		return book;
	}
	public BookVO inputObject() {
		BookVO vo = new BookVO();
		
		System.out.println("���� : ISBN>");
		vo.setIsbn(scan.next());
		System.out.println("���� : ������>");
		vo.setName(scan.next());
		System.out.println("���� : ����>");
		vo.setAuthor(scan.next());
		System.out.println("���� : ����>");
		vo.setPrice(scan.nextInt());
		return vo;
	}
}
