package day0211;

public class MultiArrayTest {

	public static void main(String[] args) {
//		int[][] numlist = new int[2][3];
//		numlist [0][0] = 100;
//		numlist [0][2] = 300;
//		numlist [1][1] = 500;
//		
//		for (int i = 0; i < numlist.length; i++) {
//			for (int j = 0; j < numlist[i].length; j++) {
//				System.out.println("numlist["+i+"]["+j+"]="+numlist[i][j]);
//			
//			} 	
//		}
		
		int[][] numlist = new int[3][]; //가변배열 정의
		numlist[0] = new int[2];
		numlist[1] = new int[3];
		numlist[2] = new int[4];
		for (int i = 0; i < numlist.length; i++) {
			for (int j = 0; j < numlist[i].length; j++) {
				System.out.println("numlist["+i+"]["+j+"]="+numlist[i][j]);
				
			}
			
		}
	}//main

}//class
