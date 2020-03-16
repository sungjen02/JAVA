package member3;

import java.awt.BorderLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MemberSearch {
	//Field
	JPanel searchPane, jp_search, jp_searchResult, jp_title;
	MemberMgmUI main;
	TextArea sta;
	JLabel jl_searchName, jl_title;
	JTextField jt_search;
	JPanel js_button;
	JButton btnsearch;
	
	//Constructor
		public MemberSearch() {}
		public MemberSearch(MemberMgmUI main) {
			this.main = main;
			this.searchPane = main.searchPane;
		}
	
	
	//search
		public void search() {		
			//switchPane("search");
			main.switchPane(MemberMgmUI.SEARCH);
			
			jp_title = new JPanel();
			jp_search = new JPanel();
			jp_searchResult = new JPanel();
			js_button = new JPanel();
			jl_title = new JLabel("ȸ�� �˻�");
			jl_searchName = new JLabel("�˻��� >>");
			jt_search = new JTextField(20);
			btnsearch = new JButton("�˻�");
			sta = new TextArea(40,60);
			sta.setEditable(false);
			jl_searchName.setFont(MemberMgmUI.font);
			jl_title.setFont(MemberMgmUI.font);
			
			jp_title.add(jl_title);
			jp_search.add(jl_searchName);
			jp_search.add(jt_search);
			js_button.add(btnsearch);
			jp_searchResult.add(sta);
			
			searchPane.add(jp_title);
			searchPane.add(jp_search);
			searchPane.add(js_button);
			searchPane.add(jp_searchResult);
			
			main.add(searchPane, BorderLayout.CENTER);
			main.setVisible(true);		
		
			//������
			MemberSearchEvent searchEvent = new MemberSearchEvent();
			jt_search.addActionListener(searchEvent);
			btnsearch.addActionListener(searchEvent);
		
		}//search method
		
		public void searchProc() {
			//1.�˻��� �������� : jt_search
			String name = jt_search.getText().trim();
			
			//2. ArrayList�� ����� MemberVo ��ü���� getName()
			MemberVO rvo = null;
			for (MemberVO vo : MemberMgmUI.list) {
				if(vo.getName().equals(name)){
					rvo = vo;
//					sta.append(vo.getName() + "\t");
//					sta.append(vo.getAddr() + "\t\n");
					
				}
//				else {
//					System.out.println("������ ����");
//				}
			}
			//3. �˻� ����� ���� JOption~
			if(rvo != null) {
				sta.append(rvo.getName() + "\t");
				sta.append(rvo.getAddr() + "\t");
			}else {
				sta.append("�����Ͱ� �������� �ʽ��ϴ�.");
			}
		}
		
		//�̺�Ʈ ó�� Ŭ����
		class MemberSearchEvent implements ActionListener{

			public void actionPerformed(ActionEvent ae) {
				Object obj = ae.getSource();
				if(btnsearch == obj) {
					sta.setText("");
					searchProc();				
					}
			}
			
		}

}