package day05_object;

public class Book {
	
	private String bookname;
	private String author;
	
	public Book() {	// 디폴트 생성자
		
	}
	
	public Book(String bookname, String author) {	//생성자
		this.bookname	=	bookname;
		this.author	=	author;
	}
	
	public String getBookName() {	// getBookName 함수. String을 리턴값으로
		return bookname;
	}
	
	public void setBookName(String bookname) {	//setBookname 함수. 리턴값이 없고, 변수 bookname에 매개변수를 저장.
		this.bookname	=	bookname;
	}

	public String getAuthor() {	// getBookName 함수. String을 리턴값으로
		return author;
	}
	
	public void setAuthor(String author) {	//setBookname 함수. 리턴값이 없고, 변수 bookname에 매개변수를 저장.
		this.author	=	author;
	}
	
	public void showBookInfo() {
	
		System.out.println(bookname+" , "+author);
	}

}
