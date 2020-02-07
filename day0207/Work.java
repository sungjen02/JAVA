package day0207;

public class Work {
	// �⺻ ����� ���� ������� �ʴ� ���̹Ƿ� Constant�� ����
	public static final int BUS = 1250;
	public static final int SUBWAY = 1300;
	public static final int TAXI = 3800;

	public static void main(String[] args) {
		//���߱������� �ƴ��� �Ǵ�
		if(args[0].equals("����")||args[0].equals("����ö")||args[0].equals("�ý�")) {
			//����, ����ö(������ݰ����)���� �ƴ��� �Ǵ�
			if(args[0].equals("����")||args[0].equals("����ö")) {//������ݰ�� ���(����, ����ö)
				
				int distance=Integer.parseInt(args[1]);//�̿�Ÿ�
				int typeFare=Work.BUS; //��������� �⺻ ���
				int tempFare=0;//�ʰ����
				
				if(args[0].equals("����ö")) {//����ö�� ��� �⺻��� ����
					typeFare=Work.SUBWAY;
				}//end if
				if(distance > 10) {//10km�� �ʰ��� ����� �ʰ� ��� ���
					//�� 5km���� 100���� �ʰ������ ����
					tempFare=(((distance-10)/5)+1)*100;
				}
					
					System.out.println("�̿��Ͻ� ������� [" + args[0] + "] �̵��Ÿ�" + distance + "km �⺻ ���" +
					typeFare + "��, �ʰ�����" + tempFare + "��, �� �������" + (typeFare + tempFare) + "��");
				}//end if
	
		
			else {//�ܼ� ��� ���(�ý�)
				System.out.println(args[0] +"�� �⺻���" + TAXI + "���̰� ���� ��� ����� �ƴմϴ�.");
			}//end else
	}else	{
		System.out.println("���߱����� �ƴ� �κФ���? ������");
	}
}

}
