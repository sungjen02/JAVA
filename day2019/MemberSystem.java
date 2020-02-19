package day2019;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberSystem {
	//Field
	Scanner scan = new Scanner(System.in);
	MemberVO vo;
	Member member;
	String[] namelist = {"ȫ�浿","����"};
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
		System.out.println("** ȸ�� ��� : 1�� **");
		System.out.println("** ȸ�� ����Ʈ : 2�� **");
		System.out.println("** ȸ�� �˻� : 3�� **");
		System.out.println("** ���� : 0�� **");
		System.out.println("************************");
	}
	public void choiceMenu() {
		System.out.println("�޴��� �������ּ���(��ȣ)>");
		int menu = scan.nextInt();
		switch(scan.nextInt()) {
		
		case 1 : register(); break;
		case 2 : list(); break;
		case 3 : search(); break;
		case 0 : exit(); break;
		default : System.out.println("�غ��� �Դϴ�");break;
		}
	}
	public void choiceMenu(Member member) {
		System.out.println("�޴��� �������ּ���(��ȣ)>");
		int menu = scan.nextInt();
		switch(scan.nextInt()) {
		
		case 1 : register(member); break;
		case 2 : list(member); break;
		case 3 : search(); break;
		case 0 : exit(); break;
		default : System.out.println("�غ��� �Դϴ�");break;
		}
	}
	
	public void register() {
//		Member member = new Member("ȫ�浿");
//		MemberVO vo = member.input(scan);
//		memberList[0] = vo;
//		if(count < memberList.length) {
//			memberList[count] = new Member(namelist[count]).input(scan);
		memberList.add(new Member().input(scan));
			System.out.println("��ϿϷ�");
//			count++;
		System.out.println("��� ����Ͻðڽ��ϱ�?(y/n)");
		String check = scan.next();
		if(check.equals("y")) {
		register();
		}
//		if(check.equals("y") && count == memberList.length) {
//			System.out.println("���� ������ �����մϴ�");
//		}else if(check.equals("y")) {
//			register();
//		}
//		}else {
//			System.out.println("���� ������ �����մϴ�");
//		}
		choiceMenu();
	}
	public void register(Member member) {
		this.vo = member.input(scan);
		System.out.println("���");
		choiceMenu(member);
	}
	public void list() {
		System.out.println("���");
		System.out.println("----------------------------------");
		System.out.println("��ȣ\t�̸�\t�ּ�\t����");
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
		System.out.println("���");
		System.out.println("----------------------------------");
		System.out.println("�̸�\t�ּ�\t����");
		System.out.println("----------------------------------");
		System.out.print(vo.getName()+"\t");
		System.out.print(vo.getAddr()+"\t");
		System.out.print(vo.getAge()+"\n");
		System.out.println("----------------------------------");
		choiceMenu(member);
	}
	public void search() {
		System.out.println("�˻�");
		choiceMenu();
	}
	public void exit() {
		System.out.println("����");
		System.exit(0);
	}
}