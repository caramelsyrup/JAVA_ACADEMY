package day05_object;

public class BookArray {
	public static void main(String[] args) {
		Book[] library	=	new Book[5];	// library ��ü�迭 ����.Book�� ��ü
		
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}
		// �迭�� ��ü���� ���� ���� �ʾұ⿡, null�� ��µȴ�.
		// �迭�� �ʱⰪ�� null�̴�.
		
	}
}
