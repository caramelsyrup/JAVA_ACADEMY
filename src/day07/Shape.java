package day07;

public abstract class Shape {	// �߻�Ŭ������ ����. ������ �޼ҵ尡 ��ü������ �������͵� ������, �����ΰ͵� �ֱ⿡.
	private int x;
	private int y;
	private double area;
	
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void print() {
		System.out.println("��ǥ(x,y)=("+x+","+y+")");
		System.out.println("���� : "+getArea());
	}

/*	public double getArea() {
		
		return 0.0;
	}
*/
	public abstract double getArea();	// getArea() �޼ҵ�� ���⼭ ��ü������ ���� �Ҽ� ���⿡

}


