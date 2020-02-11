package day0211;

import java.util.Scanner;

public class MemberArrayTest2 {

	public static void main(String[] args) {
		//이름, 주소를 입력받아 저장
		String[][] memberlist = new String[10][3];
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
				for (int i = 0; i < memberlist.length; i++) {
				memberlist[i] = new String[3];
				
				System.out.println("이름>");
				String name = scan.next();
				System.out.println("주소>");
				String addr = scan.next();
				System.out.println("나이>");
				String age = scan.next();
				
				for (int j = 0; j < memberlist.length; j++) {
					switch(j) {
					case 0 : memberlist[i][j]=name; break;
					case 1 : memberlist[i][j]=addr; break;
					case 2 : memberlist[i][j]=age; break;
					
					}
				}
				memberlist[i] = new String[3];
				
				System.out.println("회원등록을 계속진행하시겠습니까?(y/n)");
				String check = scan.next();
				if(!check.equals("y")) {
					System.out.println("회원등록을 종료합니다");
					i = memberlist.length;
				}//end if
				}//end for
				//flag = false;
			}else if(menu ==2) {
				//데이터 확인
				if(memberlist[0] == null) {
					System.out.println("회원데이터가 존재하지않습니다");
					System.out.println("회원등록부터 진행해주세요");
				}else {
				//회원리스트 출력
				System.out.println("-----------------------------------------------------");
				System.out.println("번호\t\t이름\t\t주소\t\t나이");
				System.out.println("-----------------------------------------------------");
				for (int i = 0; i < memberlist.length; i++) {
					//해당 인덱스의 이름이 있는지 체크
					if(memberlist[i] == null) {
						i = memberlist.length;
						
					}else {
						System.out.print(i+1+"\t");
						for (int j = 0; j < memberlist.length; j++) {
							
					System.out.print(memberlist[i][j]+"\t");

						}
						System.out.println();
				}
				}
				System.out.println("-----------------------------------------------");
			}
//			}else if(menu == 3) {
//				//회원검색
//				System.out.println("검색할이름을 입력해주세요.");
//				System.out.println("검색 >");
//				String sname = scan.next();
//				int index = 0;
//				for (int i = 0; i < memberlist.length; i++) {
//					if(memberlist[i].equals(sname)) {
//						index  = i;
//						i = memberlist.length;
//					}
//				}
//				System.out.println("-----------------------------------------------------");
//				System.out.println("이름\t\t주소\t\t나이");
//				System.out.println("-----------------------------------------------------");
//				System.out.print(memberlist[index]+"\t");
//				System.out.print(memberlist[index]+"\t\t");
//				System.out.println(memberlist[index]);
//				System.out.println("-----------------------------------------------------");
				
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