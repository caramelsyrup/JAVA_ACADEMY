package day10_Thread;

public class SaramRunnable implements Runnable {	// Thread를 상속 받지 못하는 상황에서는 Runnable을 사용.

	private String name;
	public SaramRunnable(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		SaramRunnable s1 = new SaramRunnable("홍길동");	// 객체를 먼저 만듦.
		SaramRunnable s2 = new SaramRunnable("이순신");
		SaramRunnable s3 = new SaramRunnable("강감찬");
		Thread th1 = new Thread(s1);					// Thread로 객체를 생성. 클래스의 객체를 매개변수로 하는.
		Thread th2 = new Thread(s2);
		Thread th3 = new Thread(s3);
		th1.start();									// Runnable의 run의 실행은 Thread 객체의 start로 가능.
		th2.start();
		th3.start();
	}
	
	@Override
	public void run() {					// Runnable은 당연히 Interface이기에 run()이 디폴트 되어 있고, 오버라이드 필요.
		for(int i=0; i<5;i++) {
			System.out.println(name+"이 말한다.");
			try {
				Thread.sleep(1000);		// 1000는 1초, 1초간의 sleep 딜레이를 발생.
			}catch(InterruptedException e){	// 하지만 인터럽에 대한 예외 발생만 잡아준다.
				e.printStackTrace();
			}
		}
	}
	
}
