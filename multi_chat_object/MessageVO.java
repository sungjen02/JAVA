package multi_chat_object;

import java.io.Serializable;

public class MessageVO implements Serializable{
	public static final int CONNECT = 0;
	public static final int TALKING = 1;
	public static final int EXIT = -1;
	
	
	String name, content;
	int status;
	
	public MessageVO() {}
	
	public MessageVO(String name, String content ) {
		this.name = name;
		this.content = content;
	}
	public MessageVO(String name, String content, int status) {
		this.name = name;
		this.content = content;
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
}
