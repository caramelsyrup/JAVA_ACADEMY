package day07;

import java.util.Scanner;

public class ShapeMain {
	static Scanner sc = new Scanner(System.in);
	int a;
	public static void showMenu() {
		System.out.println("�����ϼ���.");
		System.out.println("1.�� 2.�簢�� 3.���� 4.����");
		System.out.print("��ȣ ����>>");
	}
	
	public static void main(String[] args) {
	/*	Circle c1 = new Circle(5,5,5);
		Square s1 = new Square(10,10,4,7);	
		Shape sh = new Circle(4,4,7);	// ��Ӱ��迡�� �θ�Ŭ���� ������ ��ü�� �ڽ�Ŭ���� �Է�.
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
				System.out.println("����");
				System.exit(0);
			default :
				System.out.println("�Է¿���");
	
			}
		}
		
	}
}
