package multi_chat_object;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MultiChatClient {
	//Field
	Socket s;
//	DataInputStream dis;
//	DataOutputStream dos;	
	ObjectInputStream ois;
	ObjectOutputStream oos;
	JFrame jf;
	JTextArea jta;
	JTextField jtf;	
	String name;
	
	//Constructor
	public MultiChatClient() {
		this("211.63.89.223","ȫ�浿");
	}
	
	public MultiChatClient(String ip, String name) {
		try {
			this.name = name;
			init();		//UI ���� �޼ҵ�
			s = new Socket(ip, 7000);
			ois = new ObjectInputStream(s.getInputStream());
			oos = new ObjectOutputStream(s.getOutputStream());
			
			//ó�� ����
			oos.writeObject(new MessageVO(name, "", MessageVO.CONNECT));
			new ClientThread(ois, jta, jtf).start();
			
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
				//����
				oos.writeObject(new MessageVO(name,"",MessageVO.EXIT));
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
						//1. ������ ������ �۽�
						MessageVO msg = new MessageVO(name, jtf.getText(), MessageVO.TALKING);
						oos.writeObject(msg);
						
					} catch (Exception e) {
						e.printStackTrace();
					}				
				}
			}
		}//actionPerformed
		
	}//�̺�Ʈ Ŭ����
	
	
	//���� �۾��� �����ϴ� ������ Thread ����
	class ClientThread extends Thread{
		//Field
		ObjectInputStream ois;
		JTextArea jta;
		JTextField jtf;
		
		//Constructor
		public ClientThread() {}
		public ClientThread(ObjectInputStream ois, JTextArea jta
											, JTextField jtf) {
			this.ois = ois;		this.jta = jta;		this.jtf = jtf;
		}		
		
		//Method
		public void run() {
			try {
				while(true) {
					//�������� ������ ���� �� jta�� ���
					MessageVO msg = (MessageVO)ois.readObject();
					jta.append(msg.name+" "+msg.content +"\n");
					jtf.setText("");
					jtf.requestFocus();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
	
	
	
		
}//class



