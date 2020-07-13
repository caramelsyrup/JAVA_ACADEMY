package day07;

public class Student {
	
	int studentID;
	String studentName;
	Subject[] subjectList;	//Subject객체형의 배열에 변수 subjectList 생성. int형의 배열만 만들수 있는것이 아님.
	int index;
	// ArrayList는 객체만 저장가능. int 등은 저장 못함.
	// ArrayList는 중간에 데이터가 사라져도, 위치조정이 자동으로.
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new Subject[10];	// Subject 배열은 10개로 설정하여 subjectList 변수에 넣음. 배열 형태를 저장.
	}
	
	public void addSubject(String name,int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList[index++] = subject;
			
	}
	
	public void showStudentInfo() {
		int total = 0;
		for(Subject s : subjectList) { //for each 문
			if(s==null)break;
			total += s.getScorePoint();
			System.out.println("학생 "+studentName+"의"+s.getName()+" 과목 성적은 "+s.getScorePoint()+"입니다.");
		}
		System.out.println("학생 "+studentName+"의 총점은 "+total+" 입니다.");
	}
}
