/**
	Constant : ������ ���ó�� ��� �� ��
*/

class  Constant{

	//Constant ����
	public static final int MAX_SCORE=100;
	public static final int MIN_SCORE=0;

	public static void main(String[] args) {
		//MAX=SCORE=90; //����� ���� ������ �� ����.
		System.out.println("�ְ����� : " + MAX_SCORE); //������� ���
		System.out.println("�������� : " + Constant.MIN_SCORE); //Ŭ������.�����

		int myScore=95;

		System.out.println("�ְ����� : " + Constant.MAX_SCORE + 
			", ȹ������ : " + myScore + ", �ְ������� ȹ�������� �� : " + 
			(Constant.MAX_SCORE-myScore));

	}//main
}//class