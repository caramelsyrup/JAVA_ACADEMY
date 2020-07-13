package day02;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		// 수를 입력하라. 마지막은 -1을 입력하면 종료.
		// 임력한 수의 합계와 평균을 구하시오.
		// 예) 10 5 6 9 -1
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수를 입력하세요.>>");
		
		int sum=0;		// 입력되는 a값을 누적시킬 변수.
		int cnt=0;		//입력한 숫자 갯수
		while(true) {	// while안의 조건을 true로 작성하여, 항상 작동되도록 유도.
			int a = sc.nextInt();
			if(a==-1) 
				break;	// -1이 입력되면 while문이 여기서 종료됨. 그래서 cnt++이 추가가 되지 않음.
			sum+=a; 	// sum에 입력되는 a값을 누적시킴.
			cnt++;		// cnt는 a가 입력 횟수이기에, 입력문 이후에 1증가.
		}
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+(sum/cnt));
		

	sc.close();	
	}

}
