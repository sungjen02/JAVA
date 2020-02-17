package day0217;

public class GangNumLibrary {

	public static void main(String[] args) {
		BookMgmSystem bms = new BookMgmSystem();
		Staff hong = new Staff();
		
		bms.register(hong.inputObject());
		bms.showListObject();
		
//		bms.register(hong.input());
//		bms.showListArray();
		//bms.register(hong.isbn, hong.name, hong.author, hong.price);
		//bms.showList();
	}

}
