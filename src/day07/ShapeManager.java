package day07;

import java.util.ArrayList;

public class ShapeManager {
	int cnt;
	double sum;
//	Shape[] arr = new Shape[50];	// �ڽ� Ŭ������ �迭�� ���� ������ �ʰ�, �θ� Ŭ���� ������ �迭�� ���� �ڽ�Ŭ���� ��ü���� ����Ҽ� �ֵ���.
	ArrayList<Shape>arr = new ArrayList<Shape>();
	public ShapeManager() {
		
	}
	
	void inputData(int a) {
		System.out.println("�����Է�>>");
		System.out.println("x��ǥ>>");
		int x = ShapeMain.sc.nextInt();
		System.out.println("y��ǥ>>");
		int y = ShapeMain.sc.nextInt();
		if(a==1) { // ���϶� x,y,r
			System.out.println("������>>");
			int r = ShapeMain.sc.nextInt();
			arr.add(new Circle(x,y,r));
			
		}else if(a==2) {	// �簢�� x,y,w,h
			System.out.println("�ʺ�>>");
			int w = ShapeMain.sc.nextInt();
			System.out.println("����>>");
			int h = ShapeMain.sc.nextInt();
			arr.add(new Square(x,y,w,h));
		}
	}
	
	void viewData() {
		
	//	Shape sh = new Shape();	// �߻�Ŭ�����̱⿡, �����Ҽ� ����. ���� ���ǵ��� �ʰų� �̱��� �Ȱ͵� �����ϱ⿡.
		
		for(Shape s:arr) {
			if(s==null) break;
			s.print();
		}
		for(Shape s:arr ) {
			if(s==null) break;
			sum+=s.getArea();
		}
		System.out.println("��ü ���� : "+sum);
	}
}
