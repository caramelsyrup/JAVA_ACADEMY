package day04;

public class Triangle {

	double bottom,height;
	
	//double area;
	
	// Triangle Ŭ���� ���� ���� ���� ����.
	
	public  Triangle(double bottom, double height ){
		this.bottom = bottom;
		this.height = height;
	}
	public Triangle() {
		
	}
	// ������ �ڵ��ۼ�.
	
	public double setBottom(double bottom) {
		this.bottom = bottom;
		return bottom;
	}
	// double�� ������ �Ҽ� �ֵ��� �Լ�(�޼ҵ�) ����.
	
	public void setHeight(double height) {
		this.height = height;
		
	}
	// return���� �߿��� ��Ȳ�� �ƴ϶� void�� ���.
	
	public double getArea() {
		//area = (bottom*height)/2;
		//return area;
		return (bottom*height)/2;
	}	// area��� ������ ���� ������ �ʰ�, ���ϰ��� �����ϵ��� ����.
	public double getArea1() {
		//area = (bottom*height)/2;
		//return area;
		return (bottom*height);
	}	// area��� ������ ���� ������ �ʰ�, ���ϰ��� �����ϵ��� ����.
	
	
	
	// bottom�� height�� �̿��Ͽ�, ���̸� ���Ҽ� �ֵ��� �Լ�(�޼ҵ�) ����.
	
	
}
