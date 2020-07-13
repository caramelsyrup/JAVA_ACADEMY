package day10_Thread;

public class GuguThread extends Thread {	// Thread �� ��� ����.JVM���� �˾Ƽ� ����.
	private int g;
	
	public GuguThread(int a) {
		this.g = a;
	}
	
	public void run() {
		for(int i=1; i<=9; i++) {
			System.out.println(g+" x "+i+"="+(g*i));
		}System.out.println();
	}
	// for���� ����� �Է� �Ҷ��ʹ� �ٸ��� ��� �ȴ�. ������ �������.
	public static void main(String[] args) {
		GuguThread g1 = new GuguThread(5);
		g1.start();
		GuguThread g2 = new GuguThread(7);
		g2.start();
		GuguThread g3 = new GuguThread(3);
		g3.start();
	} // run()�� ȣ���ϴ� ���� start()�̴�.

}
