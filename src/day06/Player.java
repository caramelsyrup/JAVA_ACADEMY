package day06;

public class Player {

	// �̸�, �ּ�, ���� , Ű, ������
	// ������ ����.
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
