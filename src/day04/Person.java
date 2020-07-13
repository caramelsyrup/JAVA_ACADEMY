package day04;

public class Person {
	String name;
	String addr;
	
	public Person(String name, String addr) {
		this.name = name;
		this.addr = addr;
	}
	
	public Person() {
		
	}
	
	public void study() {
		System.out.println(name+" "+addr+"에서 공부한다.");
	}
	
}
