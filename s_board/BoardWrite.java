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
		//제목, 내용
		System.out.println("제목>");
		String title = scan.next();
		System.out.println("내용>");
		String content = scan.next();
		
		//DB에 저장
		BoardVO vo = new BoardVO();
		vo.setBtitle(title);
		vo.setBcontent(content);
		
		int result = dao.getResultInsert(vo);

		if(result != 0) System.out.println("성공");
		else System.out.println("실패");
		
		
//		System.out.println("title :" + title);
//		System.out.println("content :" + content);
//		
	}
}
