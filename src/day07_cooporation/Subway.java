package day07_cooporation;

public class Subway {
	private String subNumber;	// ÁöÇÏÃ¶¹øÈ£
	private int subPassenger;	// ½Â°´¼ö
	private int subIncome;	// ¼öÀÔ

	public Subway(String subNumber) {
		this.subNumber = subNumber;
	}
	
	
	 // ½Â°´ÀÌ µ·À» ³»°í Å¾½Â
	void take(int subIncome) {
		this.subIncome += subIncome;	// ¼öÀÔÁõ°¡.
		subPassenger++; // ½Â°´¼ö Áõ°¡
	}
	
	void showInfo() {
		System.out.println("ÁöÇÏÃ¶ : "+subNumber);
		System.out.println("ÁöÇÏÃ¶ ½Â°´ : "+subPassenger);
		System.out.println("ÁöÇÏÃ¶ ¼öÀÔ : "+subIncome);
	}
}
