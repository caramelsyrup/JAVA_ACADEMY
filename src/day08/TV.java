package day08;

public class TV extends Device {
	
	public TV(int price) {
		super(price);
//		name = "TV";
	}
	
	public String toString() {
		return "TV";
	}	// 오버라이드 하는 것임. 자바 최상위 object의 메서드이기에, 가능.
		// 결국 오버라이딩은 메서드가 저장된 영역에, 기존의 메서드와는 다른 기능을 수행할 메서드가 따로 저장됨.
		// 오버라이딩 되면 메서드가 n개, 되지 않으면 1개.
	
}
