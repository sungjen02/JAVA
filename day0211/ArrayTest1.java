package day0211;

public class ArrayTest1 {
	//Field
	//Constructor
	//Method
	public static void main(String[] args) {
		int[] numlist = new int[5];
		//������ �߰� : for�� ���- 1~5 ����
		for (int i = 0; i < numlist.length; i++) {
			numlist[i] = i + 1;
			
		}
		//������ ���
		for(int i = 0; i < numlist.length; i++) {
			System.out.println("numlist["+i+"]="+numlist[i]);
		
		}
	}

}