/**
	���������� 
	�Ϲݳ��� : �������� ���迬���ڸ� ��� ���� ��
	  && , ||

	��Ʈ���� : ��Ʈ�� ����
	  &, |, ^
*/


class Operator5 {
	public static void main(String[] args) {
		
	//�Ϲݳ��� 
	// &&(AND) : ���װ� ������ ��� ���� �� ����ȯ
	//System.out.println( 5 > 2 && 10 < 100);
	boolean flag1 = true, flag2 = false, flag3 = true, flag4 = false;

	System.out.println("------------------- && --------------------");
	System.out.println( flag1 + "&&" + flag3 + " = " + (flag1 && flag3)); //true
	System.out.println( flag1 + "&&" + flag2 + " = " + (flag1 && flag2)); //false
	//������ �����̸� ������ ������� �ʴ´�.
	System.out.println( flag2 + "&&" + flag1 + " = " + (flag2 && flag1)); //false
	System.out.println( flag2 + "&&" + flag3 + " = " + (flag2 && flag4)); //false
	//���װ� ������ ��� false �϶��� false
	
	System.out.println("-------------------- || ---------------------");
	System.out.println( flag1 + "||" + flag3 + " = " + (flag1 || flag3)); //true
	System.out.println( flag1 + "||" + flag2 + " = " + (flag1 || flag2)); //true
	//������ true�̸� ������ ������� �ʴ´�.
	System.out.println( flag2 + "||" + flag1 + " = " + (flag2 || flag1)); //true
	System.out.println( flag2 + "||" + flag3 + " = " + (flag2 || flag4)); //false
	//

	boolean temp1 = false, temp2 = false, result = false;
	result = (temp1 = 3 > 2)  &&(temp2 = 3>2);
	System.out.println(temp1 + "," + temp2 + "," + result);
	
	//��Ʈ����
	// &(AND) : ������Ʈ�� ������Ʈ ��� 1�ΰ�� 1����
	// | (OR) : ������Ʈ�� ������Ʈ ��� 0�ΰ�� 0����
	// ^ (XOR) : ������Ʈ�� ������Ʈ ���� �ϳ��� 1�ΰ�� 1����
	
	int i = 19, j = 25;

	System.out.println(i+" & " + j + " = " + ( i & j ) );
	System.out.println(i+" | " + j + " = " + ( i | j ) );
	System.out.println(i+" ^ " + j + " = " + ( i ^ j ) );

	}//main
}//class