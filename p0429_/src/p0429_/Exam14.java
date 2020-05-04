package p0429_;

import java.util.Scanner;

public class Exam14 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int n;
		 System.out.print("정숫값: ");
		 n = scan.nextInt();
		 
		 if(n>0) {
			 System.out.println("값이 양수입니다.");
		 }else if(n==0) {
			 System.out.println("값이 0입니다.");
		 }else if(n<0) {
			 System.out.println("값이 음수 입니다.");
		 }
		 
		 

	}

}
