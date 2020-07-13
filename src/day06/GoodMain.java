package day06;

public class GoodMain {

	public static void main(String[] args) {
		Good g1	=	new Good("001","레몬","레몬사",1000);	// 생성자 설정. 매개변수 이용.
		System.out.println(g1.name+":"+g1.getSellingPrice());
		
		Good g2	=	new Good("002","사과","애플사",1000);
		System.out.println(g2.name+":"+g2.getSellingPrice());
		
		g2.updateDiscountRate(0.2);	
		// 해당 메소드를 생성한다. 0.2는 할인율이다.
		
		System.out.println("사과 : "+g2.getSellingPrice());	
		// getsellingPrice는 가격을 계산하는 메소드.
		// 할인율을 고려해야함.
		System.out.println(g2.name+"할인율 : "+g2.discountRate);	
		// 할인율 변수는 discountRate이다.
		
	}

}
