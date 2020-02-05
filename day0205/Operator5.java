/**
	논리연산자 
	일반논리 : 여러개의 관계연산자를 묶어서 비교할 때
	  && , ||

	비트논리 : 비트를 연산
	  &, |, ^
*/


class Operator5 {
	public static void main(String[] args) {
		
	//일반논리 
	// &&(AND) : 전항과 후항이 모두 참일 때 참반환
	//System.out.println( 5 > 2 && 10 < 100);
	boolean flag1 = true, flag2 = false, flag3 = true, flag4 = false;

	System.out.println("------------------- && --------------------");
	System.out.println( flag1 + "&&" + flag3 + " = " + (flag1 && flag3)); //true
	System.out.println( flag1 + "&&" + flag2 + " = " + (flag1 && flag2)); //false
	//전항이 거짓이면 후항을 계산하지 않는다.
	System.out.println( flag2 + "&&" + flag1 + " = " + (flag2 && flag1)); //false
	System.out.println( flag2 + "&&" + flag3 + " = " + (flag2 && flag4)); //false
	//전항과 후항이 모두 false 일때만 false
	
	System.out.println("-------------------- || ---------------------");
	System.out.println( flag1 + "||" + flag3 + " = " + (flag1 || flag3)); //true
	System.out.println( flag1 + "||" + flag2 + " = " + (flag1 || flag2)); //true
	//전항이 true이면 후항을 계산하지 않는다.
	System.out.println( flag2 + "||" + flag1 + " = " + (flag2 || flag1)); //true
	System.out.println( flag2 + "||" + flag3 + " = " + (flag2 || flag4)); //false
	//

	boolean temp1 = false, temp2 = false, result = false;
	result = (temp1 = 3 > 2)  &&(temp2 = 3>2);
	System.out.println(temp1 + "," + temp2 + "," + result);
	
	//비트논리
	// &(AND) : 상위비트와 하위비트 모두 1인경우 1내림
	// | (OR) : 상위비트와 하위비트 모두 0인경우 0내림
	// ^ (XOR) : 상위비트와 하위비트 둘중 하나만 1인경우 1내림
	
	int i = 19, j = 25;

	System.out.println(i+" & " + j + " = " + ( i & j ) );
	System.out.println(i+" | " + j + " = " + ( i | j ) );
	System.out.println(i+" ^ " + j + " = " + ( i ^ j ) );

	}//main
}//class
