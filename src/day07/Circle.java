package day07;

public class Circle extends Shape {
	
	private int r;
	public Circle(int x, int y, int r) {
		super(x,y);
		this.r = r;
	}
	// �������̵�
	public void print() {
		super.print();
		System.out.println("������ : "+r);
	}
	
	//�������̵�.
/*	public double getArea() {
		
		return (double)r*r*3.14;
	}
*/
	public double getArea() {
		return (double)r*r*3.14;
	}
}
