package day0210;

public class StringTest {

	public static void main(String[] args) {
		String str = "�ȳ��ϼ���";
		String str2 = new String("�ȳ��ϼ���");
		
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str == str2);
		System.out.println(str.equals(str2));

	}//main

}//class
