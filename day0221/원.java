package day0221;

public class 원 extends 도형{
	//Field
	String color;
	//Constructor
	public 원() {
		super("원");
		System.out.println("원의 기본 생성자~");
	}
	//Method
	public void getColor() {
		System.out.println(color + "색 원");
	}
	public void draw() {
		System.out.println("원형을 그린다");
	}
}
