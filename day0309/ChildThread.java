package day0309;

public class ChildThread implements Runnable{
	//Field
	String name;
	
	
	//Constructor
	public ChildThread() {}
	public ChildThread(String name) {this.name = name;}
	
	
	//Method
//	public void getName() {System.out.println("�̸� : + name");}
	
	public void run() {
//		�������� �� ����Ǵ� �ڵ�!!
		try {
			
		System.out.println("------> ���ο��� ����");
		System.out.println("�̸� : " +  name);
		Thread.sleep(3000);
		System.out.println("------> ChildThread ����");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
