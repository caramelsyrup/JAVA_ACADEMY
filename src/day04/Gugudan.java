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
		Gugudan g1 = new Gugudan(5);	// g1의 객체를 생성. Gugudan클래스 내의, 그리고 초기에 값을 바로 받을 수 있는 생성자를 만듦.
		g1.viewData();
		/*
		 *  5*1=5
		 *  5*2=10
		 *  ..계속 나오게
		 */
		System.out.println("--------------------------------------");
		
		Gugudan g2 = new Gugudan(7);
		g2.viewData();
		
		System.out.println("--------------------------------------");
		
		Gugudan g3 = new Gugudan(9);
		g3.viewData();
	}

}
