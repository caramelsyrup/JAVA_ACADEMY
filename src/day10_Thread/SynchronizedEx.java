package day10_Thread;

class SharedBoard{
	private int sum = 0;	// 몇번 접근하는 가를 알기 위해서 설정.
	synchronized public void add() {	// 해당 키워드를 넣으면, 다른 애의 접근은 대기상태가 된다.
		int n = sum;
		n+=10;
		sum =n;
		System.out.println(Thread.currentThread().getName()+" : "+sum);
	}
	public int getSum() {	// sum은 private이니까 접근하여 리턴 할수 있게.
		return sum;
	}
}
class StudentThread extends Thread{	// Thread이용을 위해서 상속.
	private SharedBoard board;
	public StudentThread(String name,SharedBoard board ) {
		super(name);
		this.board	=	board;
	}
	
	@Override
		public void run() {
			for(int i=0;i<10;i++) {
				board.add();
			}
		}
}

public class SynchronizedEx {

	public static void main(String[] args) {
		SharedBoard board = new SharedBoard();
		Thread st1 = new StudentThread("이순신",board);
		Thread st2 = new StudentThread("홍길동",board);
		
		st1.start();
		st2.start();
	}

}
