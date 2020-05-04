package p0429_;

import java.util.Scanner;

public class Exam20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a,b;
		System.out.print("실수a: ");
		a= scan.nextDouble();
		System.out.print("실수b: ");
		b= scan.nextDouble();
		
		if(a>b) {
			System.out.printf("큰 쪽의 값은 %.1f입니다.\n",a);
		}else if(a<b) {
			System.out.printf("큰 쪽의 값은 %.1f입니다.\n",b);
		}

	}

}
