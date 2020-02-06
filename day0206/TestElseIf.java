package day0206;



/**
 * else~if (다중 if) : 연관된 여러 조건을 비교할 때 사용
 * @author sist
 */
public class TestElseIf {

	public static void main(String[] args) {

		//입력받은 점수에 유효성 검증 : 0보다 작거나, 100보다 크다면 상황에
		//맞게 실패메세지를 출력하고 그렇지 않다면 성공과 함께 점수를 출력
		
		int score = 110;
		System.out.println(score + "점은");
		if(score < 0) {
			System.out.println("0보다 작을 수 없습니다.");
		}else if(score > 100) {
			System.out.println("100보다 클 수 없습니다.");
		}else {
			System.out.println("올바른 점수 입니다.");
		}//end else
		
		//태어난해로 띠 구하기
		int birth = 1994;
		int zodiacFlag= birth % 12;
		//원숭이,닭,개,돼지,쥐,소,호랑이,토끼,용,뱀,말,양
		
		if(zodiacFlag == 0){
			System.out.println("원숭이띠");
		
		}else if(zodiacFlag == 1){
			System.out.println("닭");
		}else if(zodiacFlag == 2){
			System.out.println("개");
		}else if(zodiacFlag == 3){
			System.out.println("돼지");
		}else if(zodiacFlag == 4){
			System.out.println("쥐");
		}else if(zodiacFlag == 5){
			System.out.println("소");
		}else if(zodiacFlag == 6){
			System.out.println("호랑이");
		}else if(zodiacFlag == 7){
			System.out.println("토끼");
		}else if(zodiacFlag == 8){
			System.out.println("용");
		}else if(zodiacFlag == 9){
			System.out.println("뱀");
		}else if(zodiacFlag == 10){
			System.out.println("말");
		}else if(zodiacFlag == 11){
			System.out.println("양");
		}
	}//main

}//class