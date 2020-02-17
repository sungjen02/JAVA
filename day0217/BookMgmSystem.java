package day0217;

public class BookMgmSystem {
	//Field
	String isbn, name, author;
	int price;
	String[] book = null;
	BookVO vo;
	
	//Constructor
	//Method
	public void register(BookVO vo) {
		this.vo = vo;	
	}
	public void register(String[] book) {
		this.book = book;	
	}
	public void register(String isbn, String name, String author, int price) {
		this.isbn = isbn;
		this.name = name;
		this.author = author;
		this.price = price;		
	}
	
	public void showListObject() {
		System.out.println("----- ���� ����Ʈ -----");
		System.out.println(" ISBN : " + vo.getIsbn());
		System.out.println(" ������ : " + vo.getName());
		System.out.println(" ���� : " + vo.getAuthor());
		System.out.println(" ���� : " + vo.getPrice());
			
	}
	
	public void showListArray() {
		System.out.println("----- ���� ����Ʈ -----");
		for(String str : book) {
			System.out.println(str);
		}
		
	}
	public void showList() {
		System.out.println("----- ���� ����Ʈ -----");
		System.out.println(" ISBN : " + isbn);
		System.out.println(" ������ : " + name);
		System.out.println(" ���� : " + author);
		System.out.println(" ���� : " + price);
	}
}