package day06;

public class GoodMain {

	public static void main(String[] args) {
		Good g1	=	new Good("001","����","�����",1000);	// ������ ����. �Ű����� �̿�.
		System.out.println(g1.name+":"+g1.getSellingPrice());
		
		Good g2	=	new Good("002","���","���û�",1000);
		System.out.println(g2.name+":"+g2.getSellingPrice());
		
		g2.updateDiscountRate(0.2);	
		// �ش� �޼ҵ带 �����Ѵ�. 0.2�� �������̴�.
		
		System.out.println("��� : "+g2.getSellingPrice());	
		// getsellingPrice�� ������ ����ϴ� �޼ҵ�.
		// �������� ����ؾ���.
		System.out.println(g2.name+"������ : "+g2.discountRate);	
		// ������ ������ discountRate�̴�.
		
	}

}
