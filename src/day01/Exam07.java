package day01;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		/*
		 * 점수를 입력받고
		 * 커트라인을 입력받아
		 * 합격인지 불합격인지를 판별
		 */
		System.out.print("커트라인을 입력하세요.>>");
		Scanner sc = new Scanner(System.in); // 동일 형태의 입력을 받는 것이라면, 굳이 메서드를 두번 선언할 필요는 없다. 하나를 중복하여 사용하여도 무방한 경우.
		int cut = sc.nextInt();
		System.out.println("커트라인은 "+cut+"점");		
//-----------------------------------------------------------------------------------
		System.out.print("점수를 입력하세요.>>>");
		int score = sc.nextInt();
		System.out.println("당신의 점수는 "+score+"점");
		
		if(score>=cut) {
			System.out.println("당신은 합격입니다.");
		}else {
			System.out.println("당신은 불합격입니다.");
		}
		// 점수가 3의 배수인지 아닌지 판단
		
		if(score%3==0) {
			System.out.println(score+": 3의 배수입니다.");
		}else {
			System.out.println(score+" : 3의 배수가 아닙니다.");
		}
		sc.close();
		
		
	}

}
