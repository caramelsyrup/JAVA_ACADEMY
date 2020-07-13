package day04;

public class Exam02 {

	public static void main(String[] args) {
		// 1차원 배열에다가 난수를 발생시켜서 넣어라.
		int r = (int)((Math.random()*10)+1);
		int c = (int)((Math.random()*10)+1);
		
		int ar[] = new int [r];
		
		for(int i=0; i<ar.length; i++) {
			int a = (int)(Math.random()*10);
				ar[i]=a;
		}
		System.out.print("배열 원소"+"\t");
		for(int i=0; i<ar.length; i++) {
			System.out.print(ar[i]);
		}
		System.out.println();
		//2차원 배열에서도 같은 방식.
		System.out.println("----------------------------------");
		int arr[][]	= new int [r][c];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				int a = (int)(Math.random()*10);
				arr[i][j]=a;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("----------------------------------");
		
	}

}
