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

		System.out.println("��ȣ\t����\t\t����\t�����\t��ȸ��");
		for (BoardVO vo : list) {
			System.out.print(vo.getRno()+"\t");
			System.out.print(vo.getBtitle()+"\t\t");
			System.out.print(vo.getBcontent()+"\t");
			System.out.print(vo.getBdate()+"\t");
			System.out.print(vo.getBhits()+"\n");
		}
		
	}//main
	
	
}//class
