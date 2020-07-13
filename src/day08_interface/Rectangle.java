package day08_interface;

public class Rectangle implements Shape {
	
	private int w;
	private int h;
	
	public Rectangle(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	@Override
	public
	 double area() {
		return w*h;
	}

	@Override
	public
	 double circum() {
		return (2*w)+(2*h);
	}
	
	
}
