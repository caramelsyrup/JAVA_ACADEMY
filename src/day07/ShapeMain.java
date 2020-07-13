package day07;

import java.util.Scanner;

public class ShapeMain {
	static Scanner sc = new Scanner(System.in);
	int a;
	public static void showMenu() {
		System.out.println("선택하세요.");
		System.out.println("1.원 2.사각형 3.보기 4.종료");
		System.out.print("번호 기입>>");
	}
	
	public static void main(String[] args) {
	/*	Circle c1 = new Circle(5,5,5);
		Square s1 = new Square(10,10,4,7);	
		Shape sh = new Circle(4,4,7);	// 상속관계에서 부모클래스 형태의 객체에 자식클래스 입력.
		Shape sh1 = new Square(5,6,7,8);
		
		c1.print();
		s1.print();
		sh.print();
		sh1.print();
	*/
		ShapeManager sm = new ShapeManager();
		
		while(true) {
			ShapeMain.showMenu();
			int a = sc.nextInt();
			
			switch(a) {
			case 1:
				
			case 2:
				sm.inputData(a);		
				break;
			case 3:
				sm.viewData();
				break;
			case 4:
				System.out.println("종료");
				System.exit(0);
			default :
				System.out.println("입력오류");
	
			}
		}
		
	}
}
