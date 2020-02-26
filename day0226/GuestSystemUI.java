package day0226;

import java.awt.BorderLayout;
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

public class GuestSystemUI extends JFrame{
	JFrame jf;
	JPanel mainPane, menuPane,  jp_button;
	JButton btninsert, btnlist, btnsearch, btnrewrite, btndelete, btnexit;
	JLabel jl_title;
	Font font = new Font("맑은 고딕", Font.BOLD, 12);
	
	public GuestSystemUI(){
		start();
	}
	public void start() {
	//Field
			jf = new JFrame("guest System");
			mainPane = new JPanel();
			menuPane = new JPanel(new GridLayout(10,1));
			jl_title = new JLabel("\\n== 회원등록 시스템에 오신것을 환영합니다 ==");
			
			btninsert = new JButton("회원등록");
			btnlist = new JButton("회원리스트");
			btnsearch = new JButton("회원검색");
			btnrewrite = new JButton("회원수정");
			btndelete = new JButton("회원삭제");
			btnexit = new JButton("회원종료");
		
			jl_title.setFont(new Font("맑은 고딕",Font.BOLD,16));
			btninsert.setFont(font);	 btnlist.setFont(font);  btnsearch.setFont(font);
			btnrewrite.setFont(font);  btndelete.setFont(font);  
			btnexit.setFont(font);
//			jp_button.add(btninsert); jp_button.add(btnlist); jp_button.add(btnsearch); jp_button.add(btnrewrite); jp_button.add(btndelete);
//			jp_button.add(btnexit);
			
			mainPane.add(jl_title);	
			menuPane.add(btninsert);
			menuPane.add(btnlist);
			menuPane.add(btnsearch);
			menuPane.add(btnrewrite);
			menuPane.add(btndelete);
			menuPane.add(btnexit);
			
			add(menuPane, BorderLayout.WEST);
			add(mainPane, BorderLayout.CENTER);
			
			jf.setSize(400,400);
			Dimension fsize = jf.getSize();
			Dimension scsize = Toolkit.getDefaultToolkit().getScreenSize();
			int width = (int)(scsize.getWidth()-fsize.getWidth())/2;
			int height = (int)(scsize.getWidth()-fsize.getWidth())/5;
			
			jf.setLocation(width,height);
			jf.setVisible(true);		
			
			
			GuestSystemUIEvent eventObject = new GuestSystemUIEvent();
			jf.addWindowListener(eventObject);
			btninsert.addActionListener(eventObject);
			btnlist.addActionListener(eventObject);
			btnsearch.addActionListener(eventObject);
			btnrewrite.addActionListener(eventObject);
			btndelete.addActionListener(eventObject);
			btnexit.addActionListener(eventObject);
			
			
		}
		
		class GuestSystemUIEvent extends WindowAdapter implements ActionListener{
			
			public void windowClosing(WindowEvent e) {
				JOptionPane.showMessageDialog(null, "프로그램을 종료합니다");
				System.exit(0);
			}

			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		}
	
}