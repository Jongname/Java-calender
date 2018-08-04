package calender;

public class Calender {
	private final int[] MAX_DAYS = {0, 31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31 };
	private final int[] LEAP_MAX_DAYS = {0, 31, 29, 31, 30, 31, 30, 31, 30, 31, 30, 31 };

	public boolean isLeapYear(int year) {
		if(year%4==0 && (year%100!=0 || year%400 ==0)) {
			return true;
		}
		return false;
	}
	
	public int getMaxDaysOfMonth(int year ,int month) {
		if(isLeapYear(year)) {
			return LEAP_MAX_DAYS[month];
		}
		return MAX_DAYS[month];
	}

	public void printSample(int year ,int month) {

		System.out.printf("  <<%4d년 %3d월>>\n", year,month);
		System.out.println(" 일   월   화   수   목   금   토 ");
		System.out.println("--------------------");
		
		//weekday auto
		int weekDay = getWeekday(year,month,1);
		for(int i= 0; i<weekDay; i++) {
			System.out.print("   ");
		}
		
		//print first line
		int maxDay = getMaxDaysOfMonth(year, month);
		int count =7 - weekDay;
		int delin = (count<7) ? count : 0;
		
		
		for(int i=1; i<=count; i++) {
			System.out.printf("%3d",i);
		}
		System.out.println();
		
		
		//print from second line to last
		count++;
		for(int i=count ; i<=maxDay; i++) {
			System.out.printf("%3d",i);
			if(i%7==delin) {
				System.out.println();
			}
		}
		System.out.println();
//		System.out.println(" 1  2  3  4  5  6  7");
//		System.out.println(" 8  9 10 11 12 13 14");
//		System.out.println("15 16 17 18 19 20 21");
//		System.out.println("22 23 24 25 26 27 28");
	}

	public int getWeekday(int year, int month, int day) {
		int syear =1970;
		
		final int SWEEKDAY=3; // 1970 , Jan, 1st =Thursday
		
		int count = 0;
		for(int i =syear; i<=year; i++) {
			int delta= isLeapYear(i)? 366 : 365;
			count +=delta;
		}
		//count
		for(int i =1;i<month; i++) {
			int delta = getMaxDaysOfMonth(year, i);
			count +=delta;
		}
		count += day-1;
		
		int weekday = (count+SWEEKDAY) %7;
		return weekday;
	}

	

}
