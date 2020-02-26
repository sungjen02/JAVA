package day0225;

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

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ScoreMgmSystem {
	JFrame jf, jf_list;
	TextArea ta_list;
	JPanel jp_title, jp_uni, jp_name, jp_kor, jp_eng, jp_math, jp_button;
	JLabel title, uni, name, kor, eng, math, button;
	JTextField tuni, tname, tkor, teng, tmath;
	JButton btnreg, btnesc, btnlist, btnexit;

	ArrayList<ScoreVO> list = new ArrayList<ScoreVO>();
	
	public ScoreMgmSystem(){
		//Field
//		ScoreVO[] list = new ScoreVO[10];
		Font font = new Font("맑은 고딕", Font.BOLD, 12);
	
		jf = new JFrame("Score Mgm System");
	
		JPanel jp_title = new JPanel();
		JPanel jp_uni = new JPanel();
		JPanel jp_name = new JPanel();
		JPanel jp_kor = new JPanel();
		JPanel jp_eng = new JPanel();
		JPanel jp_math = new JPanel();
		JPanel jp_button = new JPanel();
	
		
		JLabel title = new JLabel("ScoreMgmSystem");
		JLabel uni = new JLabel("학번");
		JLabel name = new JLabel("이름");
		JLabel kor = new JLabel("국어");
		JLabel eng = new JLabel("영어");
		JLabel math = new JLabel("수학");
		tuni = new JTextField(20);
		tname = new JTextField(20);
		tkor = new JTextField(20);
		teng = new JTextField(20);
		tmath = new JTextField(20);
		
		btnreg = new JButton("등록");
		btnesc = new JButton("취소");
		btnlist = new JButton("리스트");
		btnexit = new JButton("종료");
		
		title.setFont(font); uni.setFont(font); name.setFont(font); 
		kor.setFont(font); eng.setFont(font); math.setFont(font); 
		btnreg.setFont(font);		btnesc.setFont(font); btnlist.setFont(font); btnexit.setFont(font);
		
		
		jp_title.add(title);
		jp_uni.add(uni);	jp_uni.add(tuni);	
		jp_name.add(name); jp_name.add(tname); 		
		jp_kor.add(kor); jp_kor.add(tkor);		
		jp_eng.add(eng); jp_eng.add(teng);	
		jp_math.add(math); jp_math.add(tmath);
		jp_button.add(btnreg);	jp_button.add(btnesc); jp_button.add(btnlist); jp_button.add(btnexit);
		
		jf.setLayout(new GridLayout(7,1));
		jf.add(jp_title); 
		jf.add(jp_uni);	
		jf.add(jp_name);		
		jf.add(jp_kor);		
		jf.add(jp_eng);		
		jf.add(jp_math);		
		jf.add(jp_button);
		
		jf.setSize(400,400);
		Dimension fsize = jf.getSize();
		Dimension scsize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int)(scsize.getWidth()-fsize.getWidth())/2;
		int height = (int)(scsize.getWidth()-fsize.getWidth())/5;
		
		jf.setLocation(width,height);
		jf.setVisible(true);		
		
		ScoreMgmSystemEvent eventObject = new ScoreMgmSystemEvent();
		jf.addWindowListener(eventObject);
		btnreg.addActionListener(eventObject);
		btnesc.addActionListener(eventObject);
		btnlist.addActionListener(eventObject);
		btnexit.addActionListener(eventObject);
		tmath.addActionListener(eventObject);
	}
	
	/** 등록 **/
	public void register() {
		//ScoreVO 객체를 이용하여 등록
		ScoreVO vo = new ScoreVO();
		vo.setUni(tuni.getText());
		vo.setName(tname.getText());
		vo.setKor(Integer.parseInt(tkor.getText()));
		vo.setEng(Integer.parseInt(teng.getText()));
		vo.setMath(Integer.parseInt(tmath.getText()));
		
		if(list.add(vo))
			JOptionPane.showMessageDialog(null, "등록성공!!");
				
//		System.out.println(vo.getuni());
//		System.out.println(vo.getname());
//		System.out.println(vo.getkor());
//		System.out.println(vo.geteng());
//		System.out.println(vo.getmath());
//		System.out.println(vo.getTot());
//		System.out.println(vo.getAvg());
	}
	
	/** 취소 **/
	public void formReset() {
		tuni.setText("");				tname.setText("");
		tkor.setText("");				teng.setText("");				tmath.setText("");
		tuni.requestFocus();
	}
	
	/** 리스트 **/
	public void list() {
		jf_list = new JFrame("리스트 출력");
		ta_list = new TextArea(200,200);
		ta_list.setEditable(false);
//		ta_list.setEnabled(false);
		ta_list.append("\n===== textarea 리스트 출력 =====\n");
		ta_list.append("\n-------------------------------------------------------\n");
		ta_list.append("\n학번\t이름\t국어\t영어\t수학\t총점\t평균\n");
		ta_list.append("\n------------------------------------------------------\n");
		
				if(list.size() != 0 ) {
				for (ScoreVO vo : list) {
					ta_list.append(vo.getUni() + "\t"); 
					ta_list.append(vo.getName() + "\t"); 
					ta_list.append(vo.getKor() + "\t"); 
					ta_list.append(vo.getEng() + "\t"); 
					ta_list.append(vo.getMath() + "\t"); 
					ta_list.append(vo.getTot() + "\t"); 
					ta_list.append(vo.getAvg() + "\t"); 
				}
			}else {
				JOptionPane.showMessageDialog(null, "데이터가 없습니다.");
			}
	
		
		jf_list.add(ta_list);
		jf_list.setSize(500,300);
		jf_list.setLocation(400,100);
		jf_list.setVisible(true);
		

	}
	
	//이벤트 처리 클래스
	class ScoreMgmSystemEvent extends WindowAdapter implements ActionListener{

		public void windowClosing(WindowEvent e) {
			JOptionPane.showMessageDialog(null, "프로그램을 종료합니다");
			System.exit(0);
		}
		/** 액션 이벤트 처리**/
		public void actionPerformed(ActionEvent e) {
			Object obj = e.getSource();
			if(btnreg == obj || tmath == obj) {
				formCheck();		register();
				
			}else if(btnesc == obj) {
				formReset();
			}else if(btnlist == obj) {
				list();
			}else if(btnexit == obj) {
				JOptionPane.showMessageDialog(null, "프로그램을 종료합니다");
				System.exit(0);
			}
		}
		
				}

	public boolean formCheck() {
		boolean result = false;
		//tuni, tname, tkor, teng, tmath;
		if(tuni.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "학번을 입력해주세요");
			tuni.requestFocus();
		}else if(tname.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "이름을 입력해주세요");
			tname.requestFocus();
		}else if(tkor.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "을 입력해주세요");
			tkor.requestFocus();
		}else if(teng.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "이름을 입력해주세요");
			teng.requestFocus();
		}else if(tmath.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "이름을 입력해주세요");
			tmath.requestFocus();
		}else {
			result = true;
		}
		return result;
	}
	 

}