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
 *		+ add~~~Listener �޼ҵ带 ���� UI�� Event ����!!
 * Event : Event interface(~~~ Listener) �� �̿��Ͽ� ����
 * @author sist
 */
public class FrameObject3 extends Frame {
	//Field
//	Frame f;
	
	//Constructor
	public FrameObject3() {
//		f = new Frame("������ �׽�Ʈ");
		setTitle("��ӹ��� ������ ����");
		
		//��ư ����
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
		
		//FrameObject3Event �̸��� inner class�� �����Ͽ� �̺�Ʈ ó�� 
		//ȣ��Ǵ� ��ġ�� ����!
		addWindowListener(new FrameObject3Event());
	}
	
	//FrameObject3Event inner class ���� - ��, ����� Ŭ������ �����
	class FrameObject3Event extends WindowAdapter  {
		public void	windowClosing(WindowEvent e) {
			System.out.println("== ���α׷� ���� ==");
			System.exit(0);
		}
	}

	
}//class

