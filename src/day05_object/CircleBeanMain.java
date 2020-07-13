package day05_object;

public class CircleBeanMain {

	public static void main(String[] args) {
		
		// 반지름이 1,2,3,4,5인 5개의 객체CircleBean, 넓이 출력. 총면적 출력.
		/*
		CircleBean c1 = new CircleBean(1);
		CircleBean c2 = new CircleBean(2);
		CircleBean c3 = new CircleBean(3);
		CircleBean c4 = new CircleBean(4);
		CircleBean c5 = new CircleBean(5);
		*/
		
		// 배열은 선언, 생성, 초기화.
		CircleBean[] arr = new CircleBean[5];	// arr이라는 배열을 만드는데, 클래스를 이용.
		for(int i=0; i<arr.length; i++) {		// for문 반복 범위 설정.
			arr[i] = new CircleBean(i+1);		// arr배열 공간만 만들어져있기에, 배열 공간에 값을 넣어줌. new CircleBean(매개변수) 주목.
			System.out.println(arr[i].getArea());	// new로 객체 값들의 초기화가 되어 있기에, 출력 가능.
		}
		double sum = 0;
		for(int i=0; i<arr.length; i++) {		// for문 반복 범위 설정.
			sum+=arr[i].getArea();
		}
		System.out.println(sum);
		
		
		
	}

}
