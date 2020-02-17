package day0217;

public class Banker {
	//Field
	private String name="홍길동", accountno="123-4567";
	private String pass="1234";
	private int money=500;
	int checkResult=0;
	
	String rname,raccountno, rpass;
	int rmoney;
	AccountPaper paper;
	
	//Constructor
	//Method
	//계좌정보 체크
	
	public void accountCheck(String name, String accountno, int money) {
		//값의 유효성 체크
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
		//값의 유효성 체크
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
//	System.out.println("부분이 빠져있습니다");
	
	//계좌정보에 대한 추가질문
	public void askAccountInfo() {
		if(checkResult ==1) {
			System.out.println("직원 : 이름 부분이 빠져있습니다");
			System.out.println("직원 : 이름을 알려주세요");
		}else if(checkResult == 2) {
			System.out.println("직원 : 계좌번호 부분이 빠져있습니다");
			System.out.println("직원 : 계좌번호를 알려주세요");
		}else if(checkResult == 3) {
			System.out.println("직원 : 금액 부분이 빠져있습니다");
			System.out.println("직원 : 금액을 알려주세요");
		}
	}
	
	public void askMoney(int money) {
		this.rmoney = money;
	}
	
	//비밀번호 확인 후
	public void askPass(String pass) {
		System.out.println("직원 : 비밀번호를 물어본다");
		this.rpass = pass;
	}
	
	//출금진행
	public void success() {
		if(name.equals(rname) && accountno.equals(raccountno)
				&& pass.equals(rpass)) {
			if(money>rmoney) {
			int value =  money -= rmoney;
			System.out.println("직원 : " + rmoney + "만원 출금되었습니다");
			}
		}
		
		System.out.println(" *** 출금 정보 ***");
		System.out.println("출금 후 잔액 : " + money);
	}
	
	
}//class
