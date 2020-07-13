package day06_Array;

public class ShiftArray {
	
	/* public static void shiftArray(int[][] arr) {
		int[] c = arr[arr.length-1];
		
		for(int i=arr.length-2; i>=0; i--) {
				arr[i+1] = arr[i];
		}
		arr[0] = c;
	}
	*/
	public static void showArray(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("1차 shift...");
		//ShiftArray.shiftArray(arr);	// 이동메소드
		ShiftArray.showArray(arr); // 출력메소드
		System.out.println("2차 shift...");
		//ShiftArray.shiftArray(arr);	// 이동메소드
		ShiftArray.showArray(arr); // 출력메소드
		
		
	}

}
