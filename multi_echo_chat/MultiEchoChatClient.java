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
			init();	//UI ���� �޼ҵ�
			s = new Socket("localhost", 7000);
			dis = new DataInputStream(s.getInputStream());
			dos = new DataOutputStream(s.getOutputStream());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//Method
	public void init() {
		jf = new JFrame("���� Ŭ���̾�Ʈ");
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
	
	//�̺�Ʈ ó�� Ŭ����
	class ClientEvent extends WindowAdapter implements ActionListener{
		//������ ���� �̺�Ʈ
		public void windowClosing(WindowEvent we) {
			try {
				dos.writeUTF("quit");
				System.exit(0);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		//�׼� �̺�Ʈ ó�� - ������ ������ �ۼ���
		public void actionPerformed(ActionEvent ae) {
			Object obj = ae.getSource();
			if(obj == jtf) {
				if(jtf.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null, "�����͸� �Է����ּ���");
					jtf.requestFocus();
				}else {
					try {
						//������ ������ �۽�
						dos.writeUTF(jtf.getText());

						//�������� ������ ���� �� jta�� ���
						jta.append("���� : " + dis.readUTF()+"\n");
						jtf.setText("");
						jtf.requestFocus();
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}//actionPerformed
	}//�̺�Ʈ Ŭ����
	
	
	
	
	
}
