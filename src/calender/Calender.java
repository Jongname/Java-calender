package calender;

import java.util.Scanner;

public class Calender {
	private final int[] MAX_DAYS = {31, 28, 31,30,31,30 , 31,30,31,30,31};
	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month-1];
	}
	public void printSample() {
		
		System.out.println(" ��   ��   ȭ   ��   ��   ��   �� ");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calender cal = new Calender();
		//���ڸ� �Է¹޾� �ش� ���� �ִ� �ϼ��� ����ϴ� ���α׷�
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�ݺ�Ƚ���� �Է��ϼ���");
		int repeat = scanner.nextInt();
		
		for(int i= 0; i<repeat; i++) {
			System.out.println("���� �Է��ϼ��� ");
			int month = scanner.nextInt();
			System.out.println(month+"�� " +cal.getMaxDaysOfMonth(month)+"���� �ֽ��ϴ�.");
			
		}
		System.out.println("Bye!");

		scanner.close();
	}

}
