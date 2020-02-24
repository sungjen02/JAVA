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
		
		JLabel title = new JLabel("로그인 폼");
		JLabel id = new JLabel("아이디	");
		JLabel pw = new JLabel("비밀번호	");
		JTextField tid = new JTextField(10);
		JPasswordField tpw = new JPasswordField(10); 
		JButton btnLogin = new JButton("로그인");
		JButton btnRest = new JButton("다시쓰기");
		
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
		
		//이벤트 핸들러 메소드(리스너 메소드) 호출
		jf.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.out.println("----- 프로그램 종료 -----");
				System.exit(0);
			}
		});
	}
	
	//Method
}
