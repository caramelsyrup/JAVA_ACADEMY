package day02;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/*
		 * 국어,영어,수학 점수 입력 받아
		 * 총점,평균,학점을 출력.
		 * 평균이 90이상 A, 80이상 B, 70이상 C, 나머지는 F
		 * switch문 사용
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수를 입력하세요.>>");
		int guk = sc.nextInt();
		
		System.out.print("수학점수를 입력하세요.>>");
		int soo = sc.nextInt();
						
		System.out.print("영어점수를 입력하세요.>>");
		int eng = sc.nextInt();
		
		int total = guk+soo+eng;
		System.out.println("총점은 "+total);
		
		int avg = total/3;
		System.out.println("평균은 "+avg);
		
		int jud = avg/10;	// 학점 구분을 위한 공통적인 기준은 10단위의 숫자이다.
		
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
		System.out.println("학점은 "+grade);
	sc.close();	
	}

}
