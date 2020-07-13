package day07;

public class VIPCustomer extends Customer {
	
	double saleRatio;
	private int agentID;
	
	public VIPCustomer() {
		customerGrade = "VIP";
	}
	
/*	protected int customerID;
	protected String customerName;
	int bonusPoint;
	
	public VIPCustomer() {
		
	}
	
	public int getCustomerID(int customerID) {
		return customerID;
	}
	
	public int getCustomerName(int customerName) {
		return customerName;
	}
	
	void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	
	void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	*/
	String showCustomerInfo() {
		return (customerGrade+" : "+customerName+" 님의 "+"보너스 포인트는 "+bonusPoint);
	}
}
