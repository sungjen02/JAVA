/**
main method�� �ܺ� �� �Է�.
*/



class UseArguments{
	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(args[1]+args[2]);
		//int i = (int)args[1]; //��������������(String)�� �⺻��(int)��
		//����� �� ����.
		//Wrapper class�� ����ϸ� ���ڿ�(String)�� �⺻��������������
		//��ȯ�� �� �ִ�.

		int i = Integer.parseInt(args[1]);
		int j = Integer.parseInt(args[2]);
		System.out.println( i + j );

		double d = Double.parseDouble(args[3]);
		System.out.println( d );

	}//main
}//class

