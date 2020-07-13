package day08_interface;

public class Circle implements Shape {
	
	private double r;
	
	public Circle(double r) {
		this.r = r;
	}

	@Override
	public double area() {
		return r*r*Math.PI;
	}

	@Override
	public double circum() {
		return 2*r*Math.PI;
	}
}
