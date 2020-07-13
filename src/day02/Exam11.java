package day02;

public class Exam11 {

	public static void main(String[] args) {
		/*
		 * 123456789
		 * 1234567
		 * 12345
		 * 123
		 * 1
		 */
		// for문의 범위를 설정할때, 다른 포문의 변수를 사용해도 적용이 된다.
		for(int i=9; i>0; i-=2) {
			for(int j=1; j<=i; j++) {					
				System.out.print(j);				
			}
			System.out.println();
		}
		System.out.println("======================");
		for(int i=1; i<=9; i+=2) {
			for(int j=1; j<=i; j++) {					
				System.out.print(j);				
			}
			System.out.println();
		}
		System.out.println("======================");
		
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("======================");
		
		for(int i=9; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("======================");
	}

}
