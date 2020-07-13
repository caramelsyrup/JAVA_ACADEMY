package day03;

public class Exam01 {

	public static void main(String[] args) {
		// *를 9개 7개 5개 3개 1개 찍어내기
		
		for(int i=9; i>=1; i-=2) {			// 1까지 출력을 해야함.
			for(int j=1; j<=i; j++) {		// *의 갯수에서 규칙성 발견. i로 출력의 횟수를 설정.
				System.out.print("*");
			}
			System.out.println("("+i+")");	// 첫 i가 적용되고 나면, 자연스레 줄바꿈.
		}
		System.out.println("=======================");
		
		for(char i='I'; i>='A'; i-=2) {			// 알파벳도 A부터 순서가 이미 내장되어 있음. 컴퓨터는 A 자체를 아는것이 아니고, 코드로 내장.
			for(char j='A'; j<=i; j++) {		
				System.out.print((char)(j+1));	// 그냥 j+1은 코드값이 나오지만, char형으로 강제 변환을 하면, B부터 출력가능하게 됨.
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
