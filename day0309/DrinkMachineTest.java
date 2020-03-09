package day0309;

public class DrinkMachineTest {

	public static void main(String[] args) {
		DrinkMachine dm = new DrinkMachine();
		Producter p = new Producter("È«±æµ¿", dm);
		Customer c = new Customer("È«±æ¼ø", dm);
		
		p.run(); c.run();
//		p.start();
//		c.start();
	}

}
