package day02;

public class Exam10 {

	public static void main(String[] args) {
		// for���� �ߺ� ���.
		
		for(int j=2; j<=4; j++) {
			for(int i=1; i<=3; i++) {
				System.out.println(j+"x"+i+"="+(j*i));
			}
			System.out.println(); // i�� ������ ����Ǵ� ����.�׸��� j �����ѵ� ó������ �ٽ� ����.
		}
		System.out.println("=================================");
		
		for(int i=1; i<=9; i++) {
			for(int j=4; j<=6; j++) {
				System.out.print(j+"x"+i+"="+(j*i)+"\t");
			}
			System.out.println();
		} // for���� ����Ǵ� ������ ������ �����ϸ�, �ذ�.
		
		
		
	}
}
