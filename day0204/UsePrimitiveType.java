/**
�⺻������������ ���
 ���� : byte, short, int, long
 ���� : char
 �Ǽ� : float, double
 �Ҹ� : boolean
*/


class UsePrimitiveType{

	public static void main(String[] args) {
		//����~����� ���� �� �� �ִ�. signed valule
		byte a=10;
		short b=10;
		int c =10;
		long d=10; //literal�� 4byte �̳���� ����ø� ���� �� �� �ִ�.
		long f=2147483648L; // 4byte �̻��ΰ�� ����� �ʼ�

		System.out.println("byte : "+a+", short : "+b +", int : "+
			c+", long : "+d+","+f);
		//char ������ Unicode ���� �Ҵ�Ǹ� ������ �������� ���Ѵ�.
		//unsigned value
		char g='A';
		char h='��';
		char i='0';
		System.out.println("char : "+g+","+h+","+i);
		
		float j=3.14f; // ����� �ʼ�
		double k=3.14D; //����� ��������
		System.out.println("float : "+j+", double : "+k);

		boolean I=true;
		boolean m=false;
		System.out.println("boolean : "+I+", "+m);
		
		//
		byte b=10;
		byte b1=20;
		int result=b1+b2;
		System.out.println(b+"+"+b1+"="+result);

	}//main
}//class