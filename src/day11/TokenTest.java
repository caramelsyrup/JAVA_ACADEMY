package day11;

import java.util.StringTokenizer;

public class TokenTest {

	public static void main(String[] args) {
		String str = "aaa@bbb@ccc@ddd";	// ���ڿ� �Է�
		StringTokenizer stk = new StringTokenizer(str,"@");	// StringTokenizer�� ���ؼ� ���ڿ��� ����. ������ @
		while(stk.hasMoreTokens()) {	// Token�� ���� �ϴ��� ����, ���� Ŀ�� ��ġ���� ����.
			System.out.println("��ū �� : "+stk.countTokens()); //��ū ���� ���.
			System.out.println(stk.nextToken());	// Ŀ���� ���� �չ��� �տ� �ֱ⿡, nextToken�� ���ؼ� Ŀ���� ��� �̵�.
		}
		
		StringTokenizer stkk	=	new StringTokenizer("1 0 14 15 3 3 19");
		while(stkk.hasMoreTokens()) {
			System.out.println("��ū�� "+stkk.countTokens());
			System.out.println(stkk.nextToken());
		}

	}

}
