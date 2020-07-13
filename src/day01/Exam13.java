package day01;

import java.util.Scanner;

public class Exam13 {

	public static void main(String[] args) {
		/*
		 * swich 문 사용하여, 문제 풀기
		 * 첫번째 수 입력
		 * 두번째 수 입력
		 * 연산자 입력
		 * 결과 : 연산 결과
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번쨰 수>>");
		int a = sc.nextInt();
		
		System.out.print("첫번쨰 수>>");
		int b = sc.nextInt();
		
		System.out.print("연산자>>");
		String c = sc.next();
		
		/*switch(c) {
		
			case "+" :
				System.out.println("덧셈 : "+(a+b));	
				break;
			case "-" :
				System.out.println("뺄셈  : "+(a-b));	
				break;
			case "*" :
				System.out.println("곱셈 : "+(a*b));	
				break;
			case "/" :
				System.out.println("나눗셈 : "+(a/b));	
				break;	
			case "%" :
				System.out.println("나머지 : "+(a%b));	
				break;	
			default :
				System.out.println("연산자 오류");
				break;
		}*/
		
		// 다중if로
		// 문자열 비교시ㅔ는 equals()를 사용. equals 메소드를 이용.
		if(c.equals("+")) {	
			System.out.println("덧셈 : "+(a+b));
		}else if(c.equals("-")) {
			System.out.println("뺄셈  : "+(a-b));
		}else if(c.equals("*")) {
			System.out.println("곱셈  : "+(a*b));
		}else if(c.equals("/")) {
			System.out.println("나눗셈 : "+(a/b));	
		}else if(c.equals("%")) {
			System.out.println("나머지 : "+(a%b));	
		}else {
			System.out.println("연산자 오류");
		}
	sc.close();	
	}

}
