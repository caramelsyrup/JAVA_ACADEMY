package day05_object;

public class BookArray2 {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		
		library[0] = new Book("태백산맥","조정래");
		library[1] = new Book("데미안","헤르만 헤세");
		library[2] = new Book("어떻게 살 것인가","유시민");
		library[3] = new Book("토지","박경리");
		library[4] = new Book("어린왕자","생텍쥐베리");
		// 각 열에 구체적인 정보를 기입. Book 클래스의 생성자 형식에 맞춰서 입력.
		
		
		for(int i=0; i<library.length; i++) {
			library[i].showBookInfo();
		}	// showBookInfo 함수는 Book클래스에서 만들어 놓은 것. 출력문이 실행되는 기능.
		
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}
		//해당 배열의 주소값이 출력이 된다.
	}

}
