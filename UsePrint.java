//1.소스코드 작성
class UsePrint{
            // Java Application : 단독으로 실행가능한 프로그램.
            // main method를 정의하면 클래스는 단독으로 실행 가능해진다.
            public static void main (String[] args){
                      //print(); //출력 후 줄변경하지 않는다.
                      //println(); //출력 후 줄 변경함
                      System.out.println("안녕 자바.");
                      System.out.println("o(^^O)(O^^)o");

                      //상수출력
                      System.out.println(2020); //정수 상수
                      System.out.println(2.3); //실수 상수
                      System.out.println('j'); //문자 상수 '에는 한자만 입력가능
                      System.out.println(true); // 불린 상수 true|false
                      System.out.println("오늘은 월요일 입니다."); //문자열상수

                      //변수출력 : 변수가 가지고 있는 값을 출력한다.
                      int i=32;
                      System.out.println(i);
 
                      //객체출력 : 객체의 주소(객체가 생성된 메모리번지)가 출력된다.
                      UsePrint up=new UsePrint();
                      System.out.println( up );

                      //연산식 출력 : 연산된 결과가 출력 된다.
                      System.out.println( 2+3 );

                      //문자열과 값을 결합(+)하여 출력
                      //문자열에 + 연산자를 사용하면 연산이 아닌 붙임의 의미.
                      System.out.println("2+3="+(2+3));

                      System.out.println();
                      System.out.println("-----------------------------");
            }//main method


}//class

//2.저장 : 확장자는 java로 설정 : 클래스명.java

//3.컴파일 : javac옵션 source code 명 : javac Hello.java => Hello.class생성

//4.실행(bytecode로 실행) : java 옵션 bytecode명
// => java Hello