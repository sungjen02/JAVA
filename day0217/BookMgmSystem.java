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
		System.out.println("----- 도서 리스트 -----");
		System.out.println(" ISBN : " + vo.getIsbn());
		System.out.println(" 도서명 : " + vo.getName());
		System.out.println(" 저자 : " + vo.getAuthor());
		System.out.println(" 가격 : " + vo.getPrice());
			
	}
	
	public void showListArray() {
		System.out.println("----- 도서 리스트 -----");
		for(String str : book) {
			System.out.println(str);
		}
		
	}
	public void showList() {
		System.out.println("----- 도서 리스트 -----");
		System.out.println(" ISBN : " + isbn);
		System.out.println(" 도서명 : " + name);
		System.out.println(" 저자 : " + author);
		System.out.println(" 가격 : " + price);
	}
}