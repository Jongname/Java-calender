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
		// ���ڸ� �Է¹޾� �ش� ���� �ִ� �ϼ��� ����ϴ� ���α׷�
		Scanner scanner = new Scanner(System.in);

//				System.out.println("�ݺ�Ƚ���� �Է��ϼ���");
//				int repeat = scanner.nextInt();
		int month = 1;
		int year = 1;
		int weekDay=0;
		
		while (true) {
			System.out.println("�⵵�� �Է��ϼ��� ");
			System.out.print("YEAR >");
			year = scanner.nextInt();
			if(year ==-1)
				break;
			
			System.out.println("���� �Է��ϼ��� ");
			System.out.print("MONTH >");
			month = scanner.nextInt();
			
			
			
			if (month > 12 || month <1) {
				System.out.println("�߸��� �Է�");
				continue;
			}
			cal.printSample(year, month);
		}
		System.out.println("Bye!");

		scanner.close();
	}

	
	
}
