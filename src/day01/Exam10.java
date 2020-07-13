package day01;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~99사이 정수를 입력하세요>>");
		
		int a = sc.nextInt();
		int b= a/10;	// a의 10단위 값
		int c= a%10;	// a의 1단위 값

		
		if((b==3||b==6||b==9) && (c==3||c==6||c==9)) {
			System.out.println("박수 짝짝");
			System.out.println("박수 짝");
		}else if(b==3||b==6||b==9 ) {
			System.out.println("박수 짝짝");
		}else if(c==3||c==6||c==9) {
			System.out.println("박수 짝");
		}else {
			System.out.println("박수 없음");
		}
		
		/* int cnt = 0;
		 * if a가 3으로 나누었을때 나머지가 0인 조건에 맞으면 1증가 cnt = cnt+1;
		 * if b가 3으로 나누었을때 나머지가 0인 조건에 맞으면 1증가 cnt = cnt+1;
		 * if cnt 값이 1인지 2인지에 따라서 출력문을 나눠 작성.
		 * 일단위가 0인 10,20,30등의 경우 떄문에 , a조건식에서 a!=0 , b조건식에서 b!=0을 추가해준다.
		 */
		
		int cnt = 0;
		if(b!=0 && b%3==0) {
			cnt++; //cnt+=1; //cnt=cnt+1;
		}
		if(c!=0 && c%3==0) {
			cnt++; //cnt+=1; //cnt=cnt+1;
		}
		if(cnt==2) {
			System.out.println("박수 짝짝");
		}else if(cnt==1) {
			System.out.println("박수 짝");
		}else {
			System.out.println("박수 없음");
		}
		
		sc.close();
	}

}
