package day0221;

public class 삼각형 extends 도형 {
	//Field
	String color = "보라";
	//Constructor
	public 삼각형() {
//		new 도형("삼각형");
		super("삼각형");
		System.out.println("삼각형의 기본 생성자 호출~");
	}
	//Method
	public void draw() {
		System.out.println("삼각형을 그린다");
	}
//	public void getColor() {
//		System.out.println(color + "색 삼각형");
//	}
}
