package day0207;


/**
 * 다중 for
 * @author sist
 */

public class TestFor2 {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			for(int j= 0; j < 6; j++) {
				
				System.out.println("i=" + i + ",j=" + j);
			}//end for
			System.out.println("-----------------------");
		}//end for
		
		/////
		for(int i = 2; i < 10; i++) {//단
			System.out.println(i + " 단 ");
			for(int j = 1; j < 10; j++) {//수
				System.out.println(i + " * " + j + " = " + i * j );
				
				
			}
			System.out.println("-------------------------");
			///
			
			for(int k = 0; k < 4; k++) {

				for(int j = 0; j <= k; j++) {
					System.out.print(k);
					System.out.print(j);
			
				}
				System.out.println(" ");
			}
		}
		System.out.println("-------------------");
		
		for(int i = 0; i < 5; i++) {
			for(int j = i+1; j < 6 ; j++) {
				System.out.print(i+" "+j+" ");
				
			}			
			System.out.println();
			
			//////////////////// 무한 loop
			
//			for( ; ; ) {
//				System.out.println("무한 loop");
//
//			}//end for
//		for (int j = 0 ; ; j++) {
//			System.out.println("무한 loop" + i);
//		}
		}
		//continue : 반복문의 실행을 건너 뛸때. 조건문과 같이 사용.
		//0~100까지 짝수만 출력
		for(int i=0; i < 100; i+=2) {
			if(i % 2 == 1) {
				continue; //아랫줄의 코드를 건너뛴다.
			}
			System.out.println(i);
			
		}//end for
		
	}//main

}//class
