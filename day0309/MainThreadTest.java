package day0309;

import java.util.Iterator;

public class MainThreadTest {

	public static void main(String[] args) {
		String[] nameList = {"ȫ�浿1","ȫ�浿2","ȫ�浿3","ȫ�浿4"};
		
		System.out.println("���� ������ ����~~~");
		
		for (String name : nameList) {
			new Thread(new ChildThread(name)).start();
		}
		
//		ChildThread ct = new ChildThread("ȫ�浿");
//		new Thread(ct).start();
//		new Thread(new ChildThread("ȫ�浿")).start();
//		
//		ChildThread ct2 = new ChildThread("ȫ���");
//		new Thread(ct2).start();
		
		System.out.println("���� ������ ����~~~");
	}

}
