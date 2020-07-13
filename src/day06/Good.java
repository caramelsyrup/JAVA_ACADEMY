package day06;

public class Good {

	String code;
	String name;
	String maker;
	int price;
	double discountRate;
	
	public Good() {
		
	}

	public Good(String code,String name,String maker,int price ) {
		this.code = code;
		this.name = name;
		this.maker = maker;
		this.price = price;
	}
	
	public void updateDiscountRate(double rate) {
		this.discountRate = rate;
	}
	
	public int getSellingPrice () {
		return (int)(price*(1-discountRate));
	}
	
}
