package score_mgm_db;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ScoreMgmUI {
	//Field
	//ScoreVO[] list = new ScoreVO[10];
	ArrayList<ScoreVO> list = new ArrayList<ScoreVO>();
	Font font = new Font("���� ���", Font.BOLD, 12);
	JFrame jf, jf_list;
	JPanel jp_stuno, jp_name, jp_kor, jp_eng, jp_math, jp_button;
	JLabel jl_stuno, jl_name, jl_kor, jl_eng, jl_math;
	JTextField jt_stuno, jt_name, jt_kor, jt_eng, jt_math;
	JButton btnReg, btnReset, btnList, btnExit;
	TextArea ta_list;
	
	//File �����
	File f;
	FileInputStream fis;
	FileOutputStream fos;
	DataInputStream dis;
	DataOutputStream dos;	
	ObjectInputStream ois;
	ObjectOutputStream oos;
	
	ScoreDAO dao;

	//Constructor
	public ScoreMgmUI() {
		start();		
		dao = new ScoreDAO();
	}
	
	//Method
	/**
	 * ���� ȭ�� ���
	 */
	public void start() {
		jf = new JFrame("���� ��� �ý���");
		jf.setLayout(new GridLayout(6,1));
		jp_stuno = new JPanel();
		jp_name = new JPanel();
		jp_kor = new JPanel();
		jp_eng = new JPanel();
		jp_math = new JPanel();
		jp_button = new JPanel();
		
		jl_stuno = new JLabel("�й�");
		jl_name = new JLabel("�̸�");
		jl_kor = new JLabel("����");
		jl_eng = new JLabel("����");
		jl_math = new JLabel("����");
		jl_stuno.setFont(font);  jl_name.setFont(font);  jl_kor.setFont(font);
		jl_eng.setFont(font);   jl_math.setFont(font);
		
		jt_stuno = new JTextField(20);
		jt_name = new JTextField(20);
		jt_kor = new JTextField(20);
		jt_eng = new JTextField(20);
		jt_math = new JTextField(20);
		
		btnReg = new JButton("���");
		btnReset = new JButton("���");
		btnList = new JButton("����Ʈ");
		btnExit = new JButton("����");
		
		btnReg.setFont(font);  btnReset.setFont(font);
		btnList.setFont(font); btnExit.setFont(font);
			
		jp_stuno.add(jl_stuno);  jp_stuno.add(jt_stuno);
		jp_name.add(jl_name);  jp_name.add(jt_name);
		jp_kor.add(jl_kor);  jp_kor.add(jt_kor);
		jp_eng.add(jl_eng);  jp_eng.add(jt_eng);
		jp_math.add(jl_math);  jp_math.add(jt_math);
		jp_button.add(btnReg); jp_button.add(btnReset); 
		jp_button.add(btnList);  jp_button.add(btnExit);
		
		jf.add(jp_stuno);  jf.add(jp_name); jf.add(jp_kor);
		jf.add(jp_eng);  jf.add(jp_math); jf.add(jp_button);
		
		jf.setSize(300,300);
		jf.setLocation(100,100);
		jf.setVisible(true);
		
		//������ - �̺�Ʈ ó�� Ŭ���� ȣ��
		ScoreMgmUIEvent eventObj = new ScoreMgmUIEvent();
		jf.addWindowListener(eventObj);
		btnReg.addActionListener(eventObj);
		btnReset.addActionListener(eventObj);
		btnList.addActionListener(eventObj);
		btnExit.addActionListener(eventObj);
		jt_math.addActionListener(eventObj);		
	}
	
	/**
	 * ��ȿ�� üũ 
	 */
	public boolean formCheck() {
		boolean result = false;
		if(jt_stuno.getText().equals("")) {
			JOptionPane.showMessageDialog(null,"�й��� �Է����ּ���");
			jt_stuno.requestFocus();
		}else if(jt_name.getText().equals("")) {
			JOptionPane.showMessageDialog(null,"�̸��� �Է����ּ���");
			jt_name.requestFocus();
		}else if(jt_kor.getText().equals("")) {
			JOptionPane.showMessageDialog(null,"���������� �Է����ּ���");
			jt_kor.requestFocus();
		}else if(jt_eng.getText().equals("")) {
			JOptionPane.showMessageDialog(null,"���������� �Է����ּ���");
			jt_eng.requestFocus();
		}else if(jt_math.getText().equals("")) {
			JOptionPane.showMessageDialog(null,"���������� �Է����ּ���");
			jt_math.requestFocus();
		}else {
			result = true;
		}
		
		return result;
	}
	
	/**
	 * ���
	 */
	public void register() {
		//ScoreVO ��ü�� �̿��Ͽ� ���
		ScoreVO vo = new ScoreVO();
		vo.setStuno(jt_stuno.getText());
		vo.setName(jt_name.getText());
		vo.setKor(Integer.parseInt(jt_kor.getText()));
		vo.setEng(Integer.parseInt(jt_eng.getText()));
		vo.setMath(Integer.parseInt(jt_eng.getText()));
		
		if(list.add(vo)) 
			JOptionPane.showMessageDialog(null, "��� ����!!");
	}
	
	/**
	 * ��� - �й����� ������ ���� ����
	 */
	 public void registerFile() {
		ScoreVO vo = new ScoreVO();
		vo.setStuno(jt_stuno.getText());
		vo.setName(jt_name.getText());
		vo.setKor(Integer.parseInt(jt_kor.getText()));
		vo.setEng(Integer.parseInt(jt_eng.getText()));
		vo.setMath(Integer.parseInt(jt_eng.getText()));
		
		try {
			f = new File("c:/dev/sist/"+ vo.getStuno() +".dat");
			fos = new FileOutputStream(f);
			dos = new DataOutputStream(fos);
			
			dos.writeUTF(vo.getStuno());
			dos.writeUTF(vo.getName());
			dos.writeInt(vo.getKor());
			dos.writeInt(vo.getEng());
			dos.writeInt(vo.getMath());
			dos.writeInt(vo.getTot());
			dos.writeInt(vo.getAvg());

			JOptionPane.showMessageDialog(null, "���� ���� �Ϸ�!!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	 }	
	
	 /**
	  * ��� - list.dat ���Ͽ� ScoreVO ��ü ����
	  */
	 
	 public void registerObject() {
			ScoreVO vo = new ScoreVO();
			vo.setStuno(jt_stuno.getText());
			vo.setName(jt_name.getText());
			vo.setKor(Integer.parseInt(jt_kor.getText()));
			vo.setEng(Integer.parseInt(jt_eng.getText()));
			vo.setMath(Integer.parseInt(jt_eng.getText()));
			
			try {
				f = new File("c:/dev/sist/list.dat");
				if(f.exists()) {
					fos = new FileOutputStream(f, true);
					oos = new ObjectOutputStream(fos);
					oos.writeObject(vo);
					
				}else {
					f.createNewFile();
					fos = new FileOutputStream(f);
					oos = new ObjectOutputStream(fos);
					oos.writeObject(vo);
				}
				
				if(oos != null) oos.close();
				if(fos != null) fos.close();
				
				JOptionPane.showMessageDialog(null, "���� ���� �Ϸ�!!");
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		 }
	 /*
	  * ��� - DB�� score ���̺� ������ ����
	  */
	 public void registerDAO() {
		 ScoreVO vo = new ScoreVO();
		 vo.setStuno(jt_stuno.getText());
		 vo.setName(jt_name.getText());
		 vo.setKor(Integer.parseInt(jt_kor.getText()));
		 vo.setEng(Integer.parseInt(jt_eng.getText()));
		 vo.setMath(Integer.parseInt(jt_math.getText()));
		 
//		 dao.getStatement();
		 int result = dao.getResultInsert(vo);
		 if(result != 0) {
			 JOptionPane.showMessageDialog(null, "��� ����!!");
//			 dao.close();
		 }
		 
	 }
	 
	/**
	 * ���
	 */
	public void formReset() {
		jt_stuno.setText("");
		jt_name.setText("");
		jt_kor.setText("");
		jt_eng.setText("");
		jt_math.setText("");
		jt_stuno.requestFocus();
	}
	
	/**
	 * ����Ʈ 
	 */
	public void list() {
		jf_list = new JFrame("����Ʈ ���");
		ta_list = new TextArea(200,200);
		ta_list.setFont(font);
		ta_list.setEditable(false);
		//ta_list.setEnabled(false);
		ta_list.append("===== textarea ����Ʈ ��� =====\n");
		ta_list.append("--------------------------------------------------------\n");
		ta_list.append("�й�\t�̸�\t����\t����\t����\t����\t���\n");
		ta_list.append("--------------------------------------------------------\n");
		
		if(list.size() != 0) {
			//���
			for(ScoreVO vo : list) {
				ta_list.append(vo.getStuno()+"\t");
				ta_list.append(vo.getName()+"\t");
				ta_list.append(vo.getKor()+"\t");
				ta_list.append(vo.getEng()+"\t");
				ta_list.append(vo.getMath()+"\t");
				ta_list.append(vo.getTot()+"\t");
				ta_list.append(vo.getAvg()+"\n");
			}
			
			jf_list.add(ta_list);
			jf_list.setSize(500,300);
			jf_list.setLocation(400,100);
			jf_list.setVisible(true);
			
		}else {
			JOptionPane.showMessageDialog(null, "�����Ͱ� �����ϴ�.");
		}
	}
	
	/**
	 * ����Ʈ : c:/dev/sist ���ϸ���Ʈ ��� ���
	 */
	public void listFile() {
	try {
		File sistPath = new File("c:/dev/sist");
		File[] stuList = sistPath.listFiles();
		
		jf_list = new JFrame("����Ʈ ���");
		ta_list = new TextArea(200,200);
		ta_list.setFont(font);
		ta_list.setEditable(false);
		//ta_list.setEnabled(false);
		ta_list.append("===== textarea ����Ʈ ��� =====\n");
		ta_list.append("--------------------------------------------------------\n");
		ta_list.append("�й�\t\t�̸�\t����\t����\t����\t����\t���\n");
		ta_list.append("--------------------------------------------------------\n");
			
			if(stuList.length != 0){
				//���
				for(File f : stuList) {
					//f = new File("c:/dev/sist/sist_001.dat");
					fis = new FileInputStream(f);
					dis = new DataInputStream(fis);	
					
					ta_list.append(dis.readUTF()+"\t");
					ta_list.append(dis.readUTF()+"\t");
					ta_list.append(dis.readInt()+"\t");
					ta_list.append(dis.readInt()+"\t");
					ta_list.append(dis.readInt()+"\t");
					ta_list.append(dis.readInt()+"\t");
					ta_list.append(dis.readInt()+"\n");
				}			
		
			jf_list.add(ta_list);
			jf_list.setSize(500,300);
			jf_list.setLocation(400,100);
			jf_list.setVisible(true);
			
		}else {
			JOptionPane.showMessageDialog(null, "�����Ͱ� �����ϴ�.");
		}
			
	} catch (Exception e) {
		// TODO: handle exception
	}
			
	}//listFile method
	
	/**
	 * ����Ʈ : c:/dev/sist/list.dat ��ü ���
	 */
	public void listObject() {
	try {
		File f = new File("c:/dev/sist/list.dat");
		
		
		jf_list = new JFrame("����Ʈ ���");
		ta_list = new TextArea(200,200);
		ta_list.setFont(font);
		ta_list.setEditable(false);
		//ta_list.setEnabled(false);
		ta_list.append("===== textarea ����Ʈ ��� =====\n");
		ta_list.append("--------------------------------------------------------\n");
		ta_list.append("�й�\t\t�̸�\t����\t����\t����\t����\t���\n");
		ta_list.append("--------------------------------------------------------\n");
			
			if(f.length() != 0){
				//���
				fis = new FileInputStream(f);
				
				while(fis.available() > 0) {
					ois = new ObjectInputStream(fis);
					ScoreVO vo = (ScoreVO)ois.readObject();
					
					ta_list.append(vo.getStuno()+"\t");
					ta_list.append(vo.getName()+"\t");
					ta_list.append(vo.getKor()+"\t");
					ta_list.append(vo.getEng()+"\t");
					ta_list.append(vo.getMath()+"\t");
					ta_list.append(vo.getTot()+"\t");
					ta_list.append(vo.getAvg()+"\n");
				}			
		
			jf_list.add(ta_list);
			jf_list.setSize(500,300);
			jf_list.setLocation(400,100);
			jf_list.setVisible(true);
			
		}else {
			JOptionPane.showMessageDialog(null, "�����Ͱ� �����ϴ�.");
		}
			
	} catch (Exception e) {
		// TODO: handle exception
	}
			
	}//listFile method
	
	/*
	 * ����Ʈ : 
	 */
	public void listDAO() {
		
		try {
			jf_list = new JFrame("����Ʈ ���");
			ta_list = new TextArea(200,200);
			ta_list.setFont(font);
			ta_list.setEditable(false);
			//ta_list.setEnabled(false);
			ta_list.append("===== �������� ���α׷� =====\n");
			ta_list.append("------------------------------------------------------------------\n");
			ta_list.append("�й�\t\t�̸�\t����\t����\t����\t����\t���\t��ϳ�¥\n");
			ta_list.append("------------------------------------------------------------------\n");
			ArrayList<ScoreVO> list = dao.getResultList();
			
				if(list.size() != 0){
					//���
					
					for (ScoreVO vo : list) {
						
						ta_list.append(vo.getRno()+"\t");
						ta_list.append(vo.getStuno()+"\t");
						ta_list.append(vo.getName()+"\t");
						ta_list.append(vo.getKor()+"\t");
						ta_list.append(vo.getEng()+"\t");
						ta_list.append(vo.getMath()+"\t");
						ta_list.append(vo.getTot()+"\t");
						ta_list.append(vo.getAvg()+"\t");
						ta_list.append(vo.getSdate()+"\n");
					}			
			
				jf_list.add(ta_list);
				jf_list.setSize(600,300);
				jf_list.setLocation(400,100);
				jf_list.setVisible(true);
				
			}else {
				JOptionPane.showMessageDialog(null, "�����Ͱ� �����ϴ�.");
			}
				
		} catch (Exception e) {
			// TODO: handle exception
		}
				
		}


	//�̺�Ʈ ó�� Ŭ����
	class ScoreMgmUIEvent extends WindowAdapter
										implements ActionListener{
		
		/** ������ �̺�Ʈ ó�� **/
		public void windowClosing(WindowEvent e)  {
			JOptionPane.showMessageDialog(null, "���α׷��� �����մϴ�");
			dao.close();
			System.exit(0);
		}
		
		/** �׼� �̺�Ʈ ó�� **/
		public void actionPerformed(ActionEvent e)  {
			Object obj = e.getSource();
			if(btnReg == obj || jt_math == obj) {
				if(formCheck()) registerDAO();
			}else if(btnReset == obj) {
				formReset();
			}else if(btnList == obj) {
				listDAO();
			}else if(btnExit == obj) {
				JOptionPane.showMessageDialog(null, "���α׷��� �����մϴ�");
				System.exit(0);
			}
		}		
	}
	
}//class


