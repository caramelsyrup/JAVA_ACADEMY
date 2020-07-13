package day04;

public class Exam02_2 {

	public static void main(String[] args) {
		// 위치를 랜덤하게 넣는다.
		
		int arr[] = new int[5];
		
		int n=0;
		
		while(n<arr.length) {
			int col = (int)(Math.random()*5);	// 배열위치를 랜덤하게 설정.
			System.out.println("위치 col : "+col+"\t");
			if(arr[col]!=0) {
				continue;	// 값이 있을때만 넣기 위해서, 0이되면 다시 랜덤을 돌리기 위해서.
			}else {	// 배열에 0일떄
				arr[col] = (int)(Math.random()*100)+1;	// 설정된 위치에 
				n++;
			}
		}	// while
		System.out.println();
		for(int a:arr) {	// arr 배열의 모든 원소를 출력.
			System.out.print(a+"\t");
		}

	}

}
