package day0212;

public class MultiArraySumTest {

	public static void main(String[] args) {
		//1. 2���� �迭 ����
	
		
		//2. ������ ����
		
		int[][] marray = new int[3][3];
		for (int i = 0; i < marray.length; i++) {
			for (int j = 0; j < marray[i].length; j++) {
				marray[i][j] = (int)(Math.random()*100);
				System.out.print("["+i+"]["+j+"]=" +marray[i][j]+"\t");
			}//inner for
			System.out.println();
		}//outer for
		
		//3. �밢�� ������ �� ���ϱ�
		int sum=0;
		for (int i = 0; i < marray.length; i++) {
			for (int j = 0; j < marray[i].length; j++) {
				if(i==j) {
					sum += marray[i][j];
				}//end if
				
			}//inner for
			
		}//outer for
		System.out.println("�հ� = " + sum);
		
	}//main

}//class
