package day05_object;

// class Circle{
// } �� ���⼭ Ŭ������ ���� ����.

public class CircleMain {

	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		c1.name	=	"����";
		c1.r=10;
		// ������ ����?
		c1.getArea();	// ����
		c1.setR(8);		// ������ 8�� ����
		c1.getArea();	// ����
		
		c1.setR(9);
		c1.getArea();
		
		// ������ 2�� ������ ����?
		
		Circle c2 = new Circle();
		c2.name = "����";
		c2.setR(2);
		c2.getArea();
		
		// �������� 5�� �����ڸ� �̿��Ͽ� ��ġ�� ����.
		Circle c3 = new Circle("��ġ��",5);
		c3.getArea();

		// ������ 4, ����
		Circle c4 = new Circle("����",4);
		c4.getArea();
		
		
	}
}
