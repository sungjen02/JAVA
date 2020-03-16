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
		Font font = new Font("맑은 고딕", Font.BOLD, 12);
		jf = new JFrame("JFrame Test~~");
		
		JPanel jp_title = new JPanel();
		JPanel jp_id = new JPanel();
		JPanel jp_pw = new JPanel();
		JPanel jp_button = new JPanel();
		
		JLabel title = new JLabel("로그인 폼");
		JLabel id = new JLabel("아이디	");
		JLabel pw = new JLabel("비밀번호	");
		tid = new JTextField(15);
		tpw = new JPasswordField(15); 
		JButton btnLogin = new JButton("로그인");
		JButton btnReset = new JButton("다시쓰기");
		JButton btnEnd = new JButton("종료");
		
		
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
		
		//이벤트 핸들러 메소드(리스너 메소드) 호출
		JFrameObjectEvent eventObject = new JFrameObjectEvent();
		jf.addWindowListener(eventObject);
		btnLogin.addActionListener(eventObject);
		btnReset.addActionListener(eventObject);
		btnEnd.addActionListener(eventObject);
		tpw.addActionListener(eventObject); 
	}
	//이벤트 처리 클래스
	public class JFrameObjectEvent extends WindowAdapter implements ActionListener{

			public void windowClosing(WindowEvent we) {
				System.out.println("----- 프로그램 종료 -----");
				System.exit(0);
			}
			
	//액션 이벤트 처리
			public void actionPerformed(ActionEvent e) {
				String bname = e.getActionCommand();
				if(bname.equals("로그인") || tpw == e.getSource()) {
					if(validationCheck()) loginCheck();
					
//					System.out.println("로그인~~");
//					String did = "test";
//					String dpw = "1234";
//					String uid = tid.getText().trim();
//					String upw = tpw.getText().trim();
//					
//					if(did.equals(uid) && dpw.equals(upw)) {
////						System.out.println("로그인 성공");
//						if(dpw.equals(upw)) {
//							JOptionPane.showMessageDialog(null, "로그인성공");
//							//로그인성공 : id, pass 동일
//						}else {
//							JOptionPane.showMessageDialog(null, "로그인실패, 패스워드 다름");
//							//로그인실패 : id 동일, pass다름
//						}
//					}else {
////						System.out.println("로그인 실패");
//						JOptionPane.showMessageDialog(null, "로그인실패, 아이디 다름");
//					}
				}else if(bname.equals("취소")) {
//					System.out.println("취소");
					tid.setText("");
					tpw.setText("");
				}else if(bname.equals("종료")) {
					System.out.println("-- 종료 되었습니다 --");
					System.exit(0);
				}
					
			
		}		
	
	//Method
	/** 데이터 유효성 체크**/
	public boolean validationCheck() {	
		boolean result = false;
		if(tid.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "아이디를 입력해주세요");
			tid.requestFocus();
		}else if(tpw.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "비밀번호를 입력해주세요");
			tpw.requestFocus();
		}else {
			result = true;
		}
		return result;
	}
			
	/** 로그인 체크**/
	public void loginCheck() {
//		if(bname.equals("로그인")) {
//			System.out.println("로그인~~");
			String did = "test";
			String dpw = "1234";
			String uid = tid.getText().trim();
			String upw = tpw.getText().trim();
			
			if(did.equals(uid) && dpw.equals(upw)) {
//				System.out.println("로그인 성공");
				if(dpw.equals(upw)) {
					JOptionPane.showMessageDialog(null, "로그인성공");
					jf.setVisible(false);
					main.start();
					
					//로그인성공 : id, pass 동일
				}else {
					JOptionPane.showMessageDialog(null, "로그인실패, 패스워드 다름");
					//로그인실패 : id 동일, pass다름
				}
			}else {
//				System.out.println("로그인 실패");
				JOptionPane.showMessageDialog(null, "로그인실패, 아이디 다름");
			}
	}
	}
	
	
}
