package day03;

public class Exam01 {

	public static void main(String[] args) {
		// *�� 9�� 7�� 5�� 3�� 1�� ����
		
		for(int i=9; i>=1; i-=2) {			// 1���� ����� �ؾ���.
			for(int j=1; j<=i; j++) {		// *�� �������� ��Ģ�� �߰�. i�� ����� Ƚ���� ����.
				System.out.print("*");
			}
			System.out.println("("+i+")");	// ù i�� ����ǰ� ����, �ڿ����� �ٹٲ�.
		}
		System.out.println("=======================");
		
		for(char i='I'; i>='A'; i-=2) {			// ���ĺ��� A���� ������ �̹� ����Ǿ� ����. ��ǻ�ʹ� A ��ü�� �ƴ°��� �ƴϰ�, �ڵ�� ����.
			for(char j='A'; j<=i; j++) {		
				System.out.print((char)(j+1));	// �׳� j+1�� �ڵ尪�� ��������, char������ ���� ��ȯ�� �ϸ�, B���� ��°����ϰ� ��.
			}
			System.out.println("("+i+")");	
		}
		System.out.println("=======================");
		/*
		  	*************************z
			************************yz
			***********************xyz
			**********************wxyz
			*********************vwxyz
			********************uvwxyz
			*******************tuvwxyz
			******************stuvwxyz
			*****************rstuvwxyz
			****************qrstuvwxyz
			***************pqrstuvwxyz
			**************opqrstuvwxyz
			*************nopqrstuvwxyz
			************mnopqrstuvwxyz
			***********lmnopqrstuvwxyz
			**********klmnopqrstuvwxyz
			*********jklmnopqrstuvwxyz
			********ijklmnopqrstuvwxyz
			*******hijklmnopqrstuvwxyz
			******ghijklmnopqrstuvwxyz
			*****fghijklmnopqrstuvwxyz
			****efghijklmnopqrstuvwxyz
			***defghijklmnopqrstuvwxyz
			**cdefghijklmnopqrstuvwxyz
			*bcdefghijklmnopqrstuvwxyz
			abcdefghijklmnopqrstuvwxyz
		 */
		for(char k='z'; k>='a'; k-=1) {
			for(char l='a'; l<='z'; l++) {
				if(l<k) {
					System.out.print("*");
				}else {
					System.out.print(l);	
				}
			}
			System.out.println();
		}
		
		
	}

}
