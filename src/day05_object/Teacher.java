package day05_object;

import java.util.jar.Attributes.Name;

public class Teacher {	// 선생님이 입력하는 학생들의 데이터는 StudentBean에서 처리 될 수 있도록.
	
	StudentBean[] arr = new StudentBean[50];	// StudentBean 클래스를 배열에서 사용. arr배열에 StudentBean클래스를 넣음.
	int cnt;	// 배열의 수를 cnt로 정하기. 멤버변수의 int는 초기값이 0이다.
	
	public void showMenu() {
		System.out.println();
		System.out.println("선택하세요.>");
		System.out.println("1.성적입력.>");
		System.out.println("2.전체보기.>");
		System.out.println("3.종료.>");
		System.out.print("선택>>");
	} // 초기 화면 구성.
	
	public void inputData() {
		
		System.out.print("이름을 입력하세요.");
		String name = ScoreMain.sc.next();
		System.out.println("국어 점수를 입력하세요.");
		int kor = ScoreMain.sc.nextInt();
		System.out.println("영어 점수를 입력하세요.");
		int eng = ScoreMain.sc.nextInt();
		System.out.println("수학 점수를 입력하세요.");
		int math = ScoreMain.sc.nextInt();
		
		arr[cnt] = new StudentBean(name, kor, eng, math);
		cnt++; //배열에 채워야하기 떄문에, 1증가.
		
	}	// 구체적 데이터 입력. 배열에 객체 넣기
	
	public void rankMethod() {
		for(int i=0; i<cnt; i++) {
			for(int j=i+1; j<cnt; j++) {
				if(arr[i].getTotal()>arr[j].getTotal()) {
					arr[j].setRank(1);	// 작은 것이 1씩 적립되도록 함수에 매개변수 1을 넣음.
				}else if(arr[i].getTotal()<arr[j].getTotal()){
					arr[i].setRank(1);
				}
			}
		}	
	}	// rankMethod는 선생님 클래스에서 작동 시키는 것. 하지만 rank는 학생의 값이기에, 학생 클래스에서 작성.
	
	
	
	public void viewData() {
		rankMethod();
		System.out.println("---학생 성적 보기---");
		System.out.println("이름\t총점\t평균\t석차\t");
		int sum=0;
		for(int i=0; i<cnt; i++) {
			if(arr[i]!=null) {
			System.out.print(arr[i].name+"\t");
			System.out.print(arr[i].getTotal()+"\t");
			System.out.print(arr[i].getAvg()+"\t");
			System.out.print(arr[i].rank+"\t");
			// arr에 StudentBean 클래스를 넣었기에, 클래스에 내장된 함수, 변수 모두 적용 가능.
			sum+=arr[i].getTotal();
			}
			System.out.println();
		}
		System.out.println("학급 총점 : "+sum);
		System.out.println("학급 평균 : "+(sum/cnt));
	}
		// 배열의 조회,출력.
}
