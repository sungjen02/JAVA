package day0221;

public class ����׽�Ʈ {

	public static void main(String[] args) {
		����    ����         = new ����();
		�ﰢ�� �����ﰢ�� = new �ﰢ��();
		�簢�� ����簢�� = new �簢��();
		�� 	     �ʷϻ���    = new ��();
		����    ����ﰢ�� = new �ﰢ��();

		����.draw();
		�����ﰢ��.draw();
		����簢��.draw();
		�ʷϻ���.draw();

		System.out.println("------------------------------------------");
		����ﰢ��.getColor();
		System.out.println(����ﰢ��.color);
		�ﰢ�� �ʷϻﰢ�� = (�ﰢ��) ����ﰢ��;   //��ü ����ȯ
		�ʷϻﰢ��.getColor();
		System.out.println(�ʷϻﰢ��.color);
		
//		�ﰢ�� �Ķ��ﰢ�� = new ����(); //�����Ұ�
		
		
		�����ﰢ��.color="����";
		����簢��.color="���";
		�ʷϻ���.color="�ʷ�";
		
		�����ﰢ��.getColor();
		����簢��.getColor();
		�ʷϻ���.getColor();
		
	}

}
