package s_board;

import java.util.Scanner;

public class BoardTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BoardDAO dao = new BoardDAO();
		
		System.out.println("----------------------------------------");
		System.out.println(" 1. �۾���  2. �б�  3. ����  4. ����");
		System.out.println("----------------------------------------");
		System.out.println("�޴��� �����ϼ���(��ȣ)?");
		int menu = scan.nextInt();
		
		switch(menu) {
			case 1 : new BoardWrite(scan, dao); break;
			case 2 : new BoardList(dao); break;
			default : 
		}
		
		
		
	}//main

}//class
