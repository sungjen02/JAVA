/**
	삼항(조건)연산자
	? :
*/



class Operator6 {
	public static void main(String[] args) {
	
	// 조건식 ? 항1 : 항2
	int i = 10;
	System.out.println(i + "은(는)" + (i  >= 0? " 양수" : " 음수")  );

	//
	int year =  2020;
	int birth = 1994;
	int age = year-birth+1;
	//나이가 20살 이상 이라면 으른, 그렇지않다면 "미성년" 출력

	System.out.println(age + "살은" + (age >= 20? "어른" : "미성년") );
	}
}
