package day09;

import java.util.Calendar;

public class CalendarTest {
	
	static void printCalendar(String msg, Calendar cal) {
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"/"+month+"/"+day);
		//요일
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		int d = cal.get(Calendar.DAY_OF_WEEK);
		
		String yul = "";
		
		switch(d) {
		case Calendar.SUNDAY : yul="일"; break;
		case 2 : yul="월"; break;
		case 3 : yul="화"; break;
		case 4 : yul="수"; break;
		case 5 : yul="목"; break;
		case Calendar.FRIDAY : yul="금"; break;
		case 7 : yul="토"; break;
		}
		System.out.println(yul+"요일");
		
		// 배열을 사용하여.
		String[] arr = { "일","월","화","수","목","금","토"};
		System.out.println("배열요일 : "+arr[cal.get(Calendar.DAY_OF_WEEK)-1]); // get으로 나오는 값이 수치이다. 그리고 DAY_OF_WEEK 또한 숫자로 리턴.
		
		String ap ="";
/*		if(cal.get(Calendar.AM_PM) == Calendar.AM) {
			ap="오전";
		}else {
			ap="오후";
		}
*/
		ap = (cal.get(Calendar.AM_PM) == Calendar.AM)? "오전" : "오후";
		
		int h = cal.get(Calendar.HOUR_OF_DAY);
		int m = cal.get(Calendar.MINUTE);
		int s = cal.get(Calendar.SECOND);
		System.out.println("현재시각 : "+ap+" "+h+":"+m+":"+s);
	}
	

	public static void main(String[] args) {
		Calendar Now = Calendar.getInstance();
		printCalendar("현재",Now);	// 해당 메소드를 그냥 호출 할때는 메소드가 static으로 작성이 되어야.
		CalendarTest.printCalendar("현재",Now);
	
		Now.set(1987, 0, 11);
		CalendarTest.printCalendar("생일",Now);
	
	
	}

}
