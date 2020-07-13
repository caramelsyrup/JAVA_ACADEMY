package day08;

import java.util.ArrayList;

public class Buyer {
	
	private int money;
	private int point;
	
	int cnt;
	// Device arr[] = new Device[10];	// 각 자식클래스에 담길 정보가 다양해서 배열로 저장.
	
	ArrayList<Device> arr = new ArrayList<Device>();
	
	public Buyer(int money) {
		this.money = money;
	}
	
	// 구매하기. 가격 지불
	void buy(Device d) {	// 지금 Main에서 매개변수로 객체를 사용하고 있다. 하지만 개별 객체를 모두 대응하는 함수를 만드는것보다는 부모클래스를 이용하여 대응.
		arr.add(d);			// Device클래스의 객체d를 배열에 저장. 이 부분이 Hard.
		money-=d.price;
		point+=d.bonusPoint;
	}
	
	// 구매내역
	void showinfo() {
		System.out.println("잔액 : "+money);
		System.out.println("포인트 : "+point);
/*		for(Device a:arr) {
			if(a==null) break;
			System.out.println(a); // arr[i] 만 찍으면 주소값만 뜬다.toString() 을 이용한다. 자바 최상위 object의 메소드 이기에.
									   // Returns a string representation of the object.
		}
*/		
		for(int i=0; i<arr.size(); i++) {
			if(arr.get(i)==null) break;
			System.out.println(arr.get(i));
			System.out.println("가격 : "+arr.get(i).price+"만원"); // ((Device)arr.get(i)).price 는 object형에서 써야함. 따로 클래스로 형을 만들어줌.
		}
		
	}


}
