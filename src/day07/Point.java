package day07;

public class Point {
	private int x;
	private int y;
	protected String str = "Point";	// 상속관계에서 사용가능.
	
	public Point() {}
	public Point (int x, int y) {	// point 생성자는  매개변수를 변수에 저장.
		this.x = x;
		this.y = y;
	} 
	
	public void disp() {
		System.out.println("점(x,y) = ("+x+" , "+y+")");
	}
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}


}
