package day0210;

import java.util.Scanner;
/**
 * Ŀ�� �ֹ� : �Ƹ޸�ī��, ��,  ��ī, ������ġ��
 * @author sist
 */
public class ScannerTest4 {
	//Field
	public static final String AMERICANO = "�Ƹ޸�ī��";
	public static final String LATTE = "��";
	public static final String MOCHA = "��ī";
	public static final String ICE_AMERICANO = "���̽� �Ƹ޸�ī��";



	public static void main(String[] args) {
		//Ŀ�� �޴�
		System.out.println("****************************************************");
		System.out.println("**                       menu                         **");
		System.out.println("** 1. �Ƹ޸�ī�� 2. �� 3. ��ī 4. ������ġ�� **");
		System.out.println("****************************************************");
		
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		String choiceMenu = "";
		while(flag) {
		System.out.println("�޴� ��ȣ�� �������ּ��� >");
		int menu = scan.nextInt();
	
			
		switch(menu) {
		case 1 : choiceMenu = AMERICANO; flag = false; break;
		case 2 : choiceMenu = LATTE; flag = false; break;
		case 3 : choiceMenu = MOCHA; flag = false; break;
		case 4 : choiceMenu = ICE_AMERICANO; flag = false; break;
		default : System.out.println("�غ����� �޴� �Դϴ�");
		
		}//end switch
		}//end while
		System.out.println("�����Ͻ� �޴� : " + choiceMenu);
	}//main

}//class
