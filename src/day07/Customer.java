package day07;

public class Customer {
	
	protected int customerID;
	protected String customerName;
	int bonusPoint;
	protected String customerGrade;
	
	public Customer() {
		
	}
	void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	String showCustomerInfo() {
		return(customerName+" ���� "+"���ʽ� ����Ʈ�� "+bonusPoint);
	}
	
}
