package day0211;

public class ArrayTest1 {
	//Field
	//Constructor
	//Method
	public static void main(String[] args) {
		int[] numlist = new int[5];
		//데이터 추가 : for문 사용- 1~5 까지
		for (int i = 0; i < numlist.length; i++) {
			numlist[i] = i + 1;
			
		}
		//데이터 출력
		for(int i = 0; i < numlist.length; i++) {
			System.out.println("numlist["+i+"]="+numlist[i]);
		
		}
	}

}