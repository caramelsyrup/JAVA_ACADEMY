package day11;

import java.util.StringTokenizer;

public class TokenTest {

	public static void main(String[] args) {
		String str = "aaa@bbb@ccc@ddd";	// 문자열 입력
		StringTokenizer stk = new StringTokenizer(str,"@");	// StringTokenizer를 통해서 문자열을 나눔. 기준은 @
		while(stk.hasMoreTokens()) {	// Token이 존재 하는지 묻고, 현재 커서 위치에서 시작.
			System.out.println("토큰 수 : "+stk.countTokens()); //토큰 수를 출력.
			System.out.println(stk.nextToken());	// 커서가 제일 앞문자 앞에 있기에, nextToken을 통해서 커서를 우로 이동.
		}
		
		StringTokenizer stkk	=	new StringTokenizer("1 0 14 15 3 3 19");
		while(stkk.hasMoreTokens()) {
			System.out.println("토큰수 "+stkk.countTokens());
			System.out.println(stkk.nextToken());
		}

	}

}
