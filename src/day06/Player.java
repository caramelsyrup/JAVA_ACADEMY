package day06;

public class Player {

	// 이름, 주소, 나이 , 키, 몸무게
	// 데이터 보관.
	private int age;
	private String name, address;
	private double height, weight;
	
	public Player() {
		
	}
	public Player(String name, String address, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.height = height;
		this.weight = weight;
	}
	// getter
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	
}
