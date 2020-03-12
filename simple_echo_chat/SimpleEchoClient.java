package simple_echo_chat;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SimpleEchoClient extends JFrame implements ActionListener{
	//Field
	Socket s;
	DataInputStream dis;
	DataOutputStream dos;
	JTextArea ja_content;
	JTextField jt_input;
	
	//Constructor
	public SimpleEchoClient() {
		try {
			s = new Socket("localhost",7000);
			ja_content = new JTextArea(50,50);
			jt_input = new JTextField(20);
			
			ja_content.setEditable(false);
			ja_content.setBackground(Color.cyan);
			
			add(ja_content, BorderLayout.CENTER);
			add(jt_input, BorderLayout.SOUTH);
			
			setTitle("에코 클라이언트");
			setSize(300,300);
			setVisible(true);
			
			jt_input.requestFocus();
			jt_input.addActionListener(this);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//Method
	public void actionPerformed(ActionEvent ae) {
		Object obj = ae.getSource();
		try {
		if(obj == jt_input) {
			String str = jt_input.getText().trim();
			if(str.length() != 0) {
				dis = new DataInputStream(s.getInputStream());
				dos = new DataOutputStream(s.getOutputStream());
			
				
			//1. 서버로 데이터 전송
				
			dos.writeUTF(str);
			
			//4. 서버에서 수신 --> ja.content
			ja_content.setEditable(false);
			ja_content.setBackground(Color.cyan);
			if(!str.equals("quit")) {
				ja_content.append("수신 : " + dis.readUTF() + "\n");
				jt_input.setText("");
				jt_input.requestFocus();
			}else {
				JOptionPane.showMessageDialog(null, "종료합니다.");
				System.exit(0);
			}
			}
		}
		}catch(Exception e) {e.printStackTrace();}
	}
	
	
}
