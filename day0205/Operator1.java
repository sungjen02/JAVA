/**
	���׿�����
	~, !, +, -, ++, --
*/




class Operator1 {
	public static void main(String[] args) {
		
		
		int i = 10;
		int j = -10;
		// ~ : 1�� ��������. ~��� : ��ȣ���� 1����, ~���� : ��ȣ���� 1����


		System.out.println("~" + i + " = " + ~i ); // -11
		System.out.println("~" + j + " = " + ~j ); //  9

		//! : true = false, false -> true 
		boolean b = true, c = false;
		System.out.println("!" + b + " = " + !b); // false
		System.out.println("!" + c + " = " + !c); // false
		System.out.println( !(3 > 2) );


		// + : �������� ���� 
		System.out.println("+" + i + " = " + +i);
		System.out.println("+" + j + " = " + +j);


		//- : 2�� ��������, ��ȣ�ٲ޿���
		System.out.println("-" + i + " = " + -i); //-10
		System.out.println("-" + j + " = " + -j); // 10

		// ++ : ���������� (���ü�� ���� 1�� ����)
		//  --  : ���ҿ����� (���ü�� ���� 1�� ����)

		i = 0;
		j = 10;

		//���� : ������ ���ü;
		++i; // 0 -> 1
		--j; // 10 -> 9
		System.out.println("�������� i : " + i + ", j= " + j);
		//���� ���ü ������

		i++; // 1 -> 2
		j--; // 9 -> 8
		System.out.println("�������� i : " + i + ", j= "+ j);
		// ++, -- ���Կ����ڿ� ���� ���Ǹ� ������ ������ �ٸ� ���� ����
		// ���� : ���� ���� ( ���� ���� �� ����)
		
		int result = ++i;
		System.out.println("���� result : " + result + ", i : " + i);

		result = 0;
		//���� : ���� �͸���

		result = i++;
		System.out.println("���� result : " + result + ", i : " + i);

	


	}//main
}//class
