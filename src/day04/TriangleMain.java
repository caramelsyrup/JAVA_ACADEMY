package day04;

import java.util.Scanner;

public class TriangleMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangle tr = new Triangle(10.2,17.3);
		System.out.println("�ﰢ���� ���� : "+tr.getArea());
		System.out.println("-----------------------------");

		tr.setBottom(7.5);
		tr.setHeight(11.2); 
		System.out.println("�ﰢ���� ���� : "+tr.getArea());
		System.out.println("-----------------------------");
		System.out.println("-----------------------------");
		System.out.println("������� �����Ͻðڽ��ϱ�?");
		int que = sc.nextInt();
		if(que==1) {
			System.out.println("�ﰢ�� �غ�>>");
			double bot = sc.nextDouble();
			System.out.println("�ﰢ�� ����>>");
			double hei = sc.nextDouble();
			Triangle tr1 = new Triangle(bot,hei);
			System.out.println("�ﰢ�� ���� "+tr1.getArea());
		}
		else if(que==2) {
			System.out.println("�簢�� �غ�>>");
			double bot = sc.nextDouble();
			System.out.println("�簢�� ����>>");
			double hei = sc.nextDouble();
			Triangle tr1 = new Triangle(bot,hei);
			System.out.println("�簢�� ���� "+tr1.getArea1());
		}else {
			System.out.println("�Է¿���");
		}	// System.exit(0); 0�϶� ���α׷� ����
	}
	

}
