class  work0205{
	public static void main(String[] args) {
		
		char initial1 = 'L';
		char initial2 = 'S';
		char initial3 = 'J';
			System.out.println("���̸��� �̴ϼ���" +  initial1 + initial2  + initial3 + "�Դϴ�");

		System.out.println(args[1]);

		int age = Integer.parseInt(args[1]);
		System.out.println(2020-age+1+"��");

		int i = Integer.parseInt(args[2]);
		int number = i%2;
		System.out.println("�Է¼�" + i + (number==1? "Ȧ��" : "¦��"));
	}
}
