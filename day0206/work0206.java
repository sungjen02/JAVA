package day0206;

/**
 *
 * @author sist
 */

public class work0206 {
	
	public static final int BUS = 1250;
	public static final int SUBWAY = 1300;
	public static final int TAXI = 3800;

	public static void main(String[] args) {
		
		int km5 =Integer.parseInt(args[1]); //km��
		if(km5 % 5 == 0 , km5 * 20;) 
		
		
		if(args[0].equals("����") || args[0].equals("����ö") || args[0].equals("�ý�")) {
			
			if(args[0].equals("����"))
				System.out.println("�������"+ args[0] +" �����" + BUS + "�պ����" + BUS*2 + "�Ѵޱ���" +
										BUS*20);
			
			if(args[0].equals("����ö"))
				System.out.println("�������"+ args[0] +" �����" + BUS + "�պ����" + BUS*2 + "�Ѵޱ���" +
										BUS*20);
			
 			if(args[0].equals("�ý�"))
				System.out.println("�⺻���"+ TAXI);
			
		}else {
			System.out.println("���߱����� �ƴѺκ� ����,������");
		}
		
	

	
	
	}

}
