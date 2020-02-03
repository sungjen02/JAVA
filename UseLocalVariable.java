//지역변수의 사용 : method안에서 선언하고 사용하는 변수.
class UseLocalVariable{
	//java application
	public static void main(String[] args){

	//1.지역변수의 선언 : 데이터형 변수명;
	int i;
	int j;
	//2.값할당 : 변수명=값;
	i=48;
	i=4; //이전에 할당된 값은 사라진다.
	j=10;

	//3.값 사용 : (출력,연산,재할당)
	System.out.println(i);
	System.out.println(j); //초기화하지 않은 변수를 사용하면 Error.

	//변수명은 한글도 가능하다.
	int 변수;
	변수=2020;
	System.out.println(변수);

	//변수명은 숫자로 시작할 수 없다.
	//int k;

	//변수의 초기화 : 변수를 선언하면서 값을 할당하는 것.
	//할당되는 초기화 값은 연산에 영향을 끼치지 않는 값으로 주로 설정.
	//데이터형 변수명=값;
	int k=0;
	System.out.println(k);

	}//main method




}//class