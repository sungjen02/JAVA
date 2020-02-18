package day2018;

public class ConstructorObject {
	//Field - 전역변수
	String name,address;
	int kor,eng,math;
	
	//Constructor - 생성자 : public 생성자명[클래스명](파라미터){ 기능 ~ }
	/*
	 * 1. 객체 생성시 호출되는 메소드
	 * 2. 생성자를 하나라도 정의하지 않은 경우에는 JVM이 컴파일 시
	 * 	  기본 생성자를 생성함 ex) public ConstructorObject(){}
	 * 3. 생성자의 오버로딩이 가능함
	 * 4. 리턴타입이 없음
	 * 5. this()를 이용하여 생성자 호출이 가능함
	 */
	public ConstructorObject() {
		this("홍길동","서울",50,50,50); //this는 항상 맨위
//		this("홍길동","서울"); // this는 하나만사용가능
//		System.out.println("기본 생성자 호출~~~!!!");
//		this.name = "홍길동";
//		this.address = "서울";
//		this.kor = 50;
//		this.eng = 50;
//		this.math = 50;
	}
	public ConstructorObject(String name, String address) {
		this(name,address,0,0,0);
//		this.name = name;
//		this.address = address;
	}
	public ConstructorObject(String name, String address, int kor, int eng, int math) {
		System.out.println("기본 생성자 호출~~~!!!");
		this.name = name;
		this.address = address;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	//Method - 메소드
	public void test() {
		System.out.println("이름 = " + name);
		System.out.println("주소 = " + address);
		System.out.println("국어 = " + kor);
		System.out.println("영어 = " + eng);
		System.out.println("수학 = " + math);
	}
}