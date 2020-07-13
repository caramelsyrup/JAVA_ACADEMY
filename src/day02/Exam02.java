package day02;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		/*
		 * 금액을 입력받기.
		 * 예를 들어 52850원 일경우, 지폐와 동전이 나누어지는것을 출력.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액을 입력하세요.>>");
		int amount = sc.nextInt();
		
		int five	= amount/50000;
		System.out.println("오만원권은 "+five+"장 입니다.");
		
		int man	= ((amount/10000)-(five*5));
		System.out.println("만원권은 "+man+"장 입니다.");
		
		int cheon = (amount%10000)/1000;	// 나머지를 활용할 수도 있음. 단위가 바뀔때 활용가능. (amount%10000)를 이용해서 나머지를 활용.
		System.out.println("천원권은 "+cheon+"장 입니다.");
		
		System.out.println("-------------------------------------");
		
		if(five>0) {
			System.out.println("오만원권은 "+five+"장 입니다.");
			System.out.println("만원권은 "+man+"장 입니다.");
			System.out.println("천원권은 "+cheon+"장 입니다.");
		}else if(man>0){
			System.out.println("만원권은 "+man+"장 입니다.");
			System.out.println("천원권은 "+cheon+"장 입니다.");
			}else {
			System.out.println("천원권은 "+cheon+"장 입니다.");
			}
		sc.close();
	}

}
