package multi_echo_chat;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MultiEchoChatClient {
	//Field
	Socket s;
	DataInputStream dis;
	DataOutputStream dos;
	JFrame jf;
	JTextArea jta;
	JTextField jtf;
	
	//Constructor
	public MultiEchoChatClient() {
		try {
			init();	//UI 생성 메소드
			s = new Socket("localhost", 7000);
			dis = new DataInputStream(s.getInputStream());
			dos = new DataOutputStream(s.getOutputStream());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//Method
	public void init() {
		jf = new JFrame("에코 클라이언트");
		jta = new JTextArea(30,30);
		jtf = new JTextField(20);
		
		jta.setBackground(Color.LIGHT_GRAY);
		jta.setEditable(false);
		
		jf.add(jta, BorderLayout.CENTER);
		jf.add(jtf, BorderLayout.SOUTH);
		jf.setSize(300,300);
		jf.setVisible(true);
		
		jtf.requestFocus();

		ClientEvent eventObj = new ClientEvent();
		jf.addWindowListener(eventObj);
		jtf.addActionListener(eventObj);
	}//init
	
	//이벤트 처리 클래스
	class ClientEvent extends WindowAdapter implements ActionListener{
		//윈도우 종료 이벤트
		public void windowClosing(WindowEvent we) {
			try {
				dos.writeUTF("quit");
				System.exit(0);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		//액션 이베트 처리 - 서버로 데이터 송수신
		public void actionPerformed(ActionEvent ae) {
			Object obj = ae.getSource();
			if(obj == jtf) {
				if(jtf.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null, "데이터를 입력해주세요");
					jtf.requestFocus();
				}else {
					try {
						//서버로 데이터 송신
						dos.writeUTF(jtf.getText());

						//서버에서 데이터 수신 후 jta에 출력
						jta.append("수신 : " + dis.readUTF()+"\n");
						jtf.setText("");
						jtf.requestFocus();
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}//actionPerformed
	}//이벤트 클래스
	
	
	
	
	
}
