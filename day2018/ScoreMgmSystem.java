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
			
		System.out.println("��� ����Ͻðڽ��ϱ�?(y/n)");
		String check = staff.scan.next();
		if(check.equals("y") && count == list.length) {
			System.out.println("��������� �����մϴ�");
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
			
		System.out.println("��� ����Ͻðڽ��ϱ�?(y/n)");
		String check = scan.next();
		if(check.equals("y") && count == list.length) {
			System.out.println("��������� �����մϴ�");
		}else if(check.equals("y")) {
			result = true;
		}
		}
		return result;
	}
	
	
	public void showScoreList() {
		System.out.println("------------ Score List -------------");
		for (ScoreVO vo : list) {
			if(vo != null) { //�ּ� null 	int 0	 string ""
				
			System.out.println("�й� : " + vo.getStuno());
			System.out.println("�̸� : " + vo.getName());
			System.out.println("���� : " + vo.getKor());
			System.out.println("���� : " + vo.getEng());
			System.out.println("���� : " + vo.getMath());
			System.out.println("--------------------------------------");
			System.out.println("���� : " + vo.getTot());
			System.out.println("��� : " + vo.getAvg());
			System.out.println("--------------------------------------");
			}
		}
		
		
	}
}
