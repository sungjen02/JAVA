package day0207;


/**
 * for : ���۰� ���� �� �� ����ϴ� �ݺ���<br>
 * for(�ʱⰪ; ���ǽ�; ��.���ҽ�){<br>
 *  �ݺ����๮���;<br>
 *  }
 * @author sist
 */
public class TestFor {

	public static void main(String[] args) {
		
		for(int i= 0; i< 10; i++) {
		System.out.print("�ȳ��ϼ���?" + i);
		}//end for
		
		//1~9���� ���
		// ���� �Է¹޾� �Է��� ���� �������� ���. ��, �������� 2~9�ܱ���
		//�϶��� ���� ���
		int num = Integer.parseInt(args[0]);
		
		if(num>1 && num <10) {
		
		for(int i =1; i < 10; i++) {
			System.out.println(num+ "x" + i +" "+ "="+  (num * i));
		}
		}else {
			System.out.println("�Է��Ͻ� ���ڴ� 2~9�� �ƴմϴ�");
		}
		//�빮�� A~Z���� ���
				
		for(char i ='A'; i <= 'Z'; i++ ) {
			
			System.out.print(" " + i);
		}
		
		for(char i= 65; i <91; i++) {
			System.out.print(i);
		}//end for
		
		
		//0 �������� 65535���� �ݺ���Ű�鼭 ���� 0~9, ������ �ҹ���, �����ڴ빮�ڸ� ���
		System.out.println("-----");
		System.out.println((int)'0' + " " + (int)'9' + " " + (int)'A' + " " + (int)'Z' + " " + (int)'a' + " " + (int)'z');
		for (int i = 0; i < 65536; i++) {
			//if((i>='0' && i<='9') || (i >= 'A' && i <= 'Z') ||
					//(i>='a' && i<='z')) {
			if((i > 47 && i < 58) || (i > 64 && i < 91) || (i > 96 && i < 123)) {
				
				System.out.println((char)i+"");
		
			
			}//end if
		
	
	}//end for
		
		
	}//main

}//class
