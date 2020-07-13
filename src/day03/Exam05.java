package day03;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		//최대값과 최대값 위치를 구하라. 
		int[] data = {10,5,90,100,250,30,77,88};
		int max=data[0];
		int maxPos = 0;
		int sum = 0;
		for(int i=0; i<data.length; i++) {
			if(data[i]>max) {
				max=data[i];
				maxPos=i+1;
			}
			sum+=data[i]; // for문은 배열의 길이 전체까지 반복하기에, 위치의 배열 값을 누적시킨다.
		}
		System.out.println("최대값은 "+max);
		System.out.println("위치는 "+maxPos);
		System.out.println("배열의 합계는 "+sum);
		System.out.println("배열의 평균 "+(float)sum/data.length);	// int형 데이터를 float형으로 강제 변환.
		System.out.println("-------------------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력하세요.>> ");
		int a = sc.nextInt();
		boolean j = false;	// true와 false를 저장하는 변수를 설정.
		for(int i=0; i<data.length; i++) {
			if(data[i]==a) {
				System.out.println("입력된 수 "+a+" : "+(i+1)+" 번쨰");
				j=true;
			}
		}
		if(j==false) {
				System.out.println("찾는 수 "+a+"는 없음");
		}
		
		
		
	}
}
