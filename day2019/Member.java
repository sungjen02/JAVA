package day2019;

import java.util.Scanner;

public class Member {
	//Field
	//Constructor
	public Member() {}
	public Member(String name) {System.out.println(name+"������");}
	//Method
	public MemberVO input(Scanner scan) {
		MemberVO vo = new MemberVO();
		System.out.print("�̸�>");
		vo.setName(scan.next());
		System.out.print("�ּ�>");
		vo.setAddr(scan.next());
		System.out.print("����>");
		vo.setAge(scan.next());
		
		return vo;
	}
}
