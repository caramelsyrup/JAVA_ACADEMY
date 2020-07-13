package day02;

public class Exam04 {

	public static void main(String[] args) {
		// for문을 이용. 1~10까지의 합을 출력.
		
		int sum=0;	// 현재 클래스 범위 내에서 사용.
		
		for(int i=1; i<=10; i++) {
			sum=sum+i;	// sum+=i
			if(i==10) {
			System.out.println(sum);
			}
		}
		System.out.println("------------------------------------");
		
		int sum1=0;	// sum이라는 위와 동일한 변수명을 사용할 수가 없다. 다른이름으로 다른 넓은 범위의 변수 설정.
		
		for(int i=1; i<=100; i++) {
			sum1=sum1+i;
			if(i%10==0) {	// 나머지를 활용해서 100까지의 합을 10단위씩 끊어서 표현.
				System.out.println("1부터 "+i+"까지 "+sum1);
			}		
		}
		//1~10까지 표현되면서 합도 표현되는 출력문.
		System.out.println("------------------------------------");
		
		int sum2=0;
		
		for(int i=1; i<=10; i++) {
			sum2=sum2+i;
			if(i==10) {
				System.out.print(i+"="+sum2+"\n");
			}else {
				System.out.print(i+"+");
			}
		}
		System.out.println("------------------------------------");
		int sum3=0;
		
		for(int i=1; i<=10; i++) {
			sum3+=i;
			if(i==1) {
				System.out.print(i);
			}else {
				System.out.print("+"+i);
			}
		}
		System.out.println("="+sum3);
		System.out.println("------------------------------------");
		
	}
}
