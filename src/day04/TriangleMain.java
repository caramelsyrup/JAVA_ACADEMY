package day04;

import java.util.Scanner;

public class TriangleMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangle tr = new Triangle(10.2,17.3);
		System.out.println("삼각형의 면적 : "+tr.getArea());
		System.out.println("-----------------------------");

		tr.setBottom(7.5);
		tr.setHeight(11.2); 
		System.out.println("삼각형의 면적 : "+tr.getArea());
		System.out.println("-----------------------------");
		System.out.println("-----------------------------");
		System.out.println("어떤도형을 선택하시겠습니까?");
		int que = sc.nextInt();
		if(que==1) {
			System.out.println("삼각형 밑변>>");
			double bot = sc.nextDouble();
			System.out.println("삼각형 높이>>");
			double hei = sc.nextDouble();
			Triangle tr1 = new Triangle(bot,hei);
			System.out.println("삼각형 넓이 "+tr1.getArea());
		}
		else if(que==2) {
			System.out.println("사각형 밑변>>");
			double bot = sc.nextDouble();
			System.out.println("사각형 높이>>");
			double hei = sc.nextDouble();
			Triangle tr1 = new Triangle(bot,hei);
			System.out.println("사각형 넓이 "+tr1.getArea1());
		}else {
			System.out.println("입력오류");
		}	// System.exit(0); 0일때 프로그램 종료
	}
	

}
