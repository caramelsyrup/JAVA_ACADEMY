package day01;

import java.util.Scanner;

public class Exam12 {

	public static void main(String[] args) {
		// 
		Scanner sc = new Scanner(System.in);
		System.out.println("1.자바 2.데이터베이스 3.안드로이드 4.기타");
		System.out.println("과목번호 선택>>");
		int num = sc.nextInt();
		
		String sub="";
	
		if(num==1) {
			sub="자바";
		}else if(num==2) {
			sub="데이터베이스";
		}else if(num==3) {
			sub="안드로이드";
		}else if(num==4) {
			sub="기타";
		}else {
			sub="";
		}
		System.out.println(sub+"공부");
		
		switch(num) {	// 반복문.
			case 1: 
				System.out.println("자바공부"); break;	// break를 걸어서 이후 case가 실행되지 않도록 설정.
			case 2: 
				System.out.println("데이터베이스공부");break;
			case 3: 
				System.out.println("안드로이드공부");break;
			case 4: 
				System.out.println("기타공부");break;
			default :
				System.out.println("공부하자");
		}
		sc.close();
	}

}
