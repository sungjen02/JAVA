package day2018;

import java.util.Scanner;

public class ScoreMgmSystem {
	//Field
//	ScoreVO vo;
	ScoreVO[] list = new ScoreVO[2];
	int count = 0;
//	Scanner scan = new Scanner(System.in);
	//Constructor
	//Method
	public void scoreRegister(ScoreMgmStaff staff) {
//		boolean result = false;
		if(count < list.length) {
			list[count] = staff.input();
			count++;		
			
		System.out.println("계속 등록하시겠습니까?(y/n)");
		String check = staff.scan.next();
		if(check.equals("y") && count == list.length) {
			System.out.println("저장공간이 부족합니다");
		}else if(check.equals("y")) {
//			result = true;
			scoreRegister(staff);
		}
		}
//		return result;
	}
	
	public boolean scoreRegister(ScoreVO vo, Scanner scan) {
		boolean result = false;
		if(count < list.length) {
			list[count] = vo;
			count++;		
			
		System.out.println("계속 등록하시겠습니까?(y/n)");
		String check = scan.next();
		if(check.equals("y") && count == list.length) {
			System.out.println("저장공간이 부족합니다");
		}else if(check.equals("y")) {
			result = true;
		}
		}
		return result;
	}
	
	
	public void showScoreList() {
		System.out.println("------------ Score List -------------");
		for (ScoreVO vo : list) {
			if(vo != null) { //주소 null 	int 0	 string ""
				
			System.out.println("학번 : " + vo.getStuno());
			System.out.println("이름 : " + vo.getName());
			System.out.println("국어 : " + vo.getKor());
			System.out.println("영어 : " + vo.getEng());
			System.out.println("수학 : " + vo.getMath());
			System.out.println("--------------------------------------");
			System.out.println("총점 : " + vo.getTot());
			System.out.println("평균 : " + vo.getAvg());
			System.out.println("--------------------------------------");
			}
		}
		
		
	}
}
