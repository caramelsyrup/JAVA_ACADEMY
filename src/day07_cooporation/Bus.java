package day07_cooporation;

public class Bus {
	
	private int busNumber;	// ¹ö½º¹øÈ£
	private int busPassenger;	// ½Â°´¼ö
	private int busIncome;	// ¼öÀÔ

	public Bus ( int busNumber) {
		this.busNumber = busNumber;
	}
			
			
	 // ½Â°´ÀÌ µ·À» ³»°í Å¾½Â
	void take(int busIncome) {
		this.busIncome += busIncome;	// ¼öÀÔÁõ°¡.
		busPassenger++; // ½Â°´¼ö Áõ°¡
	}
	
	void showInfo() {
		System.out.println("¹ö½º : "+busNumber);
		System.out.println("¹ö½º ½Â°´ : "+busPassenger);
		System.out.println("¹ö½º ¼öÀÔ : "+busIncome);
	}





}
