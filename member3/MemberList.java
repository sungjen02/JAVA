package member3;

import java.awt.BorderLayout;
import java.awt.TextArea;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MemberList {
	//Field
	JPanel listPane;
	TextArea ta;
	MemberMgmUI main;
	
	//Constructor
	public MemberList() {}
	public MemberList(MemberMgmUI main) {
		this.main = main;
		this.listPane = main.listPane;
	}
	
	public void list() {	
		//switchPane("list");
		main.switchPane(MemberMgmUI.LIST);
		
		ta = new TextArea(28,65);
		ta.setEditable(false);
		
			if(MemberMgmUI.list.size() !=0) {
				ta.append("\n\t\t 회원 리스트 출력" + "\n\n");
				ta.append("-----------------------------------------------------\n");
				ta.append("번호\t\t이름\t\t주소" + "\n");
				ta.append("-----------------------------------------------------\n");
				int no = 1;
				for (MemberVO vo : MemberMgmUI.list) {
					ta.append(no + "\t\t");
					ta.append(vo.getName() + "\t\t");
					ta.append(vo.getAddr() + "\n\n");
					no++;
				}
			}else {
				JOptionPane.showMessageDialog(null, "데이터가 없습니다");
			}
		
		listPane.setSize(300,300);
		listPane.add(ta);
		main.add(listPane, BorderLayout.CENTER);
		main.setVisible(true);
		
	}//list method
}
