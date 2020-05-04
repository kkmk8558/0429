package p0429_;

import java.util.Scanner;

public class Exam30 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n,i;
		System.out.println("카운트다운 합니다.");
		System.out.print("양의 정숫값: " );
		n = scan.nextInt();
		
		for(i=n;i>=0;i--) {
			System.out.printf("%d\n",i);
		}
	}

}
