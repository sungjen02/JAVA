package day0217;

public class Banker {
	//Field
	private String name="ȫ�浿", accountno="123-4567";
	private String pass="1234";
	private int money=500;
	int checkResult=0;
	
	String rname,raccountno, rpass;
	int rmoney;
	AccountPaper paper;
	
	//Constructor
	//Method
	//�������� üũ
	
	public void accountCheck(String name, String accountno, int money) {
		//���� ��ȿ�� üũ
		this.rname = name;
		this.raccountno =accountno;
		this.rmoney = money;
		if(name.equals("")) {
			checkResult = 1;
		}else if(accountno.equals("")) {
			checkResult = 2;
		}else if(money == 0) {
			checkResult = 3;
		}//end if
	}
public void accountCheck(AccountPaper paper) {
		if(paper.getName().equals("")) {
			checkResult = 1;
		}else if(paper.getAccountno().equals("")) {
			checkResult = 2;
		}else if(paper.getMoney() == 0) {
			checkResult = 3;
		}
		this.paper = paper;
	}
	public void accountCheck(String accountinfo[]) {
		//���� ��ȿ�� üũ
		for (int i = 0; i < accountinfo.length; i++) {
			System.out.println(accountinfo[i]);
			if(accountinfo[i].equals("")) {
				if(i==0 && accountinfo[i].equals("")) checkResult = 1;
				else if(i==1 && accountinfo[i].equals("")) checkResult = 2;
				else if(i==2 && accountinfo[i].equals("0")) checkResult = 3;
				}else {
				if(i==0) this.rname = accountinfo[i];
			else if(i==1) this.raccountno = accountinfo[i];
			else if(i==2) this.rmoney = Integer.parseInt(accountinfo[i]);
			}
			
		}
		
	}
//	System.out.println("�κ��� �����ֽ��ϴ�");
	
	//���������� ���� �߰�����
	public void askAccountInfo() {
		if(checkResult ==1) {
			System.out.println("���� : �̸� �κ��� �����ֽ��ϴ�");
			System.out.println("���� : �̸��� �˷��ּ���");
		}else if(checkResult == 2) {
			System.out.println("���� : ���¹�ȣ �κ��� �����ֽ��ϴ�");
			System.out.println("���� : ���¹�ȣ�� �˷��ּ���");
		}else if(checkResult == 3) {
			System.out.println("���� : �ݾ� �κ��� �����ֽ��ϴ�");
			System.out.println("���� : �ݾ��� �˷��ּ���");
		}
	}
	
	public void askMoney(int money) {
		this.rmoney = money;
	}
	
	//��й�ȣ Ȯ�� ��
	public void askPass(String pass) {
		System.out.println("���� : ��й�ȣ�� �����");
		this.rpass = pass;
	}
	
	//�������
	public void success() {
		if(name.equals(rname) && accountno.equals(raccountno)
				&& pass.equals(rpass)) {
			if(money>rmoney) {
			int value =  money -= rmoney;
			System.out.println("���� : " + rmoney + "���� ��ݵǾ����ϴ�");
			}
		}
		
		System.out.println(" *** ��� ���� ***");
		System.out.println("��� �� �ܾ� : " + money);
	}
	
	
}//class
