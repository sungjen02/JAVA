package member2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MemberDelete {
	//Field
		MemberMgmUI main;
		JPanel  jp_deleteSearch, deletePane, jp_title;
		JLabel jl_deleteSearchName, jl_title;
		JTextField jt_deleteSearch;
		
		
		//Constructor
			public MemberDelete() {}
			public MemberDelete(MemberMgmUI main) {
				this.main = main;
				this.deletePane = main.deletePane;
				}
	//delete
		public void delete() {
			//switchPane("delete");
			main.switchPane(MemberMgmUI.DELETE);
			
			jp_title = new JPanel();
			jp_deleteSearch = new JPanel();
			jl_title = new JLabel("회원 삭제");
			jl_deleteSearchName = new JLabel("삭제명>>");
			jt_deleteSearch = new JTextField(20);
			
			jl_title.setFont(MemberMgmUI.font);
			jl_deleteSearchName.setFont(MemberMgmUI.font);
			
			jp_title.add(jl_title);
			jp_deleteSearch.add(jl_deleteSearchName);
			jp_deleteSearch.add(jt_deleteSearch);
			
			deletePane.add(jp_title);
			deletePane.add(jp_deleteSearch);
			
			main.add(deletePane, BorderLayout.CENTER);
			main.setVisible(true);
			
			jt_deleteSearch.addActionListener(new MemberDeleteEvent());
			
			
		}//delete method
		
		
		public boolean deleteDataCheck(String name) {
			boolean result = false;
//			String name = jt_deleteSearch.getText();
			for (MemberVO vo : MemberMgmUI.list) {
				if(vo.getName().equals(name)) result = true;
			}
			
			return result;
		}
		

	public boolean deleteFromCheck() {
		boolean result = false;
		if(jt_deleteSearch.getText().equals("")) {
			JOptionPane.showMessageDialog(null, main.getMsg("삭제명을 입력해주세요"));
			jt_deleteSearch.requestFocus();
		result = true;
	}
		return result;
	}

	

	public void deleteProc(String name) {
//		String name = jt_deleteSearch.getText();
		Iterator<MemberVO> it = MemberMgmUI.list.iterator();
		while(it.hasNext()) {
			MemberVO vo = it.next();
			if(vo.getName().equals(name)) {
				it.remove();
				JOptionPane.showMessageDialog(null, main.getMsg("삭제가 완료되었습니다."));
			}
		}
		
		
//		for (MemberVO vo : MemberMgmUI.list) {
//			if(vo.getName().equals(name)) {
//				if(MemberMgmUI.list.remove(vo));{
//					JOptionPane.showMessageDialog(null, main.getMsg("삭제가 완료되었습니다"));
//		}
//	}
//	}
	}
	
	//이벤트 처리 클래스
	class MemberDeleteEvent implements ActionListener{

		public void actionPerformed(ActionEvent ae) {
			String name = "";
			if(!jt_deleteSearch.getText().equals("")) {
				
			if(deleteDataCheck(name)) {
				int result = JOptionPane.showConfirmDialog(null, main.getMsg("정말로 삭제하시겠습니까?"));
				if(result == 0)	deleteProc(name);
				}else {
				//삭제할 데이터 없음
				JOptionPane.showMessageDialog(null, main.getMsg("삭제할 데이터가 없습니다"));
			}
			}else {
				JOptionPane.showMessageDialog(null, main.getMsg("삭제명을 입력해주세요"));
				jt_deleteSearch.requestFocus();
				
			}
			
//			if(obj == jt_deleteSearch) {
//				if(deleteFromCheck()) deleteResult();
//			}
		}

		
		
	}





}