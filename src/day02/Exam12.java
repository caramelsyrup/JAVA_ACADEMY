package day02;

public class Exam12 {

	public static void main(String[] args) {
		// 구구단 3단 5단 7단 9단만 출력
		
		for(int i=1; i<=9; i+=1) {
			for(int j=3; j<=9; j+=2) {
				System.out.print(j+"x"+i+"="+(j*i)+"\t");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------");
		
		for(int i=3; i<=9; i+=2) {
			System.out.println(i+"단");
			for(int j=1; j<=9; j++) {
				System.out.println(i+"x"+j+"="+(j*i));
			}
			System.out.println();
		}
		

	}

}
