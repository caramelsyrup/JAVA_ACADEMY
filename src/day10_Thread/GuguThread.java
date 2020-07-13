package day10_Thread;

public class GuguThread extends Thread {	// Thread 를 상속 받음.JVM에서 알아서 실행.
	private int g;
	
	public GuguThread(int a) {
		this.g = a;
	}
	
	public void run() {
		for(int i=1; i<=9; i++) {
			System.out.println(g+" x "+i+"="+(g*i));
		}System.out.println();
	}
	// for문이 사람이 입력 할때와는 다르게 출력 된다. 순서에 상관없이.
	public static void main(String[] args) {
		GuguThread g1 = new GuguThread(5);
		g1.start();
		GuguThread g2 = new GuguThread(7);
		g2.start();
		GuguThread g3 = new GuguThread(3);
		g3.start();
	} // run()을 호출하는 것은 start()이다.

}
