package day08_interface;

public interface Shape {
	
	public double area();
	public double circum();

//	int a=5; 인터페이스에서 변수를 지정하면, final과 같이 고정된 상수 값으로 인지된다. 인터페이스를 이용하는 다른 클래스들은 해당 값을 변경시키지 못한다.	
	
}
