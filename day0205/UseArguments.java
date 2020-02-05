/**
main method에 외부 값 입력.
*/



class UseArguments{
	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(args[1]+args[2]);
		//int i = (int)args[1]; //참조형데이터형(String)은 기본형(int)로
		//변경될 수 없다.
		//Wrapper class를 사용하면 문자열(String)을 기본형데이터형으로
		//변환할 수 있다.

		int i = Integer.parseInt(args[1]);
		int j = Integer.parseInt(args[2]);
		System.out.println( i + j );

		double d = Double.parseDouble(args[3]);
		System.out.println( d );

	}//main
}//class

