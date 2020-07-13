package day05_object;

// class Circle{
// } 로 여기서 클래스를 만들어도 무방.

public class CircleMain {

	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		c1.name	=	"피자";
		c1.r=10;
		// 피자의 넓이?
		c1.getArea();	// 넓이
		c1.setR(8);		// 반지름 8로 수정
		c1.getArea();	// 면적
		
		c1.setR(9);
		c1.getArea();
		
		// 반지름 2인 도넛의 면적?
		
		Circle c2 = new Circle();
		c2.name = "도넛";
		c2.setR(2);
		c2.getArea();
		
		// 반지름이 5인 생성자를 이용하여 김치전 면적.
		Circle c3 = new Circle("김치전",5);
		c3.getArea();

		// 반지름 4, 파전
		Circle c4 = new Circle("파전",4);
		c4.getArea();
		
		
	}
}
