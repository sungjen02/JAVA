package day0211;

import java.util.Scanner;

public class MemberArrayTest {

	public static void main(String[] args) {
		//�̸�, �ּҸ� �Է¹޾� ����
		String[] namelist = new String[10];
		String[] addrlist = new String[10];
		int[] agelist = new int[10];
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
				for (int i = 0; i < namelist.length; i++) {
					
				System.out.println("�̸�>");
				namelist[i]  = scan.next();
				System.out.println("�ּ�>");
				addrlist[i] = scan.next();
				System.out.println("����>");
				agelist[i] = scan.nextInt();
				
				System.out.println("ȸ������� ��������Ͻðڽ��ϱ�?(y/n)");
				String check = scan.next();
				if(!check.equals("y")) {
					System.out.println("ȸ������� �����մϴ�");
					i = namelist.length;
				}//end if
				}//end for
				//flag = false;
			}else if(menu ==2) {
				//������ Ȯ��
				if(namelist[0] == null) {
					System.out.println("ȸ�������Ͱ� ���������ʽ��ϴ�");
					System.out.println("ȸ����Ϻ��� �������ּ���");
				}else {
				//ȸ������Ʈ ���
				System.out.println("-----------------------------------------------------");
				System.out.println("��ȣ\t\t�̸�\t\t�ּ�\t\t����");
				System.out.println("-----------------------------------------------------");
				for (int i = 0; i < namelist.length; i++) {
					//�ش� �ε����� �̸��� �ִ��� üũ
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
				//ȸ���˻�
				System.out.println("�˻����̸��� �Է����ּ���.");
				System.out.println("�˻� >");
				String sname = scan.next();
				int index = 0;
				for (int i = 0; i < namelist.length; i++) {
					if(namelist[i].equals(sname)) {
						index  = i;
						i = namelist.length;
					}
				}
				System.out.println("-----------------------------------------------------");
				System.out.println("�̸�\t\t�ּ�\t\t����");
				System.out.println("-----------------------------------------------------");
				System.out.print(namelist[index]+"\t");
				System.out.print(addrlist[index]+"\t\t");
				System.out.println(agelist[index]);
				System.out.println("-----------------------------------------------------");
				
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
