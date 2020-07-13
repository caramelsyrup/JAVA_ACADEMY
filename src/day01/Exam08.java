package day01;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		// 국,영,수 입력받기. 총점, 평균, 학점을 출력.
		// 학점은 90이상은 a학점/80이상은 b학점/70이상은c학점/나머지 f학점
		Scanner sc = new Scanner(System.in); 	
		// scanner 메소드를 이용하기 위해서 선언.
		System.out.print("이름을 입력하세요.>>");
		String name = sc.next();
		
		System.out.print("국어 점수를 입력하세요.>>");
		int score = sc.nextInt();
		System.out.println("국어 점수 : "+score);
		
		System.out.print("수학 점수를 입력하세요.>>");
		int score1 = sc.nextInt();
		System.out.println("수학 점수 : "+score1);
		
		System.out.print("영어 점수를 입력하세요.>>");
		int score2 = sc.nextInt();
		System.out.println("영어 점수 : "+score2);
		
		int total = (score+score1+score2);		
		System.out.println(name+"의 총점은 "+total+"입니다.");
		
		
		int avg =total/3;
		System.out.println(name+"의 평균은 "+avg+"입니다.");
		
		String grade = "";	// grade변수를 설정해서 문자열을 입력받을수 있도록.
	
		if(avg>=90) {
			System.out.println(name+" A학점 입니다.");
			grade="A학점";
		}else if(avg>=80) {
			System.out.println(name+" B학점 입니다.");
			grade="B학점";
		}else if(avg>=70) {
			System.out.println(name+" C학점 입니다.");
			grade="C학점";
		}else {
			System.out.println(name+" F학점 입니다.");
			grade="F학점";
		}	// print구문이 반복되는 번거러움이 존재.
		sc.close();
		System.out.println(grade);	// 변수를 출력하면 되니까 print를 계속 할 필요가 없다.
	}

}
