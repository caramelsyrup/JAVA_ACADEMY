package day10_Thread;

public class SaramRunnable implements Runnable {	// Thread�� ��� ���� ���ϴ� ��Ȳ������ Runnable�� ���.

	private String name;
	public SaramRunnable(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		SaramRunnable s1 = new SaramRunnable("ȫ�浿");	// ��ü�� ���� ����.
		SaramRunnable s2 = new SaramRunnable("�̼���");
		SaramRunnable s3 = new SaramRunnable("������");
		Thread th1 = new Thread(s1);					// Thread�� ��ü�� ����. Ŭ������ ��ü�� �Ű������� �ϴ�.
		Thread th2 = new Thread(s2);
		Thread th3 = new Thread(s3);
		th1.start();									// Runnable�� run�� ������ Thread ��ü�� start�� ����.
		th2.start();
		th3.start();
	}
	
	@Override
	public void run() {					// Runnable�� �翬�� Interface�̱⿡ run()�� ����Ʈ �Ǿ� �ְ�, �������̵� �ʿ�.
		for(int i=0; i<5;i++) {
			System.out.println(name+"�� ���Ѵ�.");
			try {
				Thread.sleep(1000);		// 1000�� 1��, 1�ʰ��� sleep �����̸� �߻�.
			}catch(InterruptedException e){	// ������ ���ͷ��� ���� ���� �߻��� ����ش�.
				e.printStackTrace();
			}
		}
	}
	
}
