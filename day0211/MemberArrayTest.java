package day0211;

import java.util.Scanner;

public class MemberArrayTest {

	public static void main(String[] args) {
		//이름, 주소를 입력받아 저장
		String[] namelist = new String[10];
		String[] addrlist = new String[10];
		int[] agelist = new int[10];
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		
		System.out.println("************************");
		System.out.println("** 회원등록 : 1번    **");
		System.out.println("** 회원리스트 : 2번 **");	
		System.out.println("** 회원검색 : 3번    **");	
		System.out.println("** 종료 : 0번         **");		
		System.out.println("************************");
		
		while(flag) {
			System.out.println("메뉴를 선택해주세요(번호)>>");
			int menu = scan.nextInt();
			if(menu == 1) {
				//회원등록
				for (int i = 0; i < namelist.length; i++) {
					
				System.out.println("이름>");
				namelist[i]  = scan.next();
				System.out.println("주소>");
				addrlist[i] = scan.next();
				System.out.println("나이>");
				agelist[i] = scan.nextInt();
				
				System.out.println("회원등록을 계속진행하시겠습니까?(y/n)");
				String check = scan.next();
				if(!check.equals("y")) {
					System.out.println("회원등록을 종료합니다");
					i = namelist.length;
				}//end if
				}//end for
				//flag = false;
			}else if(menu ==2) {
				//데이터 확인
				if(namelist[0] == null) {
					System.out.println("회원데이터가 존재하지않습니다");
					System.out.println("회원등록부터 진행해주세요");
				}else {
				//회원리스트 출력
				System.out.println("-----------------------------------------------------");
				System.out.println("번호\t\t이름\t\t주소\t\t나이");
				System.out.println("-----------------------------------------------------");
				for (int i = 0; i < namelist.length; i++) {
					//해당 인덱스의 이름이 있는지 체크
					if(namelist[i] == null) {
						i = namelist.length;
						
					}else {
					System.out.print(i+1+"\t\t");
					System.out.print(namelist[i]+"\t");
					System.out.print(addrlist[i]+"\t\t");
					System.out.println(agelist[i]);
				}
				}
				}
			}else if(menu == 3) {
				//회원검색
				System.out.println("검색할이름을 입력해주세요.");
				System.out.println("검색 >");
				String sname = scan.next();
				int index = 0;
				for (int i = 0; i < namelist.length; i++) {
					if(namelist[i].equals(sname)) {
						index  = i;
						i = namelist.length;
					}
				}
				System.out.println("-----------------------------------------------------");
				System.out.println("이름\t\t주소\t\t나이");
				System.out.println("-----------------------------------------------------");
				System.out.print(namelist[index]+"\t");
				System.out.print(addrlist[index]+"\t\t");
				System.out.println(agelist[index]);
				System.out.println("-----------------------------------------------------");
				
			}else if(menu == 0) {
				//종료
				flag=false;
		
			}else {
				//메뉴 재선택
				System.out.println("메뉴를 다시 선택해 주세요");
			}
		}//end while
		System.out.println("== 회원관리 프로그램이 종료되었습니다.==");
	}//end main

}//end class
