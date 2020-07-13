package day06;

public class Teacher {	// �������� �Է��ϴ� �л����� �����ʹ� StudentBean���� ó�� �� �� �ֵ���.
	
	StudentBean[] arr = new StudentBean[50];	// StudentBean Ŭ������ �迭���� ���. arr�迭�� StudentBeanŬ������ ����.
	int cnt;	// �迭�� ���� cnt�� ���ϱ�. ��������� int�� �ʱⰪ�� 0�̴�.
	
	public void showMenu() {
		System.out.println();
		System.out.println("�����ϼ���.>");
		System.out.println("1.�����Է�.>");
		System.out.println("2.��ü����.>");
		System.out.println("3.����.>");
		System.out.print("����>>");
	} // �ʱ� ȭ�� ����.
	
	public void inputData() {
		
		System.out.print("�̸��� �Է��ϼ���.");
		String name = ScoreMain.sc.next();
		System.out.println("���� ������ �Է��ϼ���.");
		int kor = ScoreMain.sc.nextInt();
		System.out.println("���� ������ �Է��ϼ���.");
		int eng = ScoreMain.sc.nextInt();
		System.out.println("���� ������ �Է��ϼ���.");
		int math = ScoreMain.sc.nextInt();
		
		arr[cnt] = new StudentBean(name, kor, eng, math);
		cnt++; //�迭�� ä�����ϱ� ������, 1����.
		
	}	// ��ü�� ������ �Է�. �迭�� ��ü �ֱ�
	
	public void rankMethod() {
		for(int i=0; i<cnt; i++) {
			for(int j=i+1; j<cnt; j++) {
				if(arr[i].getTotal()>arr[j].getTotal()) {
					arr[j].setRank(1);	// ���� ���� 1�� �����ǵ��� �Լ��� �Ű����� 1�� ����.
				}else if(arr[i].getTotal()<arr[j].getTotal()){
					arr[i].setRank(1);
				}
			}
		}	
	}	// rankMethod�� ������ Ŭ�������� �۵� ��Ű�� ��. ������ rank�� �л��� ���̱⿡, �л� Ŭ�������� �ۼ�.
	
	public void viewData() {
		rankMethod();
		System.out.println("---�л� ���� ����---");
		System.out.println("�̸�\t����\t���\t����\t");
		int sum=0;
		for(int i=0; i<cnt; i++) {
			if(arr[i]!=null) {
			System.out.print(arr[i].getName()+"\t");
			System.out.print(arr[i].getTotal()+"\t");
			System.out.print(arr[i].getAvg()+"\t");
			System.out.print(arr[i].getRank()+"\t");
			// arr�� StudentBean Ŭ������ �־��⿡, Ŭ������ ����� �Լ�, ���� ��� ���� ����.
			sum+=arr[i].getTotal();
			}
			System.out.println();
		}
		System.out.println("�б� ���� : "+sum);
		System.out.println("�б� ��� : "+(sum/cnt));
	}
		// �迭�� ��ȸ,���.
}
