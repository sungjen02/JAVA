package day0212;

public class MultiArraySumTest {

	public static void main(String[] args) {
		//1. 2차원 배열 생성
	
		
		//2. 데이터 생성
		
		int[][] marray = new int[3][3];
		for (int i = 0; i < marray.length; i++) {
			for (int j = 0; j < marray[i].length; j++) {
				marray[i][j] = (int)(Math.random()*100);
				System.out.print("["+i+"]["+j+"]=" +marray[i][j]+"\t");
			}//inner for
			System.out.println();
		}//outer for
		
		//3. 대각선 데이터 합 구하기
		int sum=0;
		for (int i = 0; i < marray.length; i++) {
			for (int j = 0; j < marray[i].length; j++) {
				if(i==j) {
					sum += marray[i][j];
				}//end if
				
			}//inner for
			
		}//outer for
		System.out.println("합계 = " + sum);
		
	}//main

}//class
