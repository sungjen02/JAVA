package day2018;

import java.util.Scanner;

public class ScoreMgmStaff {
	//Field
	Scanner scan = new Scanner(System.in);
	ScoreVO vo;
	
	//Constructor
	//Method
	public ScoreVO input() {
		vo = new ScoreVO();
		System.out.println("�й�>");
		vo.setStuno(scan.next());
		System.out.println("�̸�>");
		vo.setName(scan.next());
		System.out.println("����>");
		vo.setKor(scan.nextInt());
		System.out.println("����>");
		vo.setEng(scan.nextInt());
		System.out.println("����>");
		vo.setMath(scan.nextInt());
		
		return vo;
	}
	public void showAddress() {
		System.out.println(vo);
	}
}
