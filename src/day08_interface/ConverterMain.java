package day08_interface;

public class ConverterMain {
	public static void main(String[] args) {
		
		Won2Dollar toDollar = new Won2Dollar(1200);	// ��ȭ�� �޷���
		toDollar.run();	// �Ƶ�Ŭ���� ��ü�� �����ߴµ�, �ƹ��� Ŭ������ ���� ����.
		Km2Mile toMile = new Km2Mile(1.6);	// km�� ���Ϸ�
		toMile.run();
		
		
		
	}
}
