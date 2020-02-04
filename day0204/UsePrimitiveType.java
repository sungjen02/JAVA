/**
기본형데이터형의 사용
 정수 : byte, short, int, long
 문자 : char
 실수 : float, double
 불린 : boolean
*/


class UsePrimitiveType{

	public static void main(String[] args) {
		//음수~양수를 저장 할 수 있다. signed valule
		byte a=10;
		short b=10;
		int c =10;
		long d=10; //literal이 4byte 이내라면 형명시를 생략 할 수 있다.
		long f=2147483648L; // 4byte 이상인경우 형명시 필수

		System.out.println("byte : "+a+", short : "+b +", int : "+
			c+", long : "+d+","+f);
		//char 형에는 Unicode 값이 할당되며 음수는 저장하지 못한다.
		//unsigned value
		char g='A';
		char h='가';
		char i='0';
		System.out.println("char : "+g+","+h+","+i);
		
		float j=3.14f; // 형명시 필수
		double k=3.14D; //형명시 생략가능
		System.out.println("float : "+j+", double : "+k);

		boolean I=true;
		boolean m=false;
		System.out.println("boolean : "+I+", "+m);
		
		//
		byte b=10;
		byte b1=20;
		int result=b1+b2;
		System.out.println(b+"+"+b1+"="+result);

	}//main
}//class