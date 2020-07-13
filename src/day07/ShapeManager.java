package day07;

import java.util.ArrayList;

public class ShapeManager {
	int cnt;
	double sum;
//	Shape[] arr = new Shape[50];	// 자식 클래스의 배열을 각각 만들지 않고, 부모 클래스 형태의 배열을 만들어서 자식클래스 객체들이 사용할수 있도록.
	ArrayList<Shape>arr = new ArrayList<Shape>();
	public ShapeManager() {
		
	}
	
	void inputData(int a) {
		System.out.println("도형입력>>");
		System.out.println("x좌표>>");
		int x = ShapeMain.sc.nextInt();
		System.out.println("y좌표>>");
		int y = ShapeMain.sc.nextInt();
		if(a==1) { // 원일때 x,y,r
			System.out.println("반지름>>");
			int r = ShapeMain.sc.nextInt();
			arr.add(new Circle(x,y,r));
			
		}else if(a==2) {	// 사각형 x,y,w,h
			System.out.println("너비>>");
			int w = ShapeMain.sc.nextInt();
			System.out.println("높이>>");
			int h = ShapeMain.sc.nextInt();
			arr.add(new Square(x,y,w,h));
		}
	}
	
	void viewData() {
		
	//	Shape sh = new Shape();	// 추상클래스이기에, 생성할수 없음. 아직 정의되지 않거나 미구현 된것도 존재하기에.
		
		for(Shape s:arr) {
			if(s==null) break;
			s.print();
		}
		for(Shape s:arr ) {
			if(s==null) break;
			sum+=s.getArea();
		}
		System.out.println("전체 넓이 : "+sum);
	}
}
