package day03;

public class Exam06 {

	public static void main(String[] args) {	
				
		System.out.println((int)(Math.random()*10));	
		// Math.random �ش� �޼ҵ�� �����ϰ� 0����1������ �Ǽ��� �̾Ƴ�.
		/*
		 * ũ�� 10�� �迭, 0~50������ ���� �߻�.
		 * 0�� �ƴ� ���� �迭�� ��������.
		 * �ߺ����
		 */
		
		int arr[] = new int [10];	// ũ�� 10�� �迭.
		System.out.println((int)(Math.random()*50));	// ���� �߻�.
		
			int n=0;	// �迭�� ����.
			
			while(n<arr.length) {	// �ּ� 10���� ����Ǿ���ϱ⿡.	while�� �ܼ��� ������ ������ ����.
				int r = (int)(Math.random()*50);
				if(r==0) {			// ������ 0�ΰ�
					continue; 		// �� ������ �ٽ� ����.
				} 					// ������ 0�� �ƴҶ�,
					arr[n]=r;
					n++;			// 0�� �ƴ� ���� ����Ǹ�, n�� 1���� ��Ŵ.
					// arr[n++]=r; �� �ۼ��ص� �ȴ�.
			}
			
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i]+"\t");
			}
			System.out.println();
			for(int i:arr) {	// for-each �� ���. ������ Ư�� i�� ���ڸ� Ư����� �̿� �Ұ���.
				System.out.print(i+"\t");
			}
			System.out.println();
			
			/*while(n<arr.length) {
				int a = (int)(Math.random()*50);
				if(a==0) {
					continue;
				}
				arr[n]=a;
				System.out.print(arr[n]+"\t");
				++n;
			}*/
				
			String[] str = {"one","two","three"};
			for(String s : str) {
				System.out.print(s+"\t");
			}
				
				
				
				
	}

}
