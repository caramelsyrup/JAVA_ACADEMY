package day01;

import java.util.Scanner;	
// java util에 있는 Scanner를 현재 패키지의 클래스에 가져온다.

public class Exam06 {

	public static void main(String[] args) {
		/*System.out.println("수를 입력하세요 >>");
		Scanner sc = new Scanner(System.in);
		int su = sc.nextInt(); 
		// nextInt에서 받아온 것을 sc에 입력되어 메소드가 기능하도록 하고, 기능되어진 결과를 변수 su에 저장.
		
		System.out.println(su);
		// 입력은 int형만 가능하다. nextInt이기에.
		
		if(su%2==0) {
			System.out.println(su+"짝수");
		}else {
			System.out.println(su+"홀수");
		}*/
		
		/*
		 * 나이를 입력받아 나이가 20이상이면 입장가능
		 * 15세 이상 20세 미만 부모님과 동반입장
		 * 15세미만 이면 입장 불가능
		 */
		System.out.print("나이를 입력하세요.>>");
		Scanner a = new Scanner(System.in);
		int A = a.nextInt();
		
		System.out.print(A+" 세 : ");
		
		if(A<15) {
			System.out.println("입장불가능");
		}if(A>=15 && A<20) {
			System.out.println("부모님과 동반 입장");
		}else {
			System.out.println("입장가능");
		}
		
		if(A>20) {
			System.out.println("입장가능");
		}else if(A>=15) {
			System.out.println("부모님과 동반 입장");
		}else {
			System.out.println("입장불가능");
		}
		a.close();
	}

}
