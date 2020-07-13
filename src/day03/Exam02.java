package day03;

public class Exam02 {

	public static void main(String[] args) {
		/*
		 * 1~10까지 합
		 * 11~20까지 합
		 * 91~100까지 합
		 * 이중 for문으로
		 */
		 int sum = 0;
		for(int i=1; i<=100; i+=10) {
			//int sum=0;
			for(int j=i; j<(i+10); j++) {
				sum+=j;
			}
			System.out.println(i+"부터"+(i+9)+"까지의 합 :"+sum);
			sum=0;
		}

	}

}
