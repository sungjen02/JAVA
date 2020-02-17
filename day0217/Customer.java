package day0217;

public class Customer {
	//Field : 전역변수
	private String name="홍길동", accountno="123-4567", pass="1234";
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
		System.out.println("고객 : 이름을 입력한다");
		return name;	
		}
	public void setAccounto(String accountno) {
		System.out.println("고객 : 계좌번호를 입력한다");
		this.accountno = accountno;}
	public void setPass(String pass) {
		System.out.println("고객 : 비밀번호를 입력한다");
		this.pass = pass;
		}
	public void setMoney(int money) {
		System.out.println("고객 : 금액을 입력한다");
		this.money = money;
		}
	public int getMoney() {return money;}
	public String getPass() {return pass;}
	public String getAccountno() {
		return accountno;
	}
	
}
