package day03;

public class Exam07 {

	public static void main(String[] args) {
		// 
		int[][] arr = new int[3][4]; // 3행 4열짜리 정수 배열이 만들어진다.
		arr[0][0]=1;	// 0,0에 1을 넣어라.
		int[][] a	=	{{1,2,3,4},{11,22,33,44},{111,222,333,444}};
		System.out.println(a[1][2]);
		// 언제나 배열은 0에서부터 시작된다. 컴퓨터 상으로
		for(int i=0; i<a.length; i++) {			// 먼저 행의 순서를 잡고, 현재 배열에서 행은 3줄이기에, length는 3이 된다.
			for(int j=0; j<a[i].length;j++) {	// 해당 행의 열의 갯수를 잡아준다. 현재 배열에서 열이 4칸이기에, length는 4가 된다.
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
