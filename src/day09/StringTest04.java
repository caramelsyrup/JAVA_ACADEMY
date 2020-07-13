package day09;

import java.util.Scanner;

public class StringTest04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문장입력");
		String v = sc.nextLine();
		
		for(int i=0; i<v.length(); i++) {

			char bb = v.charAt(0);	// 0번째 문자 추출.
//			String bb = v.substring(0,1);
			String cc = v.substring(1);	// 1번쨰부터 끝까지 추출.
			v = cc+bb;	
			System.out.println(v);
		}
		
//		bb = vv.substring(0,1);
//		System.out.println(bb);
	sc.close();	
	}

}
