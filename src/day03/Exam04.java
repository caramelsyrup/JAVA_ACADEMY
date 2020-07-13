package day03;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		// 입력갯수, 데이터입력, 합계와 입력데이터 까지 출력.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("데이터 입력 갯수를 정하세요.>>>");
		int a = sc.nextInt();
		
		System.out.println("데이터 입력 하세요.>>>");
		
		int arr[]= new int [a];
		int sum=0;
		
		for(int i=0; i<arr.length; i++) {
			//int b = sc.nextInt();
			arr[i] = sc.nextInt();	// 따로 변수 설정을 하지 않고, 배열에 바로 입력할 수 있도록 설정.
			sum+=arr[i];
		}
		System.out.println("합계: "+sum);
		
		System.out.print("입력데이터 :");
		for(int i=0; i<arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
	}

}
