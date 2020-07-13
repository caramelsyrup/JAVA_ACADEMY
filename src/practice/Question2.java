package practice;

public class Question2 {

	public static void main(String[] args) {
		// 구구단 짝수만 출력
		for(int j=1; j<=9; j++) {
			for(int i=2; i<9; i++) {
				if(i%2!=0) {
					continue;
				}
				System.out.print(i+"x"+j+"="+i*j+"\t");
			}
			System.out.println();
		}

	}

}
