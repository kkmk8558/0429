package p0429_;

import java.util.Scanner;

public class Exam18 {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int n,x;
			
			System.out.print("정숫값: ");
			n = scan.nextInt();
			x = n%3;
			if(n%3==0) {
				System.out.print("이 값은 3으로 나누어집니다.");
			}else if(x==1) {
				System.out.print("이 값을 3으로 나눈 나머지는 1입니다.");
			}else if(x==2)
				System.out.print("이 값을 3으로 나눈 나머지는 2입니다.");
			
				
			}
		}
