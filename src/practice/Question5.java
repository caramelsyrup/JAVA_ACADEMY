package practice;

public class Question5 {

	public static void main(String[] args) {
		
		for(int j=0; j<7; j++) {		//���� 7ĭ
		  for(int i=0; i<7; i++) {	// ���� 7ĭ
			 if(i<=7/2){				// ���.
				if(j+i<(7/2)) {			// ���� ��� ��ĭ �Է�.
					System.out.print(" ");
				}else if(j-i>=(7/2)+1) {		// ���� �ϴ� ��ĭ �Է�.
					System.out.print(" ");
				}else {
					System.out.print("*");	// 4�������� �� �����.
				}
			 }else if (i>(7/2)){			// �ϴ�.
				 if(i-j>=(7/2)+1) {		// ������ ��� ��ĭ
					 System.out.print(" ");
				 }else if(i+j>=10) {		// ������ �ϴ� ��ĭ �Է�.
					 System.out.print(" ");
				 }else {
					 System.out.print("*");
				 }
				
			}
		  }
		  System.out.println();
		}
	}
}
