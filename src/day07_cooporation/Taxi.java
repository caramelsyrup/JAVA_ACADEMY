package day07_cooporation;

public class Taxi {
	
	private String taxiName;
	private int taxiPassenger;
	private int taxiIncome;
	
	public Taxi(String taxiName ) {
		this.taxiName = taxiName;
	}
	
	void take(int taxiIncome) {
		this.taxiIncome += taxiIncome;
		taxiPassenger++;
	}
	
	void showInfo() {
		System.out.println("�ý� : "+taxiName);
		System.out.println("�ý� �°� : "+taxiPassenger);
		System.out.println("�ý� ���� : "+taxiIncome);
	}
	

}
