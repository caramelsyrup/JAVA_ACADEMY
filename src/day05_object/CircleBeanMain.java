package day05_object;

public class CircleBeanMain {

	public static void main(String[] args) {
		
		// �������� 1,2,3,4,5�� 5���� ��üCircleBean, ���� ���. �Ѹ��� ���.
		/*
		CircleBean c1 = new CircleBean(1);
		CircleBean c2 = new CircleBean(2);
		CircleBean c3 = new CircleBean(3);
		CircleBean c4 = new CircleBean(4);
		CircleBean c5 = new CircleBean(5);
		*/
		
		// �迭�� ����, ����, �ʱ�ȭ.
		CircleBean[] arr = new CircleBean[5];	// arr�̶�� �迭�� ����µ�, Ŭ������ �̿�.
		for(int i=0; i<arr.length; i++) {		// for�� �ݺ� ���� ����.
			arr[i] = new CircleBean(i+1);		// arr�迭 ������ ��������ֱ⿡, �迭 ������ ���� �־���. new CircleBean(�Ű�����) �ָ�.
			System.out.println(arr[i].getArea());	// new�� ��ü ������ �ʱ�ȭ�� �Ǿ� �ֱ⿡, ��� ����.
		}
		double sum = 0;
		for(int i=0; i<arr.length; i++) {		// for�� �ݺ� ���� ����.
			sum+=arr[i].getArea();
		}
		System.out.println(sum);
		
		
		
	}

}
