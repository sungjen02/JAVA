/**
��������ȯ : (�����ҵ�������)����;
*/


class Casting {
	public static void main(String[] args) {
		
		byte b1 = 10;
		byte b2 = 20;
		//����� �ڵ�����ȯ�� ����� ��������ȯ���� ����
		byte result =(byte) (b1+b2);
		System.out.println(b1+ " + " + b2+ " = "+ result);

		float f=(float) 2.04;
		float f1=2.04f;
		System.out.println(f+"-"+f1);
		//��������ȯ�� ���ս��� �߻��� �� �ִ�.
		
		int i=(int)f;
		System.out.println(i + "," + f);

		char c='��';
		System.out.println(c + "�� Unicode �� : " + (int) c );

		boolean b = true;
		System.out.println((int)b); //boolean�� �ٸ������� ��������ȯ�� ���� �ʴ´�. 
		System.out.println((boolean)b);
	}//main
}//class