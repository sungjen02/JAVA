package member3;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MemberLogin {
	//Field
	JFrame jf;
	JTextField tid;
	JPasswordField tpw;
	MemberMgmUI main;
	
	//Constructor
	
	
	public MemberLogin(MemberMgmUI main) {
		this.main = main;
		Font font = new Font("���� ���", Font.BOLD, 12);
		jf = new JFrame("JFrame Test~~");
		
		JPanel jp_title = new JPanel();
		JPanel jp_id = new JPanel();
		JPanel jp_pw = new JPanel();
		JPanel jp_button = new JPanel();
		
		JLabel title = new JLabel("�α��� ��");
		JLabel id = new JLabel("���̵�	");
		JLabel pw = new JLabel("��й�ȣ	");
		tid = new JTextField(15);
		tpw = new JPasswordField(15); 
		JButton btnLogin = new JButton("�α���");
		JButton btnReset = new JButton("�ٽþ���");
		JButton btnEnd = new JButton("����");
		
		
		title.setFont(font); id.setFont(font); pw.setFont(font); 
		btnLogin.setFont(font);		btnReset.setFont(font); btnEnd.setFont(font);
		
//		jf.add(title, BorderLayout.NORTH);
		jp_title.add(title);
		jp_id.add(id);		jp_id.add(tid);
		jp_pw.add(pw);		jp_pw.add(tpw);
		jp_button.add(btnLogin);	jp_button.add(btnReset); jp_button.add(btnEnd);
		
		jf.setLayout(new GridLayout(4,1));
		jf.add(jp_title);
		jf.add(jp_id);
		jf.add(jp_pw);
		jf.add(jp_button);
		
		
		jf.setSize(300,220);
		Dimension fsize = jf.getSize();
		Dimension scsize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int)(scsize.getWidth()-fsize.getWidth())/2;
		int height = (int)(scsize.getHeight()-fsize.getHeight())/2;
		
		jf.setLocation(width,height);
		jf.setVisible(true);
		
		//�̺�Ʈ �ڵ鷯 �޼ҵ�(������ �޼ҵ�) ȣ��
		JFrameObjectEvent eventObject = new JFrameObjectEvent();
		jf.addWindowListener(eventObject);
		btnLogin.addActionListener(eventObject);
		btnReset.addActionListener(eventObject);
		btnEnd.addActionListener(eventObject);
		tpw.addActionListener(eventObject); 
	}
	//�̺�Ʈ ó�� Ŭ����
	public class JFrameObjectEvent extends WindowAdapter implements ActionListener{

			public void windowClosing(WindowEvent we) {
				System.out.println("----- ���α׷� ���� -----");
				System.exit(0);
			}
			
	//�׼� �̺�Ʈ ó��
			public void actionPerformed(ActionEvent e) {
				String bname = e.getActionCommand();
				if(bname.equals("�α���") || tpw == e.getSource()) {
					if(validationCheck()) loginCheck();
					
//					System.out.println("�α���~~");
//					String did = "test";
//					String dpw = "1234";
//					String uid = tid.getText().trim();
//					String upw = tpw.getText().trim();
//					
//					if(did.equals(uid) && dpw.equals(upw)) {
////						System.out.println("�α��� ����");
//						if(dpw.equals(upw)) {
//							JOptionPane.showMessageDialog(null, "�α��μ���");
//							//�α��μ��� : id, pass ����
//						}else {
//							JOptionPane.showMessageDialog(null, "�α��ν���, �н����� �ٸ�");
//							//�α��ν��� : id ����, pass�ٸ�
//						}
//					}else {
////						System.out.println("�α��� ����");
//						JOptionPane.showMessageDialog(null, "�α��ν���, ���̵� �ٸ�");
//					}
				}else if(bname.equals("���")) {
//					System.out.println("���");
					tid.setText("");
					tpw.setText("");
				}else if(bname.equals("����")) {
					System.out.println("-- ���� �Ǿ����ϴ� --");
					System.exit(0);
				}
					
			
		}		
	
	//Method
	/** ������ ��ȿ�� üũ**/
	public boolean validationCheck() {	
		boolean result = false;
		if(tid.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "���̵� �Է����ּ���");
			tid.requestFocus();
		}else if(tpw.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "��й�ȣ�� �Է����ּ���");
			tpw.requestFocus();
		}else {
			result = true;
		}
		return result;
	}
			
	/** �α��� üũ**/
	public void loginCheck() {
//		if(bname.equals("�α���")) {
//			System.out.println("�α���~~");
			String did = "test";
			String dpw = "1234";
			String uid = tid.getText().trim();
			String upw = tpw.getText().trim();
			
			if(did.equals(uid) && dpw.equals(upw)) {
//				System.out.println("�α��� ����");
				if(dpw.equals(upw)) {
					JOptionPane.showMessageDialog(null, "�α��μ���");
					jf.setVisible(false);
					main.start();
					
					//�α��μ��� : id, pass ����
				}else {
					JOptionPane.showMessageDialog(null, "�α��ν���, �н����� �ٸ�");
					//�α��ν��� : id ����, pass�ٸ�
				}
			}else {
//				System.out.println("�α��� ����");
				JOptionPane.showMessageDialog(null, "�α��ν���, ���̵� �ٸ�");
			}
	}
	}
	
	
}
