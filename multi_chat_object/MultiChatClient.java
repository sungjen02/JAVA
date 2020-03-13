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
		this("211.63.89.223","홍길동");
	}
	
	public MultiChatClient(String ip, String name) {
		try {
			this.name = name;
			init();		//UI 생성 메소드
			s = new Socket(ip, 7000);
			ois = new ObjectInputStream(s.getInputStream());
			oos = new ObjectOutputStream(s.getOutputStream());
			
			//처음 접속
			oos.writeObject(new MessageVO(name, "", MessageVO.CONNECT));
			new ClientThread(ois, jta, jtf).start();
			
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
				//종료
				oos.writeObject(new MessageVO(name,"",MessageVO.EXIT));
				System.exit(0);
			} catch (Exception e) {
				e.printStackTrace();
			}							
		}
		
		//액션 이벤트 처리 - 서버로 데이터 송수신
		public void actionPerformed(ActionEvent ae) {
			Object obj = ae.getSource();
			if(obj == jtf) {
				
				if(jtf.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null, "데이터를 입력해주세요");
					jtf.requestFocus();
				}else {
					try {
						//1. 서버로 데이터 송신
						MessageVO msg = new MessageVO(name, jtf.getText(), MessageVO.TALKING);
						oos.writeObject(msg);
						
					} catch (Exception e) {
						e.printStackTrace();
					}				
				}
			}
		}//actionPerformed
		
	}//이벤트 클래스
	
	
	//수신 작업을 진행하는 별도의 Thread 생성
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
					//서버에서 데이터 수신 후 jta에 출력
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



