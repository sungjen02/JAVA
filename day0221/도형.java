package day0221;

public class 도형 {
	//Field
	String color = "검은";
	String name;
	//Constructor
	public 도형() {
		System.out.println("도형의 기본 생성자 호출~");
	}
	public 도형(String name) {
		System.out.println(name + "도형의 기본 생성자 호출~");
	}
	//Method
	public void getColor() {
		System.out.println(color + "색 도형");
	}
	public void draw() {
		System.out.println("도형을 그린다");
	}
}
