package day0211;

import java.util.Scanner;

public class MemberArrayTest2 {

	public static void main(String[] args) {
		//�̸�, �ּҸ� �Է¹޾� ����
		String[][] memberlist = new String[10][3];
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		
		System.out.println("************************");
		System.out.println("** ȸ����� : 1��    **");
		System.out.println("** ȸ������Ʈ : 2�� **");	
		System.out.println("** ȸ���˻� : 3��    **");	
		System.out.println("** ���� : 0��         **");		
		System.out.println("************************");
		
		while(flag) {
			System.out.println("�޴��� �������ּ���(��ȣ)>>");
			int menu = scan.nextInt();
			if(menu == 1) {
				//ȸ�����
				for (int i = 0; i < memberlist.length; i++) {
				memberlist[i] = new String[3];
				
				System.out.println("�̸�>");
				String name = scan.next();
				System.out.println("�ּ�>");
				String addr = scan.next();
				System.out.println("����>");
				String age = scan.next();
				
				for (int j = 0; j < memberlist.length; j++) {
					switch(j) {
					case 0 : memberlist[i][j]=name; break;
					case 1 : memberlist[i][j]=addr; break;
					case 2 : memberlist[i][j]=age; break;
					
					}
				}
				memberlist[i] = new String[3];
				
				System.out.println("ȸ������� ��������Ͻðڽ��ϱ�?(y/n)");
				String check = scan.next();
				if(!check.equals("y")) {
					System.out.println("ȸ������� �����մϴ�");
					i = memberlist.length;
				}//end if
				}//end for
				//flag = false;
			}else if(menu ==2) {
				//������ Ȯ��
				if(memberlist[0] == null) {
					System.out.println("ȸ�������Ͱ� ���������ʽ��ϴ�");
					System.out.println("ȸ����Ϻ��� �������ּ���");
				}else {
				//ȸ������Ʈ ���
				System.out.println("-----------------------------------------------------");
				System.out.println("��ȣ\t\t�̸�\t\t�ּ�\t\t����");
				System.out.println("-----------------------------------------------------");
				for (int i = 0; i < memberlist.length; i++) {
					//�ش� �ε����� �̸��� �ִ��� üũ
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
//				//ȸ���˻�
//				System.out.println("�˻����̸��� �Է����ּ���.");
//				System.out.println("�˻� >");
//				String sname = scan.next();
//				int index = 0;
//				for (int i = 0; i < memberlist.length; i++) {
//					if(memberlist[i].equals(sname)) {
//						index  = i;
//						i = memberlist.length;
//					}
//				}
//				System.out.println("-----------------------------------------------------");
//				System.out.println("�̸�\t\t�ּ�\t\t����");
//				System.out.println("-----------------------------------------------------");
//				System.out.print(memberlist[index]+"\t");
//				System.out.print(memberlist[index]+"\t\t");
//				System.out.println(memberlist[index]);
//				System.out.println("-----------------------------------------------------");
				
			}else if(menu == 0) {
				//����
				flag=false;
		
			}else {
				//�޴� �缱��
				System.out.println("�޴��� �ٽ� ������ �ּ���");
			}
		}//end while
		System.out.println("== ȸ������ ���α׷��� ����Ǿ����ϴ�.==");
	}//end main

}//end class