package day02;

public class Exam10 {

	public static void main(String[] args) {
		// for문의 중복 사용.
		
		for(int j=2; j<=4; j++) {
			for(int i=1; i<=3; i++) {
				System.out.println(j+"x"+i+"="+(j*i));
			}
			System.out.println(); // i가 끝나고 실행되는 영역.그리고 j 증가한뒤 처음부터 다시 실행.
		}
		System.out.println("=================================");
		
		for(int i=1; i<=9; i++) {
			for(int j=4; j<=6; j++) {
				System.out.print(j+"x"+i+"="+(j*i)+"\t");
			}
			System.out.println();
		} // for문이 실행되는 구문의 범위를 생각하며, 해결.
		
		
		
	}
}
