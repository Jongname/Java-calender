package calender;

import java.util.Scanner;

public class Calender {
	private final int[] MAX_DAYS = {31, 28, 31,30,31,30 , 31,30,31,30,31};
	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month-1];
	}
	public void printSample() {
		
		System.out.println(" 일   월   화   수   목   금   토 ");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calender cal = new Calender();
		//숫자를 입력받아 해당 달의 최대 일수를 출력하는 프로그램
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("반복횟수를 입력하세요");
		int repeat = scanner.nextInt();
		
		for(int i= 0; i<repeat; i++) {
			System.out.println("달을 입력하세요 ");
			int month = scanner.nextInt();
			System.out.println(month+"은 " +cal.getMaxDaysOfMonth(month)+"까지 있습니다.");
			
		}
		System.out.println("Bye!");

		scanner.close();
	}

}
