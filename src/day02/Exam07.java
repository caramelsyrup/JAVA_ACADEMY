package day02;

public class Exam07 {

	public static void main(String[] args) {
		// 반복문 종류.
		// 1부터 5까지 출력.
		for(int i=1; i<6; i++) {
			System.out.print(i+"\t");
		}
	
		System.out.println("\n--------------------------------------");
		int n=1;
		while(n<6) {
			System.out.print(n+"\t");
			n++;
		}
		System.out.println("\n--------------------------------------");
		
		int m=1;
		do {
			System.out.print(m+"\t");
			m++;
		}while(m<6);
		// do~while은 일단 한번은 실행함.
		
	}

}
