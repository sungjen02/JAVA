package day0207;


/**
 * ���� for
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
		for(int i = 2; i < 10; i++) {//��
			System.out.println(i + " �� ");
			for(int j = 1; j < 10; j++) {//��
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
			
			//////////////////// ���� loop
			
//			for( ; ; ) {
//				System.out.println("���� loop");
//
//			}//end for
//		for (int j = 0 ; ; j++) {
//			System.out.println("���� loop" + i);
//		}
		}
		//continue : �ݺ����� ������ �ǳ� �۶�. ���ǹ��� ���� ���.
		//0~100���� ¦���� ���
		for(int i=0; i < 100; i+=2) {
			if(i % 2 == 1) {
				continue; //�Ʒ����� �ڵ带 �ǳʶڴ�.
			}
			System.out.println(i);
			
		}//end for
		
	}//main

}//class
