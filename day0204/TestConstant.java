/**
		다른 클래스에 존재하는 Constant 사용하는 클래스
*/


class TestConstant {
	public static void main(String[] args) {
		System.out.println(Constant.MAX_SCORE);
		System.out.println("Byte 의 최소값 : " + Byte.MIN_VALUE
			+ ", Byte의 최대값 : " + Byte.MAX_VALUE);

		//진수 : 변수에는 2진수로 저장되고
		int i=10; //10진수
		int j=017; //8진수
		int k=0x10; //16진수
		//출력하면 10진수로 출력된다.
		System.out.println(i + " +" + j +" + " + k + "=" + (i + j +k));

		int t=48;


		System.out.println(Integer.toBinaryString(t));
		System.out.println(Integer.toOctalString(t));
		System.out.println(Integer.toHexString(t));
	}//main
}//class
