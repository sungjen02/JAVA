package day0210;

public class StringTest {

	public static void main(String[] args) {
		String str = "æ»≥Á«œººø‰";
		String str2 = new String("æ»≥Á«œººø‰");
		
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str == str2);
		System.out.println(str.equals(str2));

	}//main

}//class
