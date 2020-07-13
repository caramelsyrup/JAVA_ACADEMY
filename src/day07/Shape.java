package day07;

public abstract class Shape {	// 추상클래스로 정의. 변수나 메소드가 구체적으로 정해진것도 있지만, 미정인것도 있기에.
	private int x;
	private int y;
	private double area;
	
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void print() {
		System.out.println("좌표(x,y)=("+x+","+y+")");
		System.out.println("넓이 : "+getArea());
	}

/*	public double getArea() {
		
		return 0.0;
	}
*/
	public abstract double getArea();	// getArea() 메소드는 여기서 구체적으로 정의 할수 없기에

}


