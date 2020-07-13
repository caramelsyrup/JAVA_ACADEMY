package day08;

public abstract class AbsShape {	// draw, move 메소드를 구체화 하기 어렵기에, 이 클래스는 추상화.
	// 그리다. 이동하다.
	
	void print() {
		System.out.println();
	}
	
	abstract void draw();
	
	abstract void move();
}
