package day04;

public class Song {
	
	int year;
	String nat;
	String group;
	String title;
	
	public Song (int year, String nat, String group, String title ) {
		this.year = year;
		this.nat = nat;
		this.group = group;
		this.title = title;
	}
	
	public void show() {
		System.out.println(year+"�� "+nat+" ������ "+group+"�� �θ� "+title);
	}
	

}
