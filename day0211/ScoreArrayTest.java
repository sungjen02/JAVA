package day0211;

public class ScoreArrayTest {

	public static void main(String[] args) {
		int scorelist[] = {90,100,100,80,90,100};
		String[] sublist = {"국어","영어","수학","음악","미술","체육"};
		
		//인덱스별 국어, 영어, 수학, 총점, 평균 출력
		int sum = 0;
		for (int i = 0; i < scorelist.length; i++) {
			//sum = sum + scorelist[i];
			sum += scorelist[i];
			System.out.println(sublist[i] + " : " + scorelist[i]);
		}
		System.out.println("-----------------------------------");
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + sum/scorelist.length);
	}//main

}//class
