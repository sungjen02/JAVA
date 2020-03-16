package member2;

import java.awt.BorderLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MemberRegister {
	//Field
	
	//���
		JPanel regPane;
		JPanel  jp_name, jp_addr, jp_button, jp_title;
		JLabel jl_name, jl_addr, jl_title;
		JTextField jt_name, jt_addr;
		MemberMgmUI main;
		JButton btnReg, btnReset;
		
		//����Ʈ
		JPanel listPane;
		TextArea ta;
		
		//�˻�
		JPanel searchPane, jp_search, jp_searchResult;
		JLabel jl_searchName;
		JTextField jt_search;
		TextArea sta;
		
		//����
		JPanel updatePane, jp_updateName, jp_updateAddr, jp_updateSearch;
		JLabel jl_updateName, jl_updateAddr, jl_updateSearchName;
		JTextField jt_updateName, jt_updateAddr, jt_updateSearch;
		
		//����
		JPanel deletePane, jp_deleteSearch;
		JLabel jl_deleteSearchName;
		JTextField jt_deleteSearch;
		
		
		//Constructor
		public MemberRegister() {}
		public MemberRegister(MemberMgmUI main) {
			this.main = main;
			this.regPane = main.regPane;
		}
		
		//Method
		
		public void register() {
			//switchPane("register");
			main.switchPane(MemberMgmUI.REGISTER);
			
			jp_title = new JPanel();
			jp_name = new JPanel();
			jp_addr = new JPanel();
			jp_button = new JPanel();
			
			jl_title = new JLabel("ȸ�����");
			jl_name = new JLabel("�̸�");
			jl_addr = new JLabel("�ּ�");
			jt_name = new JTextField(20);
			jt_addr = new JTextField(20);
			btnReg = new JButton("����ϱ�");
			btnReset = new JButton("�ٽþ���");
			
			btnReg.setFont(MemberMgmUI.font);
			jl_title.setFont(MemberMgmUI.font);
			jl_name.setFont(MemberMgmUI.font);  
			jl_addr.setFont(MemberMgmUI.font);
			
			jp_title.add(jl_title);
			jp_name.add(jl_name);   jp_name.add(jt_name);
			jp_addr.add(jl_addr);  jp_addr.add(jt_addr);
			jp_button.add(btnReg);	jp_button.add(btnReset);
			
			regPane.add(jp_title);
			regPane.add(jp_name);
			regPane.add(jp_addr);
			regPane.add(jp_button);
			
			main.add(regPane, BorderLayout.CENTER);
			main.setVisible(true);
			
			
			//������
			MemberRegisterEvent regEvent = new MemberRegisterEvent();
			btnReg.addActionListener(regEvent);
			btnReset.addActionListener(regEvent);
			
		}//register method
		
		
		
		//list
		public void list() {	
			//switchPane("list");
			main.switchPane(MemberMgmUI.LIST);
			
			main.ta = new TextArea(28,65);
			main.ta.setEditable(false);
			main.ta.append("����Ʈ ���");
			
				
			main.listPane.setSize(300,300);
			main.listPane.add(main.ta);
			main.add(main.listPane, BorderLayout.CENTER);
			main.setVisible(true);
			
		}//list method
		
		//regFrmCheck
		public boolean regFormCheck() {
			boolean result = false;
			if(jt_name.getText().equals("")){
				JOptionPane.showMessageDialog(null, main.getMsg("�̸��� �Է����ּ���"));
				jt_name.requestFocus();
			}else if(jt_addr.getText().equals("")) {
				JOptionPane.showMessageDialog(null, main.getMsg("�ּҸ� �Է����ּ���"));
				jt_addr.requestFocus();
			}else {
				result = true;
			}
			return result;
		}
		
		//registerProc
		public void registerProc() {
			//MemberVO ��ü�� �����Ͽ� ���
			MemberVO vo = new MemberVO();
			vo.setName(jt_name.getText());
			vo.setAddr(jt_addr.getText());
			
			if(MemberMgmUI.list.add(vo)) {
				JOptionPane.showMessageDialog(null, main.getMsg("��� ����!!"));
			}
			
		}
		
		//formReset
	public void formReset() {
		jt_name.setText(""); 	jt_addr.setText("");	jt_name.requestFocus();
	}
	
		
		//�̺�Ʈ ó�� Ŭ����
		class MemberRegisterEvent implements ActionListener{
			
			public void actionPerformed(ActionEvent ae) {
				Object obj = ae.getSource();
				if(btnReg == obj) {
//					JOptionPane.showMessageDialog(null, "���");
					if(regFormCheck()) registerProc();
				}else if(btnReset == obj) {
//					JOptionPane.showMessageDialog(null, "���");
					formReset();
				}
			}
		}


}//class