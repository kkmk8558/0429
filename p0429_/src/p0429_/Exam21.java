package p0429_;

import java.util.Scanner;

public class Exam21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b,c;
		System.out.print("정수a: ");
		a = scan.nextInt();
		System.out.print("정수b: ");
		b = scan.nextInt();
		c = a-b;
		
		if(a>b) {
			System.out.printf("두 값의 차는 %d입니다.",c);
		}else if(a<b) {
			System.out.printf("두 값의 차는 %d입니다.",-c);
		}
		
	}
	}