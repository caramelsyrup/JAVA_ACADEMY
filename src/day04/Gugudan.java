package day04;

public class Gugudan {
	
	int a;
	
	public Gugudan(int a) {
		this.a = a;
	}
	public Gugudan() {
		
	}
	public void viewData() {
		for(int i=1; i<=9; i++) {
			System.out.println(a+" * "+i+" = "+a*i);
		}
	}
	
	public static void main(String[] args) {
		Gugudan g1 = new Gugudan(5);	// g1�� ��ü�� ����. GugudanŬ���� ����, �׸��� �ʱ⿡ ���� �ٷ� ���� �� �ִ� �����ڸ� ����.
		g1.viewData();
		/*
		 *  5*1=5
		 *  5*2=10
		 *  ..��� ������
		 */
		System.out.println("--------------------------------------");
		
		Gugudan g2 = new Gugudan(7);
		g2.viewData();
		
		System.out.println("--------------------------------------");
		
		Gugudan g3 = new Gugudan(9);
		g3.viewData();
	}

}
