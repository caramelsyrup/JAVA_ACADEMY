package day01;

import java.util.Scanner;

public class Exam09 {
	public static void main(String[] args) {
		/*
		 * �μ��� �Է��Ͽ�
		 * ū�� :
		 * ������ :
		 * �μ��� ��:
		 */
		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("���ڸ� �Է��ϼ���.");
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A>B) {
			int C = A-B;
			System.out.println("�� ���� ���̴� "+C);
			System.out.println("ū���� "+A);
			System.out.println("�������� "+B);
		}else if(B>A) {
			int D = B-A;
			System.out.println("�� ���� ���̴� "+D);
			System.out.println("ū���� "+B);
			System.out.println("�������� "+A);
		}else {
			System.out.println("�� ���� ����.");
		}*/
		System.out.println("ù��° �� �Է�>>");
		int max = sc.nextInt();
		System.out.println("�ι�° �� �Է�>>");
		int min = sc.nextInt();
		
		if(min>max) {
			int tmp = max;
			max = min;
			min = tmp;
		}
		System.out.println("ū�� : "+max);
		System.out.println("������ : "+min);
		System.out.println("���� : "+(max-min));
		// ù��° �ڵ����ٴ� ������������ �� ���� ���� �� ��¹��� ������ ����.
		
	sc.close();	
	}

}
