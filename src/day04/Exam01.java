package day04;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// 10���� ���� �Է¹޾� �迭�� �ְ�, �� �迭�� �հ�� ���� ���� �� ���ϱ�
		Scanner sc	=	new Scanner(System.in);
		
		int arr[]	=	new int[10];
		System.out.println("���� �Է��ϼ���.>");
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			int a	= sc.nextInt();
			arr[i]=a;
			sum+=arr[i];
		}
		System.out.println("�迭 ���ҵ��� �հ�� "+sum);
		
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("���� ���� ���Ҵ� "+min);
	}

}
