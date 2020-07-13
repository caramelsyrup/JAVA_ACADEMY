package day08;

public class Computer extends Device {
	
	public Computer(int price) {
		super(price);
		bonusPoint = price/5;
//		name = "Computer";
	}
	
	public String toString() {
		return "Computer";
	}
	
}
