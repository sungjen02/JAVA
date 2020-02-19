package day2019;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberSystem {
	//Field
	Scanner scan = new Scanner(System.in);
	MemberVO vo;
	Member member;
	String[] namelist = {"홍길동","공유"};
	int count = 0;
//	MemberVO[] memberList = new MemberVO[2];
	ArrayList<MemberVO> memberList = new ArrayList<MemberVO>(2);
	
	//Constructor
	public MemberSystem() {
		showMenu();
		choiceMenu();
	}
	public MemberSystem(Member member) {
		this.member = member;
		showMenu();	
		choiceMenu(member);
	}
	//Method
	public void showMenu() {
		System.out.println("************************");
		System.out.println("** 회원 등록 : 1번 **");
		System.out.println("** 회원 리스트 : 2번 **");
		System.out.println("** 회원 검색 : 3번 **");
		System.out.println("** 종료 : 0번 **");
		System.out.println("************************");
	}
	public void choiceMenu() {
		System.out.println("메뉴를 선택해주세요(번호)>");
		int menu = scan.nextInt();
		switch(scan.nextInt()) {
		
		case 1 : register(); break;
		case 2 : list(); break;
		case 3 : search(); break;
		case 0 : exit(); break;
		default : System.out.println("준비중 입니다");break;
		}
	}
	public void choiceMenu(Member member) {
		System.out.println("메뉴를 선택해주세요(번호)>");
		int menu = scan.nextInt();
		switch(scan.nextInt()) {
		
		case 1 : register(member); break;
		case 2 : list(member); break;
		case 3 : search(); break;
		case 0 : exit(); break;
		default : System.out.println("준비중 입니다");break;
		}
	}
	
	public void register() {
//		Member member = new Member("홍길동");
//		MemberVO vo = member.input(scan);
//		memberList[0] = vo;
//		if(count < memberList.length) {
//			memberList[count] = new Member(namelist[count]).input(scan);
		memberList.add(new Member().input(scan));
			System.out.println("등록완료");
//			count++;
		System.out.println("계속 등록하시겠습니까?(y/n)");
		String check = scan.next();
		if(check.equals("y")) {
		register();
		}
//		if(check.equals("y") && count == memberList.length) {
//			System.out.println("저장 공간이 부족합니다");
//		}else if(check.equals("y")) {
//			register();
//		}
//		}else {
//			System.out.println("저장 공간이 부족합니다");
//		}
		choiceMenu();
	}
	public void register(Member member) {
		this.vo = member.input(scan);
		System.out.println("등록");
		choiceMenu(member);
	}
	public void list() {
		System.out.println("출력");
		System.out.println("----------------------------------");
		System.out.println("번호\t이름\t주소\t나이");
		System.out.println("----------------------------------");
//		for (int i = 0; i < memberList.length; i++) {
//			MemberVO vo = memberList[i];
//			if(vo != null) {
//				System.out.print((i+1) + "\t");
//				System.out.print(vo.getName()+"\t");
//				System.out.print(vo.getAddr()+"\t");
//				System.out.print(vo.getAge()+"\n");
//			}
//		}
		int ncount = 1;
		for (MemberVO vo : memberList) {
			if(vo != null) {
			System.out.print(ncount + "\t");
			System.out.print(vo.getName()+"\t");
			System.out.print(vo.getAddr()+"\t");
			System.out.print(vo.getAge()+"\n");
			}
			ncount++;
		}
		System.out.println("----------------------------------");
		choiceMenu();
	}
	public void list(Member member) {
		System.out.println("출력");
		System.out.println("----------------------------------");
		System.out.println("이름\t주소\t나이");
		System.out.println("----------------------------------");
		System.out.print(vo.getName()+"\t");
		System.out.print(vo.getAddr()+"\t");
		System.out.print(vo.getAge()+"\n");
		System.out.println("----------------------------------");
		choiceMenu(member);
	}
	public void search() {
		System.out.println("검색");
		choiceMenu();
	}
	public void exit() {
		System.out.println("종료");
		System.exit(0);
	}
}