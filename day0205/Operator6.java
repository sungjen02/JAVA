/**
	����(����)������
	? :
*/



class Operator6 {
	public static void main(String[] args) {
	
	// ���ǽ� ? ��1 : ��2
	int i = 10;
	System.out.println(i + "��(��)" + (i  >= 0? " ���" : " ����")  );

	//
	int year =  2020;
	int birth = 1994;
	int age = year-birth+1;
	//���̰� 20�� �̻� �̶�� ����, �׷����ʴٸ� "�̼���" ���

	System.out.println(age + "����" + (age >= 20? "�" : "�̼���") );
	}
}
