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
		// for���� ������ �����Ҷ�, �ٸ� ������ ������ ����ص� ������ �ȴ�.
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
