package day04;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// 10개의 수를 입력받아 배열에 넣고, 그 배열의 합계와 가장 작은 수 구하기
		Scanner sc	=	new Scanner(System.in);
		
		int arr[]	=	new int[10];
		System.out.println("수를 입력하세요.>");
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			int a	= sc.nextInt();
			arr[i]=a;
			sum+=arr[i];
		}
		System.out.println("배열 원소들의 합계는 "+sum);
		
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("가장 작은 원소는 "+min);
	}

}
