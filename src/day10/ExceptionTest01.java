package day10;

public class ExceptionTest01 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		String str = "";
		try {	// �õ��� �� ��,
			System.out.println(str.length());
			for(int i=0;i<=5;i++) {	// 0~4�� �����ϴµ�, 5 �ִ°��� ���� ��.
				arr[i]=i;
				System.out.println(arr[i]);
			}
		
		}catch(ArrayIndexOutOfBoundsException e) {	// ���� �߻���, ����.
			System.out.println("���� �߻�");
		}catch(NullPointerException n){
			System.out.println("null��");
		}finally {									// catch������ ���� �� ����, ������ ����Ǵ� �κ�.
			System.out.println("�ݵ�� �����϶�");
		}
	}	// ���ܴ� ���� ���� �ϼ��� �Ʒ���, ���� ���� �ϼ��� ����.

}
