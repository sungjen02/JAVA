/**
		�ٸ� Ŭ������ �����ϴ� Constant ����ϴ� Ŭ����
*/


class TestConstant {
	public static void main(String[] args) {
		System.out.println(Constant.MAX_SCORE);
		System.out.println("Byte �� �ּҰ� : " + Byte.MIN_VALUE
			+ ", Byte�� �ִ밪 : " + Byte.MAX_VALUE);

		//���� : �������� 2������ ����ǰ�
		int i=10; //10����
		int j=017; //8����
		int k=0x10; //16����
		//����ϸ� 10������ ��µȴ�.
		System.out.println(i + " +" + j +" + " + k + "=" + (i + j +k));

		int t=48;


		System.out.println(Integer.toBinaryString(t));
		System.out.println(Integer.toOctalString(t));
		System.out.println(Integer.toHexString(t));
	}//main
}//class
