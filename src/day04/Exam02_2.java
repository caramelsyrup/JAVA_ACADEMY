package day04;

public class Exam02_2 {

	public static void main(String[] args) {
		// ��ġ�� �����ϰ� �ִ´�.
		
		int arr[] = new int[5];
		
		int n=0;
		
		while(n<arr.length) {
			int col = (int)(Math.random()*5);	// �迭��ġ�� �����ϰ� ����.
			System.out.println("��ġ col : "+col+"\t");
			if(arr[col]!=0) {
				continue;	// ���� �������� �ֱ� ���ؼ�, 0�̵Ǹ� �ٽ� ������ ������ ���ؼ�.
			}else {	// �迭�� 0�ϋ�
				arr[col] = (int)(Math.random()*100)+1;	// ������ ��ġ�� 
				n++;
			}
		}	// while
		System.out.println();
		for(int a:arr) {	// arr �迭�� ��� ���Ҹ� ���.
			System.out.print(a+"\t");
		}

	}

}
