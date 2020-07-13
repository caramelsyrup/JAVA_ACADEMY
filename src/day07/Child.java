package day07;

public class Child extends Father {	// 자바는 단일 상속만 가능. 다중 상속은 불가능.
	
	public Child() {
		super();	// 부모클래스 생성자 중에서 매개변수가 입력되는 것을 먼저 출력. 생략도 가능한데, 디폴트 생성자 호출. 디폴트 생성자 없고, 다른게 있다면 오류.
					// 부모생성자를 무조건 먼저 호출
		System.out.println("자식 생성자");
	}
	
	public void childPrint() {
		System.out.println(super.str); // super. 해서 부모클래스의 변수에 접근 가능.
		System.out.println("child print method");
	}
	public void grandPrint() {
		System.out.println("할어버지 grandPrint method를 아이가 최종 수정.");
	}
	
	public void test() {
		System.out.println("test method");
	}


}
