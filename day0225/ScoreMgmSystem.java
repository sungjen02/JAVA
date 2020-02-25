package day0225;

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
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ScoreMgmSystem {
	JFrame jf;
	JPanel jp_title, jp_uni, jp_name, jp_kor, jp_eng, jp_math, jp_button;
	JLabel title, uni, name, kor, eng, math, button;
	JTextField tuni, tname, tkor, teng, tmath;
	JButton btnreg, btnesc, btnlist, btnexit;

	
	public ScoreMgmSystem(){
		Font font = new Font("���� ���", Font.BOLD, 12);
	
		jf = new JFrame("Score Mgm System");
	
		JPanel jp_title = new JPanel();
		JPanel jp_uni = new JPanel();
		JPanel jp_name = new JPanel();
		JPanel jp_kor = new JPanel();
		JPanel jp_eng = new JPanel();
		JPanel jp_math = new JPanel();
		JPanel jp_button = new JPanel();
	
		
		JLabel title = new JLabel("ScoreMgmSystem");
		JLabel uni = new JLabel("�й�");
		JLabel name = new JLabel("�̸�");
		JLabel kor = new JLabel("����");
		JLabel eng = new JLabel("����");
		JLabel math = new JLabel("����");
		tuni = new JTextField(20);
		tname = new JTextField(20);
		tkor = new JTextField(20);
		teng = new JTextField(20);
		tmath = new JTextField(20);
		JButton btnreg = new JButton("���");
		JButton btnesc = new JButton("���");
		JButton btnlist = new JButton("����Ʈ");
		JButton btnexit = new JButton("����");
		
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
		int height = (int)(scsize.getWidth()-fsize.getWidth())/2;
		
		jf.setLocation(width,height);
		jf.setVisible(true);		
		
		ScoreMgmSystemEvent eventObject = new ScoreMgmSystemEvent();
		jf.addWindowListener(eventObject);
		btnreg.addActionListener(eventObject);
		btnesc.addActionListener(eventObject);
		btnlist.addActionListener(eventObject);
		btnexit.addActionListener(eventObject);
	}
	
	//�̺�Ʈ ó�� Ŭ����
	class ScoreMgmSystemEvent extends WindowAdapter implements ActionListener{

		public void windowClosing(WindowEvent e) {
			System.out.println("== ���α׷� ���� ==");
			System.exit(0);
		}

		public void actionPerformed(ActionEvent e) {
			Object obj = e.getSource();
			if(btnreg == obj || tmath == obj) {
				System.out.println("���~~");
			}else if(btnesc == obj) {
				System.out.println("���");
			}else if(btnlist == obj) {
				System.out.println("����Ʈ");
			}else if(btnexit == obj) {
				System.out.println("== ���α׷� ���� ==");
			}
		}
		
				}

}