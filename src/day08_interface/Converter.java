package day08_interface;

import java.util.Scanner;

public abstract class Converter {	//�ƹ��� Ŭ����. �߻����� ����� ������. Main���Ͽ��� �����ϸ�, �Ƶ�Ŭ������ �����ϸ鼭 ���� ������ ��.
	abstract double convert(double src);
	abstract String srcString();
	abstract String destString();
	Scanner scanner = new Scanner(System.in);
	protected double ratio;
	
	public void run() {	//��ȯ���.
		System.out.println(srcString()+"�� "+destString()+"�� �ٲߴϴ�.");
		System.out.println(srcString()+"�� �Է��ϼ���.");
	//	double val = scanner.nextDouble();
		double res = convert(scanner.nextDouble());	// �Ű������� �ƹ��� Ŭ������ �޼ҵ忡 �Է¹���.
		System.out.println("��ȯ ��� : "+res+destString()+"�Դϴ�.");
		
	}
}
