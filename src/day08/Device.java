package day08;

public class Device {
	
	protected int price;
	protected int bonusPoint;
//	protected String name;
	
	public Device() {}
	
	public Device(int price) {
		this.price	=	price;
		bonusPoint = price/10;
	}
	
	
	
}
