package day06;

public class BookBean {
	// �������� �������� ���ϵ��� private�� �����Ѵ�.
	private String title;
	private String writer;
	// ���������� public > default > private : ������ > ���� ��Ű�� �� > �ڽŸ�
	public BookBean() {
		
	}
	public BookBean(String title, String writer) {
			this.title = title;
			this.writer = writer;
		}
	
	//getter��� �Ѵ�. private�� ������ ������ ����ϱ� ���ؼ�, �Լ��� ����ؼ� �� ���ϰ��� �̿��ϵ����Ѵ�.
	public String getTitle() {
		return title;
	}
	
	public String getWriter() {
		return writer;
	}
	
	
}
