package day07;

public class Square extends Shape {
	
	private int w;
	private int h;
	public Square(int x, int y, int w, int h) {
		super(x,y);
		this.w	= w;
		this.h	= h;
	}
	
	void print() {
		super.print();
		System.out.println("���� : "+w+" "+"���� : "+h);
	}
	
	//�������̵�
	public double getArea() {
		return(double)h*w;
	}
	
}
