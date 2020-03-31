package s_board;

import java.util.Scanner;

public class BoardTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BoardDAO dao = new BoardDAO();
		
		System.out.println("----------------------------------------");
		System.out.println(" 1. 글쓰기  2. 읽기  3. 수정  4. 삭제");
		System.out.println("----------------------------------------");
		System.out.println("메뉴를 선택하세요(번호)?");
		int menu = scan.nextInt();
		
		switch(menu) {
			case 1 : new BoardWrite(scan, dao); break;
			case 2 : new BoardList(dao); break;
			default : 
		}
		
		
		
	}//main

}//class
