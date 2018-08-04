package calender;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("두수를 입력해주세요.");
		String s1, s2;
		s1 = scanner.next();
		s2 = scanner.next();
		
		System.out.println(s1 +" , " +s2);
		a= Integer.parseInt(s1);
		b= Integer.parseInt(s2);
		int c = a+b;
		System.out.println(" 두수의 합은 : " + c);
		scanner.close();
	}

}
