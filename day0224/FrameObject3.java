package day0224;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Container : Window, Frame, Panel, Dialog..
 * Component : Button, Radio, TestArea, TextField ...
 *		+ add~~~Listener 메소드를 통해 UI와 Event 연결!!
 * Event : Event interface(~~~ Listener) 를 이용하여 구현
 * @author sist
 */
public class FrameObject3 extends Frame {
	//Field
//	Frame f;
	
	//Constructor
	public FrameObject3() {
//		f = new Frame("프레임 테스트");
		setTitle("상속받은 프레임 생성");
		
		//버튼 생성
		Button btn1 = new Button("NORTH");	
		Button btn2 = new Button("EAST");	
		Button btn3 = new Button("WEST");	
		Button btn4 = new Button("SOUTH");	
		Button btn5 = new Button("CENTER");	
		add(btn1, BorderLayout.NORTH);
		add(btn2, BorderLayout.SOUTH);
		add(btn3, BorderLayout.EAST);
		add(btn4, BorderLayout.WEST);
		add(btn5, BorderLayout.CENTER);
		setSize(500,500);
		setVisible(true);
		
		//FrameObject3Event 이름의 inner class를 생성하여 이벤트 처리 
		//호출되는 위치에 생성!
		addWindowListener(new FrameObject3Event());
	}
	
	//FrameObject3Event inner class 생성 - 단, 어댑터 클래스를 사용함
	class FrameObject3Event extends WindowAdapter  {
		public void	windowClosing(WindowEvent e) {
			System.out.println("== 프로그램 종료 ==");
			System.exit(0);
		}
	}

	
}//class

