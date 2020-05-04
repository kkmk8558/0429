package p0429_;

import java.util.Scanner;

public class Exam13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A,B;
		System.out.print("변수 A: ");
		A=scan.nextInt();
		System.out.print("변수 B: ");
		B=scan.nextInt();
		
		if(A%B==0) {
			System.out.print("B는 A의 약수입니다.");
		}else {
			System.out.print("B는 A의 약수가 아닙니다.");
		}
		

	}

}
