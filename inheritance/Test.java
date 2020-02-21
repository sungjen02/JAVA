package inheritance;

import java.awt.Frame;
import java.awt.Window;
import javax.swing.JFrame;

public class Test {

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		Frame f = new JFrame();
		Window w = new JFrame();
//		JFrame j = new Windows();	//상속구조 오류
		
		사람 홍길동 = new 사람();
		포유류 송중기 = new 사람();
		동물 공유 = new 사람();
		동물 손예진 = new 포유류();
		
//		사람 hong = new 포유류();	
//		
//		홍길동.eat();		홍길동.name="hong";		
//		송중기.think();	송중기.addr="서울";	송중기.name="송중기";
//		공유.addr="부산";	공유.name = "공유";
//		손예진.think();	손예진.name="손예진";
		
//		홍길동 = (사람) 손예진;
//		System.out.println(홍길동.addr);	
//		공유 = 홍길동;	손예진 = 홍길동;	//클래스의 묵시적인 형변환
//		홍길동 = (사람) 공유;	송중기 = (포유류) 손예진;		//클래스의 명시적인 형변환
//		공유 = 손예진;

	}

}
