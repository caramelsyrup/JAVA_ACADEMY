package day02;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		System.out.println("�ȳ��ϼ���.");
		System.out.println("------------------------");
		// ���� ������ �ݺ�.
		for(int i=1; i<6; i++  ) {
			System.out.println(i+" �ȳ��ϼ���.");
		}		// 1���� �����ؼ� 6���� ���� ������ �ش� ������ ����.
		System.out.println("------------------------");
		for(int i=5; i>0; i--) {
			System.out.println(i+" �ȳ��ϼ���.");
		}
		System.out.println("------------------------");
		for(int a=1; a<10; a++ ) {
			System.out.println((2*a)+" = "+"2"+"X"+a);
		}
		// 1���� 10���� �� �߿��� ¦���� ���.
		System.out.println("------------------------");
		for(int i=1; i<11; i++) {
			if(i%2==0) {
				System.out.println(i+"�� ¦��");
			}
		}
		for(int i=2; i<=10; i+=2) {
			System.out.println(i);
		}
		for(int i=1; i<11; i++) {
			System.out.println(++i);
		}
		System.out.println("------------------------");
		// ���� �Է¹޾� �������� ����ϼ���.
		Scanner sc = new Scanner(System.in);	// scanner �ż��带 �����Ͽ� �̿�.
		System.out.print("���� �Է��ϼ���.>>");
		int a = sc.nextInt();
		
		for(int i=1; i<10; i++) {
			System.out.println(a+"X"+i+"="+(a*i));
		}
	sc.close();	
	}

}
