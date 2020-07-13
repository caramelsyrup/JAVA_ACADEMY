package day05_object;

import java.util.Scanner;

		// 배열 응용.
public class TwoArrayScore {
	static Scanner sc = new Scanner(System.in);
	int [][] arr = new int[50][7];
	int row	=	0;
	
	public void showMenu() {		
		System.out.println("선택하세요.>");
		System.out.println("1.성적입력.>");
		System.out.println("2.전체보기 종료.>");
		System.out.print("선택>>");
		
	}	//  초기 메뉴 선택 화면을 구성.
	
	public void inputData() {
		System.out.println("성적입력 시작");
		System.out.println("학번");
		int yearNum = sc.nextInt();
		
		System.out.println("국어");
		int kor = sc.nextInt();
		
		System.out.println("영어");
		int eng = sc.nextInt();
		
		System.out.println("수학");
		int math = sc.nextInt();
		
		arr[row][0]	=	yearNum;	// 학번
		arr[row][1]	=	kor;		// 국어
		arr[row][2]	=	eng;		// 영어
		arr[row][3]	=	math;		// 수학
		arr[row][4]	=	kor+eng+math;	// 총점
		arr[row][5]	=	arr[row][4]/3;	// 평균
		arr[row][6]	=	1;		// 석차
		row++;
		
		
		/*for(int i=0; i<arr.length; i++) {
			for(int j=0; j<7; j++) {
				arr[i][j] = sc.nextInt(); 순서대로 입력	
			}
		}*/
		
		
	}	// 사용할 메소드를 설정. 
	
	public void viewData() {
		rankMethod();
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t석차\t");
		for(int i=0; i<row; i++) {	// 범위를 row로 설정하면, 배열에 입력되지 않은 행은 배제된다.
			// for(int i=0; i<arr.length; i++){
			//	if(arr[i][0]==0) break;
			//  } 와 같이 써도, 배열에 입력되지 않은 값들은 출력되지 않는다.
			for(int j=0; j<arr[i].length; j++) {	// arr[i].length로 범위를 설정하면, i행의 열의 갯수를 의미하므로, 열이 더 추가될때 자동으로 적용.
				System.out.print(arr[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
		
	}
	
	public void rankMethod() {
		for(int i=0; i<row-1; i++) {	// 1번 다 비교. -1을 함으로써 row범위가 넘어가는 것을 방지.
			for(int j=i+1; j<row; j++)	// 바로 다음 행의 값과 비교를 하기 때문에 행-다음행 사이의 값비교 범위 설정.
			if(arr[i][4] > arr[j][4]) {	// 총점 값을 비교. 언제나 열이 1이 더 많은 것과 값을 비교하기에.
				arr[j][6]+=1;			// 더 낮은 쪽에 순위 +1 부여. 
			}else { 
				arr[i][6]+=1;			// 더 낮은 쪽에 순위 +1 부여.
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		TwoArrayScore manager	=	new TwoArrayScore();
		
		while(true) {	//while 무한루프문을 사용.
			manager.showMenu();		// 메뉴 보여주기
			int num = sc.nextInt();	// 메뉴선택
			switch(num) {
				case 1 :
					manager.inputData();
					break;
				case 2 :
					manager.viewData();
					System.exit(0);
				default : System.out.println("입력오류.");
			}
		
		}

	}

}
