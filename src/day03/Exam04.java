package day03;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		// �Է°���, �������Է�, �հ�� �Էµ����� ���� ���.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է� ������ ���ϼ���.>>>");
		int a = sc.nextInt();
		
		System.out.println("������ �Է� �ϼ���.>>>");
		
		int arr[]= new int [a];
		int sum=0;
		
		for(int i=0; i<arr.length; i++) {
			//int b = sc.nextInt();
			arr[i] = sc.nextInt();	// ���� ���� ������ ���� �ʰ�, �迭�� �ٷ� �Է��� �� �ֵ��� ����.
			sum+=arr[i];
		}
		System.out.println("�հ�: "+sum);
		
		System.out.print("�Էµ����� :");
		for(int i=0; i<arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
	}

}
