package day0309;

public class DrinkMachineTest {

	public static void main(String[] args) {
		DrinkMachine dm = new DrinkMachine();
		Producter p = new Producter("ȫ�浿", dm);
		Customer c = new Customer("ȫ���", dm);
		
		p.run(); c.run();
//		p.start();
//		c.start();
	}

}
