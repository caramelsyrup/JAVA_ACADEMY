package day05_object;

public class DrinkMain {

	public static void main(String[] args) {
		
		Drink coffee	=	new Drink("커피",500,3); // 음료종류,가격,잔수, coffee라는 객체 생성. 클래스는 Drink
		coffee.getData(); // 커피, 500, 3, 1500 출력.
		
		Drink tea	=	new Drink("녹차",800,5);	// tea 객체 생성.
		tea.getData(); // 위와 동일 출력.
		
		// 매출액 출력.
		
		System.out.println("매출액 : "+(coffee.getTotal()+tea.getTotal()) );	
		// for를 이용해서 반복, 배열을 활용.
	}

}
