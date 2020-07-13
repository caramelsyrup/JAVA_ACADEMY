package day07;

public class Student {
	
	int studentID;
	String studentName;
	Subject[] subjectList;	//Subject��ü���� �迭�� ���� subjectList ����. int���� �迭�� ����� �ִ°��� �ƴ�.
	int index;
	// ArrayList�� ��ü�� ���尡��. int ���� ���� ����.
	// ArrayList�� �߰��� �����Ͱ� �������, ��ġ������ �ڵ�����.
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new Subject[10];	// Subject �迭�� 10���� �����Ͽ� subjectList ������ ����. �迭 ���¸� ����.
	}
	
	public void addSubject(String name,int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList[index++] = subject;
			
	}
	
	public void showStudentInfo() {
		int total = 0;
		for(Subject s : subjectList) { //for each ��
			if(s==null)break;
			total += s.getScorePoint();
			System.out.println("�л� "+studentName+"��"+s.getName()+" ���� ������ "+s.getScorePoint()+"�Դϴ�.");
		}
		System.out.println("�л� "+studentName+"�� ������ "+total+" �Դϴ�.");
	}
}
