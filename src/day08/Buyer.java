package day08;

import java.util.ArrayList;

public class Buyer {
	
	private int money;
	private int point;
	
	int cnt;
	// Device arr[] = new Device[10];	// �� �ڽ�Ŭ������ ��� ������ �پ��ؼ� �迭�� ����.
	
	ArrayList<Device> arr = new ArrayList<Device>();
	
	public Buyer(int money) {
		this.money = money;
	}
	
	// �����ϱ�. ���� ����
	void buy(Device d) {	// ���� Main���� �Ű������� ��ü�� ����ϰ� �ִ�. ������ ���� ��ü�� ��� �����ϴ� �Լ��� ����°ͺ��ٴ� �θ�Ŭ������ �̿��Ͽ� ����.
		arr.add(d);			// DeviceŬ������ ��üd�� �迭�� ����. �� �κ��� Hard.
		money-=d.price;
		point+=d.bonusPoint;
	}
	
	// ���ų���
	void showinfo() {
		System.out.println("�ܾ� : "+money);
		System.out.println("����Ʈ : "+point);
/*		for(Device a:arr) {
			if(a==null) break;
			System.out.println(a); // arr[i] �� ������ �ּҰ��� ���.toString() �� �̿��Ѵ�. �ڹ� �ֻ��� object�� �޼ҵ� �̱⿡.
									   // Returns a string representation of the object.
		}
*/		
		for(int i=0; i<arr.size(); i++) {
			if(arr.get(i)==null) break;
			System.out.println(arr.get(i));
			System.out.println("���� : "+arr.get(i).price+"����"); // ((Device)arr.get(i)).price �� object������ �����. ���� Ŭ������ ���� �������.
		}
		
	}


}
