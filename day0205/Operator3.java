/**
	쉬프트연산자
	<< : 비트를 왼쪽으로 밀고 밀어서 빈칸을 항상 0으로 채운다.
	>> : 비트를 오른쪽을 밀고 밀어서 빈칸을 최상위 부호비트에 따라 
		    양수면 0을 음수면 1을 채운다.
	>>> : 비트를 오른쪽으로 밀고 밀어서 빈칸을 항상 0으로 채운다.
*/



class Operator3{

	public static void main(String[] args) {

	int i = 9;
	System.out.println(i + " << 4 = " + (i << 4));
	i = 27;
	System.out.println(i + " >> 3 = " + (i >> 3));
	i = 100;
	System.out.println(i + " >>> 2 = " + (i >>> 2));


	i = 1;
	System.out.println(i  << 31);
	i = -1;
	System.out.println(i >> 1); //부호 유지
	System.out.println(i >>> 1); //양수만


		
	}//main
}//class
