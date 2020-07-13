package day03;

public class Exam06 {

	public static void main(String[] args) {	
				
		System.out.println((int)(Math.random()*10));	
		// Math.random 해당 메소드는 랜덤하게 0에서1사이의 실수를 뽑아냄.
		/*
		 * 크기 10인 배열, 0~50사이의 난수 발생.
		 * 0이 아닌 값을 배열에 넣으세요.
		 * 중복허용
		 */
		
		int arr[] = new int [10];	// 크기 10개 배열.
		System.out.println((int)(Math.random()*50));	// 난수 발생.
		
			int n=0;	// 배열의 순번.
			
			while(n<arr.length) {	// 최소 10번은 실행되어야하기에.	while은 단순히 조건이 맞으면 실행.
				int r = (int)(Math.random()*50);
				if(r==0) {			// 난수가 0인가
					continue; 		// 윗 구문을 다시 실행.
				} 					// 난수가 0이 아닐때,
					arr[n]=r;
					n++;			// 0이 아닌 수가 저장되면, n을 1증가 시킴.
					// arr[n++]=r; 로 작성해도 된다.
			}
			
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i]+"\t");
			}
			System.out.println();
			for(int i:arr) {	// for-each 의 사용. 하지만 특정 i의 숫자를 특정지어서 이용 불가능.
				System.out.print(i+"\t");
			}
			System.out.println();
			
			/*while(n<arr.length) {
				int a = (int)(Math.random()*50);
				if(a==0) {
					continue;
				}
				arr[n]=a;
				System.out.print(arr[n]+"\t");
				++n;
			}*/
				
			String[] str = {"one","two","three"};
			for(String s : str) {
				System.out.print(s+"\t");
			}
				
				
				
				
	}

}
