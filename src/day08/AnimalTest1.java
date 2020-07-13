package day08;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	
}

class Human extends Animal{
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
}


public class AnimalTest1 {

	public static void main(String[] args) {
		AnimalTest1 aTest = new AnimalTest1();
		// Human h = new Human(); 으로 정의하고,
		// aTest.moveAnimal(h); 로 사용 가능.
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());
		
		Human h = new Human();
		if( h instanceof Animal) {	// h가 Animal형인가? 객체의 소속을 묻는 instanceof
			System.out.println("T");
		}else {
			System.out.println("f");
		}	// Human은 상속받고 있기에
	}

	public void moveAnimal(Animal animal) {	// Animal이 상속관계에서 최상위. 그래서 매개변수가 Animal형으로 변환. new Human()로 사용하면 1번만 사용,
		animal.move();						// Animal의 move가 아닌 상속받은 Human의 move를 받음. 오버라이딩 된 경우.	
		
	}
	

	
}
