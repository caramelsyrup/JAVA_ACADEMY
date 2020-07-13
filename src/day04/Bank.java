package day04;

import java.util.Scanner;

public class Bank {
	
	String name;	// ��� ����. �ش� ������ Bank Ŭ������ �����ϸ�, �ٸ��������� ��밡��.
	int money;
	
	public Bank(String name, int money) {	// ���� ���� �ִ� ������.
		this.name=name;
		this.money=money;
		System.out.println(name+" : "+money);
	}
	
	public Bank() {	// ����Ʈ ������.
		
	}
	
	
	// �Ա�
	public int inMoney(int a) {	// a�� �ش� �޼ҵ峻������ �����س�����. �ٸ� ������ ��� �Ұ���.
		System.out.println(name+"������ "+a+"�� �ԱݵǾ����ϴ�.");
		return money+=a;
		
	}
	
	// ���
	public int outMoney(int a) {
												// if else�� ���� ���� �ͺ��� void�� return�� ����Ͽ�, �Լ��� ����.
		if(a>=0) {
			if(money>=a) {
				System.out.println(name+"������ "+a+"�� ��ݵǾ����ϴ�.");
				return money-=a;
			}else if(money<a) {
				System.out.println(name+"������ �ܾ��� �����մϴ�.");
				System.out.println(name+"������ ���� �ܾ��� "+money+"�Դϴ�.");
				return money;
			}else {
				return money;
			}
		 }else{
			 System.out.println(name+"���� �ùٸ� ���� ��Ź�帳�ϴ�.");
			 return money;
		}
	}
	
	//public void outmoney(int a) {
		
	//}
	
	// �ܾ�Ȯ��
	public void stmoney() {
		if(money>=0) {
			System.out.println(name+"������ �ܾ��� "+money+"�� �Դϴ�.");
		}else {
			System.out.println(name+"������ �ܾ��� �����մϴ�.");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*Bank b1 = new Bank();	// b1 ���� ��ü ����.
		b1.name="ȫ�浿";			// b1 ��ü�� �Ӽ���. BankŬ�������� �����س��� �Ӽ�.
		
		System.out.println("������ �ܾ��� �Է��ϼ���.");
		b1.money=sc.nextInt();
		System.out.println();
		
		System.out.println("������ �Աݾ��� �Է��ϼ���.");
		b1.inMoney(sc.nextInt());
		System.out.println();
		
		System.out.println("������ ��ݾ��� �Է��ϼ���.");
		b1.outMoney(sc.nextInt());
		System.out.println();
		
		b1.stmoney();
		// System.out.println(b1.name); // class Bank���� ������ �����̱⿡ �ش� Ŭ������ �����ϸ�, ���� ��밡��.
		System.out.println();
		*/
		
		//b1.money=5000;
		//b1.outMoney(3000);
		//b1.stmoney();
		
		/*Bank b2	= new Bank();	// b2  ��ü�� ����. BankŬ������.
		b2.name	= "�̼���";
		b2.inMoney(10000);
		b2.stmoney();
		b2.outMoney(20000);
		b2.stmoney();				-�� �߸� �ܾ׺���.
		*/
		Bank b3 = new Bank("������",20000);
		b3.stmoney();
		
	}
	
}
