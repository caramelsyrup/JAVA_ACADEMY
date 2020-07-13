package day02;

public class Exam08 {

	public static void main(String[] args) {
		// 1부터 10까지 홀수의 합 구하기
		int sum=0;
		for(int i=1; i<=10; i++) {
			if(i%2==1) {
			sum+=i;
			}
		}
		System.out.println("결과는 "+sum);
		System.out.println("\n--------------------------------------");
		
		int hap =0;
		for(int i=1; i<=10; i++) {
			if(i%2!=1) continue; // 조건이 참이면 아래식으로 내려가지 않음. for문은 계속 실행 됨.
			hap+=i;
		}
		System.out.println("continue 결과는 "+hap);
		System.out.println("\n--------------------------------------");
		
		int h =0;
		for(int i=1; i<=10; i++) {
			if(i%2!=1) break; // 조건이 참이면 for문을 break하라.
			h+=i;
		}
		System.out.println("break 결과는 "+h);
		System.out.println("\n--------------------------------------");
		

	}

}
