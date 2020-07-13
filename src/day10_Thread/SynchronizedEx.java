package day10_Thread;

class SharedBoard{
	private int sum = 0;	// ��� �����ϴ� ���� �˱� ���ؼ� ����.
	synchronized public void add() {	// �ش� Ű���带 ������, �ٸ� ���� ������ �����°� �ȴ�.
		int n = sum;
		n+=10;
		sum =n;
		System.out.println(Thread.currentThread().getName()+" : "+sum);
	}
	public int getSum() {	// sum�� private�̴ϱ� �����Ͽ� ���� �Ҽ� �ְ�.
		return sum;
	}
}
class StudentThread extends Thread{	// Thread�̿��� ���ؼ� ���.
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
		Thread st1 = new StudentThread("�̼���",board);
		Thread st2 = new StudentThread("ȫ�浿",board);
		
		st1.start();
		st2.start();
	}

}
