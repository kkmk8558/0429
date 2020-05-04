package p0429_;

import java.util.Scanner;

public class Exam17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		
		System.out.print("정숫값: ");
		n = scan.nextInt();
		
		if(n%10==0) {
			System.out.print("이 값은 10의 배수입니다.");
		}else {
			System.out.print("이 값은 10의 배수가 아닙니다.");
	
			
		}
	}
}
