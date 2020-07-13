package day10;

public class ExceptionTest01 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		String str = "";
		try {	// 시도를 한 뒤,
			System.out.println(str.length());
			for(int i=0;i<=5;i++) {	// 0~4만 존재하는데, 5 넣는것은 범위 밖.
				arr[i]=i;
				System.out.println(arr[i]);
			}
		
		}catch(ArrayIndexOutOfBoundsException e) {	// 예외 발생시, 실행.
			System.out.println("예외 발생");
		}catch(NullPointerException n){
			System.out.println("null값");
		}finally {									// catch문까지 수행 된 다음, 무조건 실행되는 부분.
			System.out.println("반드시 수행하라");
		}
	}	// 예외는 넓은 범위 일수록 아래쪽, 좁은 범위 일수록 위쪽.

}
