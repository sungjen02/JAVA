package member2;

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
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MemberMgmUI extends JFrame{
	//Field
	public static ArrayList<MemberVO> list = new ArrayList<MemberVO>();
	
	public static final int REGISTER = 1;
	public static final int LIST = 2;
	public static final int SEARCH = 3;
	public static final int UPDATE = 4;
	public static final int DELETE = 5;
	
	JPanel mainPane, menuPane;	
	JButton btnReg, btnList, btnSearch, btnUpdate, btnDelete, btnExit;	
	JLabel jl_title, jl_img;

	JPanel regPane = new JPanel(new GridLayout(10,1));
	JPanel listPane = new JPanel();
	JPanel searchPane = new JPanel(new GridLayout(8,1));
	JPanel updatePane = new JPanel(new GridLayout(10,1));
	JPanel deletePane = new JPanel(new GridLayout(10,1));
//	//���
//	JPanel  jp_name, jp_addr;
//	JLabel jl_name, jl_addr;
//	JTextField jt_name, jt_addr;
	
	//����Ʈ
	TextArea ta;
	
	//�˻�
	JPanel jp_search, jp_searchResult;
	JLabel jl_searchName;
	JTextField jt_search;
	TextArea sta;
	
	//����
	JPanel jp_updateName, jp_updateAddr, jp_updateSearch;
	JLabel jl_updateName, jl_updateAddr, jl_updateSearchName;
	JTextField jt_updateName, jt_updateAddr, jt_updateSearch;
	
	//����
	JPanel  jp_deleteSearch;
	JLabel jl_deleteSearchName;
	JTextField jt_deleteSearch;
	
	public static Font font = new Font("���� ���", Font.BOLD, 12);
	
	//Constructor
	public MemberMgmUI() {
		start();
	}
	
	//Method
	public void start() {
		mainPane = new JPanel();	
//		regPane = new JPanel();
//		listPane = new JPanel();
//		searchPane = new JPanel();
//		updatePane = new JPanel();
//		deletePane = new JPanel();
		
		menuPane = new JPanel(new GridLayout(10,1));
		jl_title = new JLabel("\n== ȸ����� �ý��ۿ� ���Ű��� ȯ���մϴ� ==");
		jl_img = new JLabel(new ImageIcon("src/member/main.png"));
		
		btnReg = new JButton("ȸ�����");
		btnList = new JButton("ȸ������Ʈ");
		btnSearch = new JButton("ȸ���˻�");
		btnUpdate = new JButton("ȸ������");
		btnDelete = new JButton("ȸ������");
		btnExit = new JButton("����");
		
		jl_title.setFont(new Font("���� ���",Font.BOLD,16));
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
		
		MemberMgmUIEvent eventObj = new MemberMgmUIEvent(this);
		addWindowListener(eventObj);
		btnReg.addActionListener(eventObj);
		btnList.addActionListener(eventObj);
		btnSearch.addActionListener(eventObj);
		btnUpdate.addActionListener(eventObj);
		btnDelete.addActionListener(eventObj);
		btnExit.addActionListener(eventObj);

	}//start method
	
	//register
//	public void register() {
//		//switchPane("register");
//		switchPane(MemberMgmUI.REGISTER);
//		
//		jp_name = new JPanel();
//		jp_addr = new JPanel();
//		jl_name = new JLabel("�̸�");
//		jl_addr = new JLabel("�ּ�");
//		jt_name = new JTextField(20);
//		jt_addr = new JTextField(20);
//		
//		jl_name.setFont(font);  jl_addr.setFont(font);
//		
//		jp_name.add(jl_name);   jp_name.add(jt_name);
//		jp_addr.add(jl_addr);  jp_addr.add(jt_addr);
//		
//		regPane.add(jp_name);
//		regPane.add(jp_addr);
//		
//		add(regPane, BorderLayout.CENTER);
//		setVisible(true);
//	}//register method
//	
//	//list
//	public void list() {	
//		//switchPane("list");
//		switchPane(MemberMgmUI.LIST);
//		
//		ta = new TextArea(28,65);
//		ta.setEditable(false);
//		ta.append("����Ʈ ���");
//		
//		listPane.setSize(300,300);
//		listPane.add(ta);
//		add(listPane, BorderLayout.CENTER);
//		setVisible(true);
//	}//list method
	
//	//search
//	public void search() {		
//		//switchPane("search");
//		switchPane(MemberMgmUI.SEARCH);
//		
//		jp_search = new JPanel();
//		jp_searchResult = new JPanel();
//		jl_searchName = new JLabel("�˻��� >>");
//		jt_search = new JTextField(20);
//		sta = new TextArea(20,50);
//		sta.setEditable(false);
//		jl_searchName.setFont(font);
//		
//		jp_search.add(jl_searchName);
//		jp_search.add(jt_search);
//		jp_searchResult.add(sta);
//		
//		searchPane.add(jp_search);
//		searchPane.add(jp_searchResult);
//		
//		add(searchPane, BorderLayout.CENTER);
//		setVisible(true);		
//	}//search method
	
//	//update
//	public void update() {
//		//switchPane("update");
//		switchPane(MemberMgmUI.UPDATE);
//		
//		jp_updateName = new JPanel();
//		jp_updateAddr = new JPanel();
//		jp_updateSearch = new JPanel();
//		jl_updateName = new JLabel("�̸�");
//		jl_updateAddr = new JLabel("�ּ�");
//		jl_updateSearchName = new JLabel("������>>");		
//		jt_updateName = new JTextField(20);
//		jt_updateAddr = new JTextField(20);
//		jt_updateSearch = new JTextField(20);
//		
//		jl_updateName.setFont(font);
//		jl_updateAddr.setFont(font);
//		jl_updateSearchName.setFont(font);
//		
//		jp_updateSearch.add(jl_updateSearchName);
//		jp_updateSearch.add(jt_updateSearch);
//		jp_updateName.add(jl_updateName);
//		jp_updateName.add(jt_updateName);
//		jp_updateAddr.add(jl_updateAddr);
//		jp_updateAddr.add(jt_updateAddr);
//		
//		updatePane.add(jp_updateSearch);
//		updatePane.add(jp_updateName);
//		updatePane.add(jp_updateAddr);
//		
//		add(updatePane, BorderLayout.CENTER);
//		setVisible(true);		
//	}//update method
	
//	//delete
//	public void delete() {
//		//switchPane("delete");
//		switchPane(MemberMgmUI.DELETE);
//		
//		jp_deleteSearch = new JPanel();
//		jl_deleteSearchName = new JLabel("������>>");
//		jt_deleteSearch = new JTextField(20);
//		jl_deleteSearchName.setFont(font);
//		
//		jp_deleteSearch.add(jl_deleteSearchName);
//		jp_deleteSearch.add(jt_deleteSearch);
//		deletePane.add(jp_deleteSearch);
//		
//		add(deletePane, BorderLayout.CENTER);
//		setVisible(true);
//		
//	}//delete method
	
	//�޴� �̵� ����
	public void resetPane() {
		mainPane.setVisible(false);
		regPane.setVisible(false);
		listPane.setVisible(false);
		searchPane.setVisible(false);
		updatePane.setVisible(false);
		deletePane.setVisible(false);
	}
	
	public void switchPane(String menu) {
		resetPane();			
		if(menu.equals("register")) {
			regPane.removeAll();
			regPane.setVisible(true);
		}else if(menu.equals("list")) {		
			listPane.removeAll();
			listPane.setVisible(true);
		}else if(menu.equals("search")) {		
			searchPane.removeAll();
			searchPane.setVisible(true);
		}else if(menu.equals("update")) {		
			updatePane.removeAll();
			updatePane.setVisible(true);
		}else if(menu.equals("delete")) {		
			deletePane.removeAll();
			deletePane.setVisible(true);
		}
	}
	
	public void switchPane(int menu) {
		resetPane();
		switch(menu) {
		case 1 : 
			regPane.removeAll();
			regPane.setVisible(true);
			break;
		case 2 : 
			listPane.removeAll();
			listPane.setVisible(true);
			break;
		case 3 : 
			searchPane.removeAll();
			searchPane.setVisible(true);
			break;
		case 4 : 
			updatePane.removeAll();
			updatePane.setVisible(true);
			break;
		case 5 : 
			deletePane.removeAll();
			deletePane.setVisible(true);
			break;	
		}
	}//switchPane method

	//�޽����� �Է¹޾� JLabel �����ϰ� ��Ʈ�� �����Ͽ� ����
	public JLabel getMsg(String msg) {
		JLabel label = new JLabel(msg);
		label.setFont(font);
		return label;
	}
	
	
	//�̺�Ʈ ó�� Ŭ����
	class MemberMgmUIEvent extends WindowAdapter
							implements ActionListener{
		//Field
		MemberMgmUI main;
		//Constructor
		public MemberMgmUIEvent() {}
		
		public MemberMgmUIEvent(MemberMgmUI main) {
			this.main = main;
		}
		
		
		
		
		//������ �̺�Ʈ ó��
		public void windowClosing(WindowEvent we) {
			JOptionPane.showMessageDialog(null,getMsg("���α׷� ����!!!"));
			System.exit(0);
		}
		
		//�׼� �̺�Ʈ ó��
		public void actionPerformed(ActionEvent ae) {
			Object obj = ae.getSource();
			if(btnReg == obj) {
//				register();
				new MemberRegister(main).register();
			}else if(btnList == obj) {
//				list();
				new MemberList(main).list();
			}else if(btnSearch == obj) {
//				search();
				new MemberSearch(main).search();
			}else if(btnUpdate == obj) {
//				update();
				new MemberUpdate(main).update();
			}else if(btnDelete == obj) {
//				delete();
				new MemberDelete(main).delete();
			}else if(btnExit == obj) {
				String msg = "���α׷��� �����Ͻðڽ��ϱ�?";
				int result = JOptionPane.showConfirmDialog(null, getMsg(msg));
				if(result == 0)  System.exit(0);				
			}
		}		
	}//event class	
	
}//class



