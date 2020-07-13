package day05_object;

public class Circle {

	String name;		// 전 종류
	int r;	// 반지름
	
	public Circle(String name, int r) {
		this.name = name;
		this.r = r;	// 초기값을 변경하는 .. 오버로딩 됨.
	}	// 생성자 이용.
	
	public Circle() {
		
	}	// 생성자 디폴트.
	
	public void setR(int r) {
		this.r = r;	// 초기값을 변경
	}
	
	public void getArea() {
		System.out.println(name+"의 넓이 : "+(r*r*3.14));
	}
	
	public void total() {
		System.out.println();
	}
	
}
