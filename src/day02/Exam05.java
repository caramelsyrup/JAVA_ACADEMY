package day02;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		// 입력 될 수의 갯수만큼 입력.
		// 그 수들의 합 출력.
		
		Scanner sc= new Scanner(System.in);
	
		System.out.print("숫자 개수를 입력하세요.>>");
		int a = sc.nextInt();
		
		System.out.print("데이터를 입력하세요.>>");
		
		int sum = 0;
		
		for(int i=0; i<a; i++) {
			int datainput = sc.nextInt();	// 스캔 매서드를 활용한 변수 생선은 for문안에서도 가능.
			sum+=datainput;					// 위의 변수를 연산에 활용.
		}
		System.out.println("데이터 합계 : "+sum);
		
		sc.close();
	}

}
