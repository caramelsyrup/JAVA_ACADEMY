package day02;

public class Exam04 {

	public static void main(String[] args) {
		// for���� �̿�. 1~10������ ���� ���.
		
		int sum=0;	// ���� Ŭ���� ���� ������ ���.
		
		for(int i=1; i<=10; i++) {
			sum=sum+i;	// sum+=i
			if(i==10) {
			System.out.println(sum);
			}
		}
		System.out.println("------------------------------------");
		
		int sum1=0;	// sum�̶�� ���� ������ �������� ����� ���� ����. �ٸ��̸����� �ٸ� ���� ������ ���� ����.
		
		for(int i=1; i<=100; i++) {
			sum1=sum1+i;
			if(i%10==0) {	// �������� Ȱ���ؼ� 100������ ���� 10������ ��� ǥ��.
				System.out.println("1���� "+i+"���� "+sum1);
			}		
		}
		//1~10���� ǥ���Ǹ鼭 �յ� ǥ���Ǵ� ��¹�.
		System.out.println("------------------------------------");
		
		int sum2=0;
		
		for(int i=1; i<=10; i++) {
			sum2=sum2+i;
			if(i==10) {
				System.out.print(i+"="+sum2+"\n");
			}else {
				System.out.print(i+"+");
			}
		}
		System.out.println("------------------------------------");
		int sum3=0;
		
		for(int i=1; i<=10; i++) {
			sum3+=i;
			if(i==1) {
				System.out.print(i);
			}else {
				System.out.print("+"+i);
			}
		}
		System.out.println("="+sum3);
		System.out.println("------------------------------------");
		
	}
}
