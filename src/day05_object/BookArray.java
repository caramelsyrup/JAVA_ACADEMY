package day05_object;

public class BookArray {
	public static void main(String[] args) {
		Book[] library	=	new Book[5];	// library 객체배열 만듦.Book의 객체
		
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}
		// 배열에 구체적인 값을 넣지 않았기에, null만 출력된다.
		// 배열의 초기값은 null이다.
		
	}
}
