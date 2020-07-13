package day01;

import java.util.Scanner;

public class Exam09 {
	public static void main(String[] args) {
		/*
		 * 두수를 입력하여
		 * 큰수 :
		 * 작은수 :
		 * 두수의 차:
		 */
		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("숫자를 입력하세요.");
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A>B) {
			int C = A-B;
			System.out.println("두 수의 차이는 "+C);
			System.out.println("큰수는 "+A);
			System.out.println("작은수는 "+B);
		}else if(B>A) {
			int D = B-A;
			System.out.println("두 수의 차이는 "+D);
			System.out.println("큰수는 "+B);
			System.out.println("작은수는 "+A);
		}else {
			System.out.println("두 수는 같다.");
		}*/
		System.out.println("첫번째 수 입력>>");
		int max = sc.nextInt();
		System.out.println("두번째 수 입력>>");
		int min = sc.nextInt();
		
		if(min>max) {
			int tmp = max;
			max = min;
			min = tmp;
		}
		System.out.println("큰수 : "+max);
		System.out.println("작은수 : "+min);
		System.out.println("차이 : "+(max-min));
		// 첫번째 코딩보다는 간략해졌으나 두 수가 같을 때 출력문에 오류가 생김.
		
	sc.close();	
	}

}
