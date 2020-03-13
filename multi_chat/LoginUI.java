package multi_chat;

import java.awt.Button;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class LoginUI extends JFrame{
	//Field
	Panel p_id, p_pass, p_btn, p_tot; 
	Label lid, lpass;
	TextField tfId, tfPass;
	Button btnLogin, btnCancel;
	
	//Constructor
	public LoginUI(){
		//1. ȭ�鱸��
		p_id = new Panel();
		p_pass = new Panel();
		p_btn = new Panel();
		p_tot = new Panel();
		
		lid = new Label("���� IP   ");
		lpass = new Label("����ڸ�");			
		tfId = new TextField(25);
		tfPass = new TextField(25);
		
		btnLogin = new Button("����");
		btnCancel = new Button("���");
				
		p_id.add(lid);
		p_id.add(tfId);
		p_pass.add(lpass);
		p_pass.add(tfPass);
		p_btn.add(btnLogin);
		p_btn.add(btnCancel);
		
		p_tot.add(p_id);
		p_tot.add(p_pass);
		p_tot.add(p_btn);

		add(p_tot);
		
		setBounds(200,200,350,180);
		setVisible(true);
		
		//2. �̺�Ʈ �ڵ鷯 ����
		addWindowListener(new LoginEvent());
		btnLogin.addActionListener(new LoginEvent());
		btnCancel.addActionListener(new LoginEvent());
	}
	
	//Method
	class LoginEvent extends WindowAdapter
		implements ActionListener{
		
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
		
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == btnLogin){
				
				setVisible(false);	//�α��� ȭ�� ���߱�
				
				String ip = tfId.getText();
				String name = tfPass.getText();
				
				new MultiChatClient(ip, name);
			}
		}
	}
}











