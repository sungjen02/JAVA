package day0224;

import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JFrameObject {
	//Field
	JFrame jf;
	
	
	//Constructor
	public JFrameObject() {
		jf = new JFrame("JFrame Test~~");
		
		JPanel jp_title = new JPanel();
		JPanel jp_id = new JPanel();
		JPanel jp_pw = new JPanel();
		JPanel jp_button = new JPanel();
		
		JLabel title = new JLabel("�α��� ��");
		JLabel id = new JLabel("���̵�	");
		JLabel pw = new JLabel("��й�ȣ	");
		JTextField tid = new JTextField(10);
		JPasswordField tpw = new JPasswordField(10); 
		JButton btnLogin = new JButton("�α���");
		JButton btnRest = new JButton("�ٽþ���");
		
//		jf.add(title, BorderLayout.NORTH);
		jp_title.add(title);
		jp_id.add(id);		jp_id.add(tid);
		jp_pw.add(pw);		jp_pw.add(tpw);
		jp_button.add(btnLogin);	jp_button.add(btnRest);
		
		jf.setLayout(new GridLayout(4,1));
		jf.add(jp_title);
		jf.add(jp_id);
		jf.add(jp_pw);
		jf.add(jp_button);
		jf.setSize(300,300);
		jf.setVisible(true);
		
		//�̺�Ʈ �ڵ鷯 �޼ҵ�(������ �޼ҵ�) ȣ��
		jf.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.out.println("----- ���α׷� ���� -----");
				System.exit(0);
			}
		});
	}
	
	//Method
}
