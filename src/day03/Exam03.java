package day03;

public class Exam03 {

	public static void main(String[] args) {
		// 여러 데이터를 한 번에 저장.
		//변수를 여러개 정하지 않기
		
		int[] arr = new int[5]; 	// arr이라는 배열을 만드는데 5개의 배열로 만듦.
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		arr[3]=400;
		arr[4]=500;
		System.out.println(arr[2]);	// 배열 출력시 배열 이름과 데이터가 있는 순서 주소를 같이 입력.
		
		int[] test = new int[20];
		System.out.println(test[3]);	// 0이 출력 되는데, 배열의 공간의 초기값은 0이다.
		for(int i=0; i<test.length; i++) {	// test의 길이를 20으로 설정했다. 매번 숫자를 입력하는것보다는 length를 활용.
			test[i]=i;
		}
		System.out.println(test[5]);
		System.out.println(test[3]);
		System.out.println("----------------------------------");
		int[] arr1=new int[5];
		for(int i=0; i<arr1.length;i++) {
			arr1[i]=i+1;
		}
		for(int i=0; i<arr1.length;i++) {
			System.out.println("arr1["+i+"] : "+arr1[i]);
		}
		System.out.println("----------------------------------");
		int[] arr2= {1,2,3,4,5,6,7};	// 배열을 생성하면서, 초기값을 설정해줌.
		for(int i=0; i<arr2.length;i++) {
			System.out.println("arr2["+i+"] : "+arr2[i]);
		}
		System.out.println("----------------------------------");
		String[] str = {"one","two","three"};
		for(int i=0; i<str.length;i++) {
			System.out.println("str["+i+"] : "+str[i]);
		}
		
		
		
		
		
	}

}
