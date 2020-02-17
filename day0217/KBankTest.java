package day0217;

public class KBankTest {

	public static void main(String[] args) {
		Banker 流盔 = new Banker();
		Customer 绊按 = new Customer();
		
//		流盔.accountCheck(绊按.getName(), 绊按.getAccountno(), 绊按.getMoney());
//		流盔.accountCheck(绊按.getAccountinfo());
		流盔.accountCheck(绊按.getPaper());
		流盔.askAccountInfo();
		流盔.askMoney(100);
		流盔.askPass(绊按.getPass());
		流盔.success();
	}

}
