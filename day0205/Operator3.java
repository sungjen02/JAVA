/**
	����Ʈ������
	<< : ��Ʈ�� �������� �а� �о ��ĭ�� �׻� 0���� ä���.
	>> : ��Ʈ�� �������� �а� �о ��ĭ�� �ֻ��� ��ȣ��Ʈ�� ���� 
		    ����� 0�� ������ 1�� ä���.
	>>> : ��Ʈ�� ���������� �а� �о ��ĭ�� �׻� 0���� ä���.
*/



class Operator3{

	public static void main(String[] args) {

	int i = 9;
	System.out.println(i + " << 4 = " + (i << 4));
	i = 27;
	System.out.println(i + " >> 3 = " + (i >> 3));
	i = 100;
	System.out.println(i + " >>> 2 = " + (i >>> 2));


	i = 1;
	System.out.println(i  << 31);
	i = -1;
	System.out.println(i >> 1); //��ȣ ����
	System.out.println(i >>> 1); //�����


		
	}//main
}//class