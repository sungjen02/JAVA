package member;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MemberMgmUI extends JFrame{
	//Field
	JPanel mainPane, menuPane; 
	JButton btnReg, btnList, btnSearch, btnUpdate, btnDelete, btnExit;
	JLabel jl_title, jl_img;
	
	//등록
	JPanel regPane, jp_name, jp_addr;
	JLabel jl_name, jl_addr,jl_regtitle;
	JTextField jt_name, jt_addr;
	JButton btnReg2, btnExit2;
	
	//리스트
	JPanel listPane;
	TextArea ta;
	
	//검색
	JPanel searchPane, jp_search,jp_searchResult;
	JLabel jl_searchName;
	JTextField jt_search;
	TextArea sta;
	
	
	//수정
	JPanel updatePane, jp_updateName, jp_updateAddr, jp_updateSearch;
	JLabel jl_updateName, jl_updateAddr, jl_updateSearchName;
	JTextField jt_updateName, jt_updateAddr, jt_updateSearch;
	
	
	//삭제
	JPanel deletePane, jp_deleteSearch;
	JLabel jl_deleteSearchName;
	JTextField jt_deleteSearch;
	
	Font font = new Font("맑은 고딕", Font.BOLD, 12);
	
	
	
	
	
	
	//Constructor
	public MemberMgmUI() {
		start();
	}
	
	//Method
	public void start() {
		mainPane = new JPanel();
		menuPane = new JPanel(new GridLayout(10,1));
		jl_title = new JLabel("\n== 회원등록 시스템에 오신것을 환영합니다 ==");
		jl_img = new JLabel(new ImageIcon("src/member/main.png"));
		btnReg = new JButton("회원등록");
		btnList = new JButton("회원리스트");
		btnSearch = new JButton("회원검색");
		btnUpdate = new JButton("회원수정");
		btnDelete = new JButton("회원삭제");
		btnExit = new JButton("종료");
		
		jl_title.setFont(new Font("맑은 고딕",Font.BOLD,16));
		btnReg.setFont(font);	btnList.setFont(font);  btnSearch.setFont(font);
		btnUpdate.setFont(font);  btnDelete.setFont(font);  
		btnExit.setFont(font);

		mainPane.add(jl_img);
		mainPane.add(jl_title);	
		menuPane.add(btnReg);
		menuPane.add(btnList);
		menuPane.add(btnSearch);
		menuPane.add(btnUpdate);
		menuPane.add(btnDelete);
		menuPane.add(btnExit);

		add(menuPane, BorderLayout.WEST);
		add(mainPane, BorderLayout.CENTER);
		
		setSize(600,500);
		
		Dimension fsize = getSize();
		Dimension scsize = Toolkit.getDefaultToolkit().getScreenSize(); 
		int width = (int)(scsize.getWidth()-fsize.getWidth())/2;
		int height =(int)(scsize.getHeight()-fsize.getHeight())/2;
		
		setLocation(width, height);
		setVisible(true);
		
		MemberMgmUIEvent eventObj = new MemberMgmUIEvent();
		addWindowListener(eventObj);
		btnReg.addActionListener(eventObj);
		btnList.addActionListener(eventObj);
		btnSearch.addActionListener(eventObj);
		btnUpdate.addActionListener(eventObj);
		btnDelete.addActionListener(eventObj);
		btnExit.addActionListener(eventObj);
		
	}//start Method
	
	//register
	public void register() {
//		JPanel regPane, jp_name, jp_addr;
//		JLabel jl_name, jl_addr;
//		JTextField jt_name, jt_addr;
		
		menuPane = new JPanel();
		regPane = new JPanel();
		jp_name = new JPanel();
		jp_addr = new JPanel();
		jl_regtitle = new JLabel("\n========= 회원등록 =========");
		jl_name = new JLabel("이름");
		jl_addr = new JLabel("주소");
		jt_name = new JTextField(20);
		jt_addr = new JTextField(20);
		btnReg2 = new JButton("등록");
		btnExit2 = new JButton("취소");
		jl_name.setFont(font); jl_addr.setFont(font);
		
		jl_regtitle.setFont(new Font("맑은 고딕",Font.BOLD,16));
		jp_name.add(jl_name);  jp_name.add(jt_name);
		jp_addr.add(jl_addr);  jp_addr.add(jt_addr);
		
		regPane.add(jp_name);
		regPane.add(jp_addr);
		
		regPane.add(jl_regtitle);
		regPane.add(jp_name);
		regPane.add(jp_addr);
		menuPane.add(btnReg2);
		menuPane.add(btnExit2);
		add(regPane, BorderLayout.CENTER);
		add(menuPane, BorderLayout.SOUTH);
		
		setVisible(true);
		
		
		
//		JOptionPane.showMessageDialog(null, "등록!!");
	}
	
	
	//리스트
	public void list() {
		mainPane.setVisible(false);
		listPane = new JPanel();
		ta = new TextArea(25,65);
		ta.append("리스트 출력");
		
		listPane.setSize(300,300);
		listPane.add(ta);
		add(listPane, BorderLayout.CENTER);
		setVisible(true);
	}//list Method
	
	//search
	public void search() {
		mainPane.setVisible(false);
		searchPane = new JPanel();
		jp_search = new JPanel();
		jp_searchResult = new JPanel();
		jl_searchName = new JLabel("검색명>>");
		jt_search = new JTextField(20);
		sta = new TextArea(20,50);
		sta.setEditable(false);
		jl_searchName.setFont(font);
		
		jp_search.add(jl_searchName);
		jp_search.add(jt_search);
		jp_searchResult.add(sta);
		
		searchPane.add(jp_search);
		searchPane.add(jp_searchResult);
		
		add(searchPane, BorderLayout.CENTER);
		setVisible(true);
		
	}//search method
	
	//update
	public void update() {
		updatePane = new JPanel();
		jp_updateName = new JPanel(); 
		jp_updateAddr = new JPanel(); 
		jp_updateSearch = new JPanel();
		jl_updateName = new JLabel("이름");  
		jl_updateAddr = new JLabel("주소");
		jl_updateSearchName = new JLabel("수정명>>");
		jt_updateName = new JTextField(20); 
		jt_updateAddr = new JTextField(20); 
		jt_updateSearch = new JTextField(20);
		
		jl_updateName.setFont(font);
		jl_updateAddr.setFont(font);
		jl_updateSearchName.setFont(font);
		
		jp_updateSearch.add(jl_updateSearchName);
		jp_updateSearch.add(jt_updateSearch);
		jp_updateName.add(jl_updateName);
		jp_updateName.add(jt_updateName);
		jp_updateAddr.add(jl_updateAddr);
		jp_updateAddr.add(jt_updateAddr);

		updatePane.add(jp_updateSearch);
		updatePane.add(jp_updateName);
		updatePane.add(jp_updateAddr);
		
		add(updatePane, BorderLayout.CENTER);
		setVisible(true);
		
	}
	
	
	//delete
	public void delete() {
	deletePane = new JPanel(); 
	jp_deleteSearch = new JPanel();
	jl_deleteSearchName = new JLabel("삭제명>>");
	jt_deleteSearch = new JTextField(20);
	jl_deleteSearchName.setFont(font);
	
	jp_deleteSearch.add(jl_deleteSearchName);
	jp_deleteSearch.add(jt_deleteSearch);
	deletePane.add(jp_deleteSearch);
	
	add(deletePane, BorderLayout.CENTER);
	setVisible(true);
	
	}//delete method
	
	
	
	
	//이벤트처리 클래스
	class MemberMgmUIEvent extends WindowAdapter implements ActionListener{
		
		public void windowClosing(WindowEvent we) {
			JOptionPane.showMessageDialog(null, "프로그램 종료!!");
			System.exit(0);
		}
		public void actionPerformed(ActionEvent ae) {
			Object obj = ae.getSource();
			if(btnReg == obj) {
				register();
			}else if(btnList == obj) {
				list();
			}else if(btnSearch == obj) {
				search();
			}else if(btnUpdate == obj) {
				update();
			}else if(btnDelete == obj) {
				delete();
			}else if(btnExit == obj) {
				JOptionPane.showMessageDialog(null, "프로그램 종료!!");
				System.exit(0);
			}
		}
		
	}//event class

	
}//class




