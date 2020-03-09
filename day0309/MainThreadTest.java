package day0309;

import java.util.Iterator;

public class MainThreadTest {

	public static void main(String[] args) {
		String[] nameList = {"홍길동1","홍길동2","홍길동3","홍길동4"};
		
		System.out.println("메인 쓰레드 시작~~~");
		
		for (String name : nameList) {
			new Thread(new ChildThread(name)).start();
		}
		
//		ChildThread ct = new ChildThread("홍길동");
//		new Thread(ct).start();
//		new Thread(new ChildThread("홍길동")).start();
//		
//		ChildThread ct2 = new ChildThread("홍길순");
//		new Thread(ct2).start();
		
		System.out.println("메인 쓰레드 종료~~~");
	}

}
