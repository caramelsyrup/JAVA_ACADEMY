package day08_interface;

public class ConverterMain {
	public static void main(String[] args) {
		
		Won2Dollar toDollar = new Won2Dollar(1200);	// 원화를 달러로
		toDollar.run();	// 아들클래스 객체를 실행했는데, 아버지 클래스도 같이 실행.
		Km2Mile toMile = new Km2Mile(1.6);	// km을 마일로
		toMile.run();
		
		
		
	}
}
