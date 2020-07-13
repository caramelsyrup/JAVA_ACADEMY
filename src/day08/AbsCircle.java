package day08;

public class AbsCircle extends AbsShape {
	
	 void draw() {
		 System.out.println("원을 그리다");
	}	// 오버라이드를 이용하여, 추상클래스의 미정의된 메소드를 자식클래스에서 정의.
	
	 void move() {
		 System.out.println("원 이동하기");
	}
}
