package day0224;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Container : Window, Frame, Panel, Dialog..
 * Component : Button, Radio, TestArea, TextField ...
 *		+ add~~~Listener �޼ҵ带 ���� UI�� Event ����!!
 * Event : Event interface(~~~ Listener) �� �̿��Ͽ� ����
 * @author sist
 */
	public class  FrameObject {
	//Field
	Frame f;
	
	//Constructor
	public FrameObject() {
		f = new Frame("������ �׽�Ʈ");
		Button btn1 = new Button("1");	
		Button btn2 = new Button("2");	
		Button btn3 = new Button("3");	
		Button btn4 = new Button("4");	
		Button btn5 = new Button("5");	
		Button btn6 = new Button("6");	
		
		f.setLayout(new GridLayout(3,2));
		
		f.add(btn1);	f.add(btn2);	f.add(btn3);	f.add(btn4);	f.add(btn5);	f.add(btn6);
		f.setSize(500,500);
		f.setVisible(true);
		
//		FrameObjectEvent foevent = new FrameObjectEvent();
		f.addWindowListener(new FrameObjectEvent());
	}
	
	//�̺�Ʈ ó���� ���� inner class ����
	class FrameObjectEvent implements WindowListener {
		//Method
		public void windowActivated(WindowEvent e) {}
		public void windowClosed(WindowEvent e) {}
		public void	windowClosing(WindowEvent e) {
			System.out.println("== �������� �����մϴ�. ==");
			System.exit(0);
		}
		public void	windowDeactivated(WindowEvent e) {}
		public void	windowDeiconified(WindowEvent e) {}
		public void	windowIconified(WindowEvent e) {}
		public void	windowOpened(WindowEvent e) {}

	}//event class
	
	
	
}//class