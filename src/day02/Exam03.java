package day02;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		System.out.println("안녕하세요.");
		System.out.println("------------------------");
		// 위의 문장을 반복.
		for(int i=1; i<6; i++  ) {
			System.out.println(i+" 안녕하세요.");
		}		// 1부터 시작해서 6보다 작을 떄마다 해당 구문을 실행.
		System.out.println("------------------------");
		for(int i=5; i>0; i--) {
			System.out.println(i+" 안녕하세요.");
		}
		System.out.println("------------------------");
		for(int a=1; a<10; a++ ) {
			System.out.println((2*a)+" = "+"2"+"X"+a);
		}
		// 1부터 10까지 수 중에서 짝수만 출력.
		System.out.println("------------------------");
		for(int i=1; i<11; i++) {
			if(i%2==0) {
				System.out.println(i+"은 짝수");
			}
		}
		for(int i=2; i<=10; i+=2) {
			System.out.println(i);
		}
		for(int i=1; i<11; i++) {
			System.out.println(++i);
		}
		System.out.println("------------------------");
		// 단을 입력받아 구구단을 출력하세요.
		Scanner sc = new Scanner(System.in);	// scanner 매서드를 생성하여 이용.
		System.out.print("단을 입력하세요.>>");
		int a = sc.nextInt();
		
		for(int i=1; i<10; i++) {
			System.out.println(a+"X"+i+"="+(a*i));
		}
	sc.close();	
	}

}
