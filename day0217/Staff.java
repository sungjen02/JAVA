package day0217;

import java.util.Scanner;

public class Staff {
	//Field
	String isbn = "12-1234", name = "JAVA의 정석", author = "남궁 성";
	int price;
	Scanner scan = new Scanner(System.in);
	
	//Constructor
	//Method
	public String[] input() {
		String[] book = new String[4];
		
		System.out.println("직원 : ISBN>");
		book[0] = scan.next();
		System.out.println("직원 : 도서명>");
		book[1] = scan.next();
		System.out.println("직원 : 저자>");
		book[2] = scan.next();
		System.out.println("직원 : 가격>");
		book[3] = scan.next();
		return book;
	}
	public BookVO inputObject() {
		BookVO vo = new BookVO();
		
		System.out.println("직원 : ISBN>");
		vo.setIsbn(scan.next());
		System.out.println("직원 : 도서명>");
		vo.setName(scan.next());
		System.out.println("직원 : 저자>");
		vo.setAuthor(scan.next());
		System.out.println("직원 : 가격>");
		vo.setPrice(scan.nextInt());
		return vo;
	}
}
