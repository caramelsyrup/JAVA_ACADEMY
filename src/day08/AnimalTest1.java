package day08;

class Animal{
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
	
}

class Human extends Animal{
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("ȣ���̰� �׹߷� �ݴϴ�.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
}


public class AnimalTest1 {

	public static void main(String[] args) {
		AnimalTest1 aTest = new AnimalTest1();
		// Human h = new Human(); ���� �����ϰ�,
		// aTest.moveAnimal(h); �� ��� ����.
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());
		
		Human h = new Human();
		if( h instanceof Animal) {	// h�� Animal���ΰ�? ��ü�� �Ҽ��� ���� instanceof
			System.out.println("T");
		}else {
			System.out.println("f");
		}	// Human�� ��ӹް� �ֱ⿡
	}

	public void moveAnimal(Animal animal) {	// Animal�� ��Ӱ��迡�� �ֻ���. �׷��� �Ű������� Animal������ ��ȯ. new Human()�� ����ϸ� 1���� ���,
		animal.move();						// Animal�� move�� �ƴ� ��ӹ��� Human�� move�� ����. �������̵� �� ���.	
		
	}
	

	
}
