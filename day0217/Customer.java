package day0217;

public class Customer {
	//Field : ��������
	private String name="ȫ�浿", accountno="123-4567", pass="1234";
	private int money=0;
	String[] accountinfo = new String[3];
	AccountPaper paper = new AccountPaper();
	
	//Constructor
	//Method
	//Setter,Getter Method
	public void setPaper(AccountPaper paper) {
		this.paper = paper;
	}
	public AccountPaper getPaper() {
		paper.setName(name);
		paper.setAccountno(accountno);
		paper.setPass(pass);
		paper.setMoney(money);
		return paper;
	}
	
	public void setAccountinfo(String[] accountinfo) {}
	public String[] getAccountinfo() {
		accountinfo[0] = name;
		accountinfo[1] = accountno;
		accountinfo[2] = String.valueOf(money); //"0"
		
		return accountinfo;
		}
	
	public void setName(String name) {	this.name = name;		}
	public String getName() {
		System.out.println("�� : �̸��� �Է��Ѵ�");
		return name;	
		}
	public void setAccounto(String accountno) {
		System.out.println("�� : ���¹�ȣ�� �Է��Ѵ�");
		this.accountno = accountno;}
	public void setPass(String pass) {
		System.out.println("�� : ��й�ȣ�� �Է��Ѵ�");
		this.pass = pass;
		}
	public void setMoney(int money) {
		System.out.println("�� : �ݾ��� �Է��Ѵ�");
		this.money = money;
		}
	public int getMoney() {return money;}
	public String getPass() {return pass;}
	public String getAccountno() {
		return accountno;
	}
	
}
