package day0207;

/**
 * switch~case : ��ġ�ϴ� ������ ���� ��<br>
 * ����)switch(������){<br>
 * 			case ��� : ���๮���; break;
 * 			.<br>
 * 			.<br>
 * 			default : ���๮��;<br>
 * 			}
 * @author sist
 */
public class TestSwitchCase {

	public static void main(String[] args) {
		
		int temp=2;
		
		switch(temp) {
		case 0 : System.out.println("0�ΰ���� ���� �ڵ�");
		case 1 : System.out.println("1�ΰ���� ���� �ڵ�"); break;
		case 2 : System.out.println("2�ΰ���� ���� �ڵ�");
		case 3 : System.out.println("3�ΰ���� ���� �ڵ�"); break;
		default : System.out.println("������ ��ġ�ϴ� ����� ���� �������ڵ�");
		}//end switch
		
		char flag ='A'; //byte, short, int
		switch(flag) { //long�� ��� �Ұ���
		//case�� ����� switch�� �ԷµǴ� ���������� ������ �� �ִ�.
		case 0 : System.out.println("0"); break;
		case 1 : System.out.println("1"); break;
		case 'A' : System.out.println("2"); break;
		default : System.out.println("�׿�"); break;
		}//end switch
		
		 // JDK1.7���� ���ʹ� ���ڿ��� �� ����
		String lang="assembly";
		switch (lang) {
		case "java": System.out.println("�Ϻ��� OOP���"); break; 
		case "assembly": System.out.println("����"); break; 
		
		default: System.out.println("�غ�� ��� ����");
		}//switch
		
	}//main

}//class
