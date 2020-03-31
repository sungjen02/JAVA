package s_board;

import java.util.ArrayList;

public class BoardList {
	//Field
	BoardDAO dao;
	
	//Constructor
	public BoardList(BoardDAO dao) {
		this.dao = dao;
		list();
	}
	
	public BoardList() {
		
	}
	
	//Method
	public void list() {
		ArrayList<BoardVO> list = dao.getResultList();

		System.out.println("번호\t제목\t\t내용\t등록일\t조회수");
		for (BoardVO vo : list) {
			System.out.print(vo.getRno()+"\t");
			System.out.print(vo.getBtitle()+"\t\t");
			System.out.print(vo.getBcontent()+"\t");
			System.out.print(vo.getBdate()+"\t");
			System.out.print(vo.getBhits()+"\n");
		}
		
	}//main
	
	
}//class
