package s_board;

import java.util.Scanner;

public class BoardWrite {
	//Field
	Scanner scan;
	BoardDAO dao;
	
	//Constructor
	public BoardWrite(Scanner scan, BoardDAO dao) {
		this.scan = scan;
		this.dao = dao;
		write();
	}
	public BoardWrite() {
		
	}
	//Method
	public void write() {
		//����, ����
		System.out.println("����>");
		String title = scan.next();
		System.out.println("����>");
		String content = scan.next();
		
		//DB�� ����
		BoardVO vo = new BoardVO();
		vo.setBtitle(title);
		vo.setBcontent(content);
		
		int result = dao.getResultInsert(vo);

		if(result != 0) System.out.println("����");
		else System.out.println("����");
		
		
//		System.out.println("title :" + title);
//		System.out.println("content :" + content);
//		
	}
}
