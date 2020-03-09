package day0309;

public class ChildThread implements Runnable{
	//Field
	String name;
	
	
	//Constructor
	public ChildThread() {}
	public ChildThread(String name) {this.name = name;}
	
	
	//Method
//	public void getName() {System.out.println("이름 : + name");}
	
	public void run() {
//		독립했을 때 실행되는 코드!!
		try {
			
		System.out.println("------> 메인에서 독립");
		System.out.println("이름 : " +  name);
		Thread.sleep(3000);
		System.out.println("------> ChildThread 종료");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
