package day06;

public class BookBean {
	// 누구나가 접근하지 못하도록 private를 설정한다.
	private String title;
	private String writer;
	// 접근제어자 public > default > private : 누구나 > 같은 패키지 내 > 자신만
	public BookBean() {
		
	}
	public BookBean(String title, String writer) {
			this.title = title;
			this.writer = writer;
		}
	
	//getter라고 한다. private이 설정된 변수를 사용하기 위해서, 함수를 사용해서 그 리턴값을 이용하도록한다.
	public String getTitle() {
		return title;
	}
	
	public String getWriter() {
		return writer;
	}
	
	
}
