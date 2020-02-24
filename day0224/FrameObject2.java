package day0224;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Container : Window, Frame, Panel, Dialog..
 * Component : Button, Radio, TestArea, TextField ...
 *		+ add~~~Listener �޼ҵ带 ���� UI�� Event ����!!
 * Event : Event interface(~~~ Listener) �� �̿��Ͽ� ����
 * @author sist
 */
public class FrameObject2 extends Frame implements WindowListener{
	//Field
//	Frame f;
	
	//Constructor
	public FrameObject2() {
//		f = new Frame("������ �׽�Ʈ");
		setTitle("��ӹ��� ������ ����");
		
		//��ư ����
		Button btn1 = new Button("1");	
		Button btn2 = new Button("2");	
		Button btn3 = new Button("3");	
		Button btn4 = new Button("4");	
		Button btn5 = new Button("5");	
		Button btn6 = new Button("6");	
		
		setLayout(new FlowLayout());
		add(btn1);	add(btn2);	add(btn3);	add(btn4);	add(btn5);	add(btn6);

		setSize(500,500);
		setVisible(true);
		
		//Anoymous inner class�� �����Ͽ� �̺�Ʈ ó�� - ȣ��Ǵ� ��ġ�� ����!
		addWindowListener(new WindowListener(){
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
		});
	}
	
	
	
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

	
}//class

