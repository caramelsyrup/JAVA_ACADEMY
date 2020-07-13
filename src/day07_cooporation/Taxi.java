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
		System.out.println("ец╫ц : "+taxiName);
		System.out.println("ец╫ц ╫б╟╢ : "+taxiPassenger);
		System.out.println("ец╫ц ╪Жют : "+taxiIncome);
	}
	

}
