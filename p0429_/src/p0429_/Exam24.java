package p0429_;

import java.util.Scanner;

public class Exam24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.print("몇 월입니까?: ");
		n = scan.nextInt();
		
		switch(n) {
		case 3 :
		case 4 :
		case 5 :
			System.out.println("봄");
			break;
		case 6 :
		case 7 :
		case 8 :
			System.out.println("여름");
			break;
		case 9 :
		case 10 :
		case 11 :
			System.out.println("가을");
			break;
		case 12 :
		case 1 :
		case 2 :
		default :
			System.out.println("그런 월은 없습니다.");
		}
		

	}

}
