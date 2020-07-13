package day05_object;

public class DrinkTeaMain {

	public static void main(String[] args) {
		Drink[] arr = new Drink[100];	// arr에 Drink 클래스를 넣어 만듦.
		// 커피 500 3 1500
		// 녹차 800 5 4000
		// 카페라떼 1500 5 7500
		
		//총판매액
		
		arr[0] = new Drink("커피",500,3);
		arr[1] = new Drink("녹차",800,5);
		arr[2] = new Drink("카페라떼",1500,5);
		// 배열에 Drink 클래스 객체를 넣는 식을 복습.
		// Drink d1 = new Drink("커피",500,3); , arr[0] = d1; 의 과정을 축약.
		
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=null) {
				arr[i].getData();
				sum += arr[i].getTotal();
			}
			// if(arr[i]==null) break; 로 해도 된다. 위와 동일 논리.
			
		}
		System.out.println(sum);
	}
		
		

}
