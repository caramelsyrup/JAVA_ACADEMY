package day03;

public class Exam07 {

	public static void main(String[] args) {
		// 
		int[][] arr = new int[3][4]; // 3�� 4��¥�� ���� �迭�� ���������.
		arr[0][0]=1;	// 0,0�� 1�� �־��.
		int[][] a	=	{{1,2,3,4},{11,22,33,44},{111,222,333,444}};
		System.out.println(a[1][2]);
		// ������ �迭�� 0�������� ���۵ȴ�. ��ǻ�� ������
		for(int i=0; i<a.length; i++) {			// ���� ���� ������ ���, ���� �迭���� ���� 3���̱⿡, length�� 3�� �ȴ�.
			for(int j=0; j<a[i].length;j++) {	// �ش� ���� ���� ������ ����ش�. ���� �迭���� ���� 4ĭ�̱⿡, length�� 4�� �ȴ�.
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
