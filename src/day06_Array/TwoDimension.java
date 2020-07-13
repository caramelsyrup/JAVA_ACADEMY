package day06_Array;

public class TwoDimension {

	public static void main(String[] args) {
		 char [][] BB = new char [13][2]; // BB배열을 만듦.
		 // int [][] bb = new int [13][2];	// int형 데이터의 배열을 만들고
		 
		 char A = 'a';
		 
		 for(int i=0; i<BB.length; i++) {
			 for(int j=0; j<BB[i].length; j++) {
				 BB[i][j] = A++;
				// A++;
			 }
		 }
		 
		 for(int i=0; i<BB.length; i++) {
				for(int j=0; j<BB[i].length; j++) {
					System.out.print(BB[i][j]+"\t");
				//	System.out.print((char)BB[i][j]+"\t");	// 출력될때 char형으로 강제 변환
				}
				System.out.println();
		 }
	
	}

}
