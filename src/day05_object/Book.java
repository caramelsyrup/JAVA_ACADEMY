package day05_object;

public class Book {
	
	private String bookname;
	private String author;
	
	public Book() {	// ����Ʈ ������
		
	}
	
	public Book(String bookname, String author) {	//������
		this.bookname	=	bookname;
		this.author	=	author;
	}
	
	public String getBookName() {	// getBookName �Լ�. String�� ���ϰ�����
		return bookname;
	}
	
	public void setBookName(String bookname) {	//setBookname �Լ�. ���ϰ��� ����, ���� bookname�� �Ű������� ����.
		this.bookname	=	bookname;
	}

	public String getAuthor() {	// getBookName �Լ�. String�� ���ϰ�����
		return author;
	}
	
	public void setAuthor(String author) {	//setBookname �Լ�. ���ϰ��� ����, ���� bookname�� �Ű������� ����.
		this.author	=	author;
	}
	
	public void showBookInfo() {
	
		System.out.println(bookname+" , "+author);
	}

}
