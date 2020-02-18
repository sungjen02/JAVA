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
		System.out.println("학번>");
		vo.setStuno(scan.next());
		System.out.println("이름>");
		vo.setName(scan.next());
		System.out.println("국어>");
		vo.setKor(scan.nextInt());
		System.out.println("영어>");
		vo.setEng(scan.nextInt());
		System.out.println("수학>");
		vo.setMath(scan.nextInt());
		
		return vo;
	}
	public void showAddress() {
		System.out.println(vo);
	}
}
