package day08;

public class DeviceMain {

	public static void main(String[] args) {
		Buyer b = new Buyer(1000);	// ���̾�� 1000������ ���� ����. b��� Buyer�� ��ü ����.
		TV tv = new TV(50);			//  tv�� 50����, tv ��ü ����.
		Computer com = new Computer(100);
		Audio audio = new Audio(70);
		
		b.buy(tv); // ���̾ ���Ÿ� �Ѵ�.
		b.buy(com);
		b.buy(audio);
		b.showinfo();
	}

}
