package day0221;

public class 상속테스트 {

	public static void main(String[] args) {
		도형    도형         = new 도형();
		삼각형 빨강삼각형 = new 삼각형();
		사각형 노랑사각형 = new 사각형();
		원 	     초록색원    = new 원();
		도형    노랑삼각형 = new 삼각형();

		도형.draw();
		빨강삼각형.draw();
		노랑사각형.draw();
		초록색원.draw();

		System.out.println("------------------------------------------");
		노랑삼각형.getColor();
		System.out.println(노랑삼각형.color);
		삼각형 초록삼각형 = (삼각형) 노랑삼각형;   //객체 형변환
		초록삼각형.getColor();
		System.out.println(초록삼각형.color);
		
//		삼각형 파랑삼각형 = new 도형(); //생성불가
		
		
		빨강삼각형.color="빨강";
		노랑사각형.color="노랑";
		초록색원.color="초록";
		
		빨강삼각형.getColor();
		노랑사각형.getColor();
		초록색원.getColor();
		
	}

}
