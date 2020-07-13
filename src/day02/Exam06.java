package day02;

import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
	/*
	 * 1~10까지 합
	 * 11~20까지 합
	 * ....10까지 합	출력
	 */
		int sum = 0;
		for(int i=1; i<=100; i++) {
			sum+=i;
			if(i%10==0) {
				System.out.println((i-9)+"부터"+i+"까지 합 : "+sum);
				sum=0;	// 초기화를 해서 전의 합 결과를 없애고 다음 조건의 합 결과가 도출될 수 있도록 함.
			}
			
		}
		/*
		 * 학생수와 한줄에 앉을 학생 수를 입력받으세요.그리고 출력.
		 *	배치도를 출력. 한줄 인원도 입력받아야함.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생수를 입력하세요>>>");
		int a = sc.nextInt();
		
		System.out.print("한줄 인원을 입력하세요.>>");
		int b = sc.nextInt();
		
		for(int i=1; i<=a; i++) {
			System.out.print(i+"\t");
			if(i%b==0) {
				System.out.println();
			}
		}
		System.out.println();
		// 총 몇줄인지 출력.
		int row = (a/b);
		if((a%b)==0) {
			System.out.println(row+" 줄 입니다.");
		}else {
			System.out.println(row+1+" 줄 입니다.");
		}
		// 따로 변수를 하나 더 설정하여, 출력문을 깔끔하게 작성해도 됨.
		
		//삼항연산자(조건연산자)
		int r=((a%b)==0)? (a/b) : (a/b)+1 ; // r에 조건? 참일떄 : 거짓일때;
			System.out.println(r+" 총 라인");
		
		sc.close();
	}

}
