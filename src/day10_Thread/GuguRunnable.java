package day10_Thread;

public class GuguRunnable implements Runnable {

	private int num;
	
	public GuguRunnable(int num) {
		this.num = num;
	}
	
	public static void main(String[] args) {
		GuguRunnable gu1 = new GuguRunnable(10);
		GuguRunnable gu2 = new GuguRunnable(8);
		GuguRunnable gu3 = new GuguRunnable(6);
		
		Thread t1 = new Thread(gu1);
		Thread t2 = new Thread(gu2);
		Thread t3 = new Thread(gu3);
		
		t1.start();
		t2.start();
		t3.start();
	}
	@Override
	public void run() {
		for(int i=1; i<=9; i++) {
			System.out.println(num+"x"+i+"="+(num*i));
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}

}
