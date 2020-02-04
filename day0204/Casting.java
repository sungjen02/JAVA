/**
강제형변환 : (변경할데이터형)변수;
*/


class Casting {
	public static void main(String[] args) {
		
		byte b1 = 10;
		byte b2 = 20;
		//연산된 자동형변환된 결과를 강제형변환으로 변경
		byte result =(byte) (b1+b2);
		System.out.println(b1+ " + " + b2+ " = "+ result);

		float f=(float) 2.04;
		float f1=2.04f;
		System.out.println(f+"-"+f1);
		//강제형변환은 값손실이 발생할 수 있다.
		
		int i=(int)f;
		System.out.println(i + "," + f);

		char c='가';
		System.out.println(c + "의 Unicode 값 : " + (int) c );

		boolean b = true;
		System.out.println((int)b); //boolean은 다른형으로 강제형변환이 되지 않는다. 
		System.out.println((boolean)b);
	}//main
}//class