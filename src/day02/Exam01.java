package day02;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/*
		 * ����,����,���� ���� �Է� �޾�
		 * ����,���,������ ���.
		 * ����� 90�̻� A, 80�̻� B, 70�̻� C, �������� F
		 * switch�� ���
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���������� �Է��ϼ���.>>");
		int guk = sc.nextInt();
		
		System.out.print("���������� �Է��ϼ���.>>");
		int soo = sc.nextInt();
						
		System.out.print("���������� �Է��ϼ���.>>");
		int eng = sc.nextInt();
		
		int total = guk+soo+eng;
		System.out.println("������ "+total);
		
		int avg = total/3;
		System.out.println("����� "+avg);
		
		int jud = avg/10;	// ���� ������ ���� �������� ������ 10������ �����̴�.
		
		String grade = "";
		
		switch(jud) {
			case 10:
			case 9:
				grade="A"; break;
			case 8:	
				grade="B"; break;
			case 7:
				grade="C"; break;
			default :
				grade="F"; break;
		}
		System.out.println("������ "+grade);
	sc.close();	
	}

}
