package day05_object;

public class Circle {

	String name;		// �� ����
	int r;	// ������
	
	public Circle(String name, int r) {
		this.name = name;
		this.r = r;	// �ʱⰪ�� �����ϴ� .. �����ε� ��.
	}	// ������ �̿�.
	
	public Circle() {
		
	}	// ������ ����Ʈ.
	
	public void setR(int r) {
		this.r = r;	// �ʱⰪ�� ����
	}
	
	public void getArea() {
		System.out.println(name+"�� ���� : "+(r*r*3.14));
	}
	
	public void total() {
		System.out.println();
	}
	
}
