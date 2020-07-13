package day08;

public class DeviceMain {

	public static void main(String[] args) {
		Buyer b = new Buyer(1000);	// 바이어는 1000만원을 가진 상태. b라는 Buyer의 객체 생성.
		TV tv = new TV(50);			//  tv는 50만원, tv 객체 생성.
		Computer com = new Computer(100);
		Audio audio = new Audio(70);
		
		b.buy(tv); // 바이어가 구매를 한다.
		b.buy(com);
		b.buy(audio);
		b.showinfo();
	}

}
