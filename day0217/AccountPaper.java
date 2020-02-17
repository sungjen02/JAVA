package day0217;

public class AccountPaper {
	//Field : 전역변수
	public String name, accountno,pass;
	public int money;
	
	
	//Constructor
	//Method - setter, getter
	public void setName(String name) {
		this.name = name;
	}
	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	//getter
	public String getName() {return name;}
	public String getAccountno() {return accountno;}
	public String getPass() {return pass;}
	public int getMoney() {return money;}
	
	
	
}
