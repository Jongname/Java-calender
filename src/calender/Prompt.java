package calender;

import java.util.Scanner;

public class Prompt {

	public int parseDay(String week) {
		if(week.equals("su")) {
			return 0;
		}else if(week.equals("mo")) {
			return 1;
		}else if(week.equals("tu")) {
			return 2;
		}else if(week.equals("we")) {
			return 3;
		}else if(week.equals("th")) {
			return 4;
		}else if(week.equals("fr")) {
			return 5;
		}else if(week.equals("sa")) {
			return 6;
		}else
			return 0;
	}

	public void runPrompt() {
		// TODO Auto-generated method stub
		Calender cal = new Calender();
		// 숫자를 입력받아 해당 달의 최대 일수를 출력하는 프로그램
		Scanner scanner = new Scanner(System.in);

//				System.out.println("반복횟수를 입력하세요");
//				int repeat = scanner.nextInt();
		int month = 1;
		int year = 1;
		int weekDay=0;
		
		while (true) {
			System.out.println("년도를 입력하세요 ");
			System.out.print("YEAR >");
			year = scanner.nextInt();
			if(year ==-1)
				break;
			
			System.out.println("달을 입력하세요 ");
			System.out.print("MONTH >");
			month = scanner.nextInt();
			
			
			
			if (month > 12 || month <1) {
				System.out.println("잘못된 입력");
				continue;
			}
			cal.printSample(year, month);
		}
		System.out.println("Bye!");

		scanner.close();
	}

	
	
}
