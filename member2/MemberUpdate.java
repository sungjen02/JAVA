package member2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MemberUpdate {
	//Field
	MemberMgmUI main;
	JPanel updatePane;
	JPanel jp_updateName, jp_updateAddr, jp_updateSearch, ju_button, jp_title;
	JLabel jl_updateName, jl_updateAddr, jl_updateSearchName, jl_title;
	JTextField jt_updateName, jt_updateAddr, jt_updateSearch;
	JButton btnupdate, btnrewrite;
	
	//Constructor
			public MemberUpdate() {}
			public MemberUpdate(MemberMgmUI main) {
				this.main = main;
				this.updatePane = main.updatePane;
			}
	public void update() {
			//switchPane("update");
			main.switchPane(MemberMgmUI.UPDATE);
			
			jp_title = new JPanel();
			jp_updateName = new JPanel();
			jp_updateAddr = new JPanel();
			jp_updateSearch = new JPanel();
			ju_button = new JPanel();
			jl_title = new JLabel("회원 수정");
			jl_updateName = new JLabel("이름");
			jl_updateAddr = new JLabel("주소");
			jl_updateSearchName = new JLabel("수정명>>");		
			jt_updateName = new JTextField(20);
			jt_updateAddr = new JTextField(20);
			jt_updateSearch = new JTextField(20);
			btnupdate = new JButton("수정");
			btnrewrite = new JButton("다시쓰기");
			
			jl_title.setFont(MemberMgmUI.font);
			jl_updateName.setFont(MemberMgmUI.font);
			jl_updateAddr.setFont(MemberMgmUI.font);
			jl_updateSearchName.setFont(MemberMgmUI.font);
			
			
			jp_title.add(jl_title);
			jp_updateSearch.add(jl_updateSearchName);
			jp_updateSearch.add(jt_updateSearch);
			jp_updateName.add(jl_updateName);
			jp_updateName.add(jt_updateName);
			jp_updateAddr.add(jl_updateAddr);
			jp_updateAddr.add(jt_updateAddr);
			ju_button.add(btnupdate);
			ju_button.add(btnrewrite);
			
			updatePane.add(jp_title);
			updatePane.add(jp_updateSearch);
			updatePane.add(jp_updateName);
			updatePane.add(jp_updateAddr);
			updatePane.add(ju_button);
			
			main.add(updatePane, BorderLayout.CENTER);
			main.setVisible(true);		
			
			MemberUpdateEvent eventObj = new MemberUpdateEvent();
			jt_updateSearch.addActionListener(new MemberUpdateEvent());
			btnupdate.addActionListener(eventObj);
			btnrewrite.addActionListener(eventObj);
			
		}//update method
	
	//updateProc
	public void updateProc() {
		//1. 수정명 가져오기
		String name = jt_updateSearch.getText().trim();
		
		//2. 리스트에서 데이터 찾기
		MemberVO rvo = null;
		for (MemberVO vo : MemberMgmUI.list) {
			if(vo.getName().equals(name))	rvo = vo;
		}
		
		//3. 수정폼에 넣기
		if(rvo != null) {
			jt_updateName.setText(rvo.getName());
			jt_updateAddr.setText(rvo.getAddr());
		}else {
			JOptionPane.showMessageDialog(null, 
					main.getMsg("수정할 데이터가 존재하지 않습니다"));
			
		}
		
	
		
	}
	
	
	//updateFromCheck
	public boolean updateFromCheck() {
		boolean result = false;
		
		if(jt_updateSearch.getText().equals("")) {
			JOptionPane.showMessageDialog(null, main.getMsg("수정명을 입력해주세요"));
			jt_updateSearch.requestFocus();
			
		}else if(jt_updateName.getText().equals("")) {
			JOptionPane.showMessageDialog(null, main.getMsg("이름을 입력해주세요"));
			jt_updateName.requestFocus();
		}else if(jt_updateAddr.getText().equals("")) {
			JOptionPane.showMessageDialog(null, main.getMsg("주소를 입력해주세요"));
			jt_updateName.requestFocus();
		}else {
			result = true;
		}
		return result;
	}//updateFormCheck
	
	//updateResult
	private void updateResult() {
				String name = jt_updateSearch.getText().trim();
				
//				MemberVO rvo = null;
				for (MemberVO vo : MemberMgmUI.list) {
					if(vo.getName().equals(name)) {
						vo.setName(jt_updateName.getText());
						vo.setAddr(jt_updateAddr.getText());
						JOptionPane.showMessageDialog(null, main.getMsg("수정이 완료되었습니다."));
					}
//					rvo = vo;
				}
				
//				if(rvo != null) {
//					jt_updateName.setText(rvo.getName());
//					jt_updateAddr.setText(rvo.getAddr());
//				}else {
//					JOptionPane.showMessageDialog(null, 
//							main.getMsg("수정할 데이터가 존재하지 않습니다"));
//					
//				}
	}
	
	
	//formReset
	public void formReset() {
		jt_updateSearch.setText("");	jt_updateName.setText(""); jt_updateAddr.setText("");
		jt_updateSearch.requestFocus();
	}
		
	
	//이벤트 처리 클래스
	class MemberUpdateEvent implements ActionListener{
		public void actionPerformed(ActionEvent ae) {
			Object obj = ae.getSource();
			if(obj == jt_updateSearch) {
				//검색명 확인 후 수정 폼 데이터 입력
				updateProc();
			}else if(obj == btnupdate) {
				//수정완료
				if(updateFromCheck()) updateResult();
			}else if(obj == btnrewrite) {
				//다시쓰기
				formReset();
			}
		}

		
	}

	
	
}
