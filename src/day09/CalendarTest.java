package day09;

import java.util.Calendar;

public class CalendarTest {
	
	static void printCalendar(String msg, Calendar cal) {
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"/"+month+"/"+day);
		//����
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		int d = cal.get(Calendar.DAY_OF_WEEK);
		
		String yul = "";
		
		switch(d) {
		case Calendar.SUNDAY : yul="��"; break;
		case 2 : yul="��"; break;
		case 3 : yul="ȭ"; break;
		case 4 : yul="��"; break;
		case 5 : yul="��"; break;
		case Calendar.FRIDAY : yul="��"; break;
		case 7 : yul="��"; break;
		}
		System.out.println(yul+"����");
		
		// �迭�� ����Ͽ�.
		String[] arr = { "��","��","ȭ","��","��","��","��"};
		System.out.println("�迭���� : "+arr[cal.get(Calendar.DAY_OF_WEEK)-1]); // get���� ������ ���� ��ġ�̴�. �׸��� DAY_OF_WEEK ���� ���ڷ� ����.
		
		String ap ="";
/*		if(cal.get(Calendar.AM_PM) == Calendar.AM) {
			ap="����";
		}else {
			ap="����";
		}
*/
		ap = (cal.get(Calendar.AM_PM) == Calendar.AM)? "����" : "����";
		
		int h = cal.get(Calendar.HOUR_OF_DAY);
		int m = cal.get(Calendar.MINUTE);
		int s = cal.get(Calendar.SECOND);
		System.out.println("����ð� : "+ap+" "+h+":"+m+":"+s);
	}
	

	public static void main(String[] args) {
		Calendar Now = Calendar.getInstance();
		printCalendar("����",Now);	// �ش� �޼ҵ带 �׳� ȣ�� �Ҷ��� �޼ҵ尡 static���� �ۼ��� �Ǿ��.
		CalendarTest.printCalendar("����",Now);
	
		Now.set(1987, 0, 11);
		CalendarTest.printCalendar("����",Now);
	
	
	}

}
