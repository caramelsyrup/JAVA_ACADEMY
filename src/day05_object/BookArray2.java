package day05_object;

public class BookArray2 {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		
		library[0] = new Book("�¹���","������");
		library[1] = new Book("���̾�","�츣�� �켼");
		library[2] = new Book("��� �� ���ΰ�","���ù�");
		library[3] = new Book("����","�ڰ渮");
		library[4] = new Book("�����","�����㺣��");
		// �� ���� ��ü���� ������ ����. Book Ŭ������ ������ ���Ŀ� ���缭 �Է�.
		
		
		for(int i=0; i<library.length; i++) {
			library[i].showBookInfo();
		}	// showBookInfo �Լ��� BookŬ�������� ����� ���� ��. ��¹��� ����Ǵ� ���.
		
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}
		//�ش� �迭�� �ּҰ��� ����� �ȴ�.
	}

}
