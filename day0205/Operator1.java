/**
	단항연산자
	~, !, +, -, ++, --
*/




class Operator1 {
	public static void main(String[] args) {
		
		
		int i = 10;
		int j = -10;
		// ~ : 1의 보수연산. ~양수 : 부호변경 1증가, ~음수 : 부호변경 1감소


		System.out.println("~" + i + " = " + ~i ); // -11
		System.out.println("~" + j + " = " + ~j ); //  9

		//! : true = false, false -> true 
		boolean b = true, c = false;
		System.out.println("!" + b + " = " + !b); // false
		System.out.println("!" + c + " = " + !c); // false
		System.out.println( !(3 > 2) );


		// + : 형식적인 제공 
		System.out.println("+" + i + " = " + +i);
		System.out.println("+" + j + " = " + +j);


		//- : 2의 보수연산, 부호바꿈연산
		System.out.println("-" + i + " = " + -i); //-10
		System.out.println("-" + j + " = " + -j); // 10

		// ++ : 증가연산자 (대상체의 값을 1씩 증가)
		//  --  : 감소연산자 (대상체의 값을 1씩 감소)

		i = 0;
		j = 10;

		//전위 : 연산자 대상체;
		++i; // 0 -> 1
		--j; // 10 -> 9
		System.out.println("전위연산 i : " + i + ", j= " + j);
		//후위 대상체 연산자

		i++; // 1 -> 2
		j--; // 9 -> 8
		System.out.println("후위연산 i : " + i + ", j= "+ j);
		// ++, -- 대입연산자와 같이 사용되면 전위와 후위는 다른 값을 대입
		// 전위 : 내것 먼저 ( 연산 수행 후 대입)
		
		int result = ++i;
		System.out.println("전위 result : " + result + ", i : " + i);

		result = 0;
		//후위 : 남의 것먼저

		result = i++;
		System.out.println("후위 result : " + result + ", i : " + i);

	


	}//main
}//class
