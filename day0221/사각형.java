package day0221;

public class 사각형 extends 도형 {
	//Field
	String color;
	//Constructor
	public 사각형() {
		super("사각형");
		System.out.println("사각형의 기본 생성자~");
	}
	//Method
	public void getColor() {
		System.out.println(color + "색 사각형");
	}
	public void draw() {
		System.out.println("사각형을 그린다");
	}
}
