package day05_object;

public class Drink {
	
	String name;
	int price;
	int ea;
	// 전역변수 설정.
	public Drink(String name, int price, int ea ) {
		
		this.name = name;
		this.price = price;
		this.ea = ea;
	}	// 생성자 설정. 입력되는 매개변수들을 저장 할수 있도록 설정.
	
	public Drink(){
	
	} // 생성자 디폴트 값 설정. 생성자를 이용하지 않고, 변수를 직접 지정하면서, 코드를 작성할 경우도 있기에.
	
	public void getData() {
		System.out.println(name+" "+price+" "+ea+" "+price*ea);
		System.out.println(name+" "+getTotal());
	}	// 리턴 값은 없는 메소드 설정. 변수 출력.
	
	public int getTotal() {
		return price*ea;
	}	// int형을 리턴값으로 받을 수 있는 getTotal 함수 설정.
		// 또는 매출액 자체를 변수를 설정해서 할 수도 있음.

	
}
