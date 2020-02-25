package day0225;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonObject extends Frame {
	//Field
	//Constructor
	
	public ButtonObject() {
		Panel btnPanel = new Panel();
		Button btn1 = new Button("�α���");
		Button btn2 = new Button("���");
		
		btnPanel.add(btn1);
		btnPanel.add(btn2);
		
		add(btnPanel);
		setSize(500,500);
		setVisible(true);
		
		//�̺�Ʈ ������
		ButtonObjectEvent eventObject = new ButtonObjectEvent();
		addWindowListener(eventObject);
		btn1.addActionListener(eventObject);
		btn2.addActionListener(eventObject);
	}
	//�̺�Ʈ ó���� ���� inner class
	class ButtonObjectEvent extends WindowAdapter implements ActionListener {
		
		//** ������ ���� �̺�Ʈ ó��**//
		public void	windowClosing(WindowEvent e) {
			System.out.println("-- ���α׷��� �����մϴ�. --");
			System.exit(0);
		}
		/** ��ư�� �׼� �̺�Ʈ ó�� **/
		public void	actionPerformed(ActionEvent e) {
			String bname = e.getActionCommand();
			if(bname.equals("�α���")) {
				System.out.println("�α���");
			}else if(bname.equals("���")) {
				System.out.println("���");
			}
		}
	}
}//class
