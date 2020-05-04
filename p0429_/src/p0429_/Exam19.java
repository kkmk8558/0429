package p0429_;

import java.util.Scanner;

public class Exam19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int s;
		String y;
		System.out.print("점수: ");
		s = scan.nextInt();
		switch(s/10) {
		case 10:
		case 9:
		case 8:
		System.out.println("수");
		break;
		case 7:
			System.out.println("우");
			break;
		case 6:
			System.out.println("미");
			break;
		case 5:
			System.out.println("양");
			break;
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println("가");
		default:
			System.out.println("잘못된 점수입니다.");
			
		}
		

	}

}
