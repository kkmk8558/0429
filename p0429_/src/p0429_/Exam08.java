package p0429_;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double m,h,n;
		
		System.out.println("삼각형의 넓이를 구합니다.");
		System.out.print("밑변:");
		m = scan.nextDouble();
		System.out.print("높이:");
		h = scan.nextDouble();
		n = m*h/2;
		System.out.printf("넓이는 %.3f입니다.\n",n);
		
		
		

	}

}
