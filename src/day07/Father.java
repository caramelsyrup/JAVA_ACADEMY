package day07;

public class Father extends GrandFather {
	
	String str = "아버지";
	public Father() {
		System.out.println(str+ "생성자");
	}
	
	public Father(String msg) {
		System.out.println(msg);
	}

	
	public void fatherPrint() {
		System.out.println("father print method");
	}
	
	public void methodTest() {
		System.out.println("test method");
	}
	
	public void grandPrint() {
		System.out.println("할어버지 grandPrint method를 아버지가 수정");
	}
	// 오버라이딩 (메소드 오버라이딩) : 자식클래스가 부모클래스를 재수정.
	// 오버로딩 : 같은 명칭의 메소드, 함수가 변경된 매개변수를 통해 작동.

}
