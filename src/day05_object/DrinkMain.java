package day05_object;

public class DrinkMain {

	public static void main(String[] args) {
		
		Drink coffee	=	new Drink("Ŀ��",500,3); // ��������,����,�ܼ�, coffee��� ��ü ����. Ŭ������ Drink
		coffee.getData(); // Ŀ��, 500, 3, 1500 ���.
		
		Drink tea	=	new Drink("����",800,5);	// tea ��ü ����.
		tea.getData(); // ���� ���� ���.
		
		// ����� ���.
		
		System.out.println("����� : "+(coffee.getTotal()+tea.getTotal()) );	
		// for�� �̿��ؼ� �ݺ�, �迭�� Ȱ��.
	}

}
