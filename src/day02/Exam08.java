package day02;

public class Exam08 {

	public static void main(String[] args) {
		// 1���� 10���� Ȧ���� �� ���ϱ�
		int sum=0;
		for(int i=1; i<=10; i++) {
			if(i%2==1) {
			sum+=i;
			}
		}
		System.out.println("����� "+sum);
		System.out.println("\n--------------------------------------");
		
		int hap =0;
		for(int i=1; i<=10; i++) {
			if(i%2!=1) continue; // ������ ���̸� �Ʒ������� �������� ����. for���� ��� ���� ��.
			hap+=i;
		}
		System.out.println("continue ����� "+hap);
		System.out.println("\n--------------------------------------");
		
		int h =0;
		for(int i=1; i<=10; i++) {
			if(i%2!=1) break; // ������ ���̸� for���� break�϶�.
			h+=i;
		}
		System.out.println("break ����� "+h);
		System.out.println("\n--------------------------------------");
		

	}

}
