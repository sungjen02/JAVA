package day0309;

public class Producter extends Thread {
	DrinkMachine dm;
	String name;
	
	public Producter() {}
	public Producter(String name, DrinkMachine dm) {
		this.name = name;
		this.dm = dm;
		}
	
	public void run() {
		dm.putDrink(name);
	}
}