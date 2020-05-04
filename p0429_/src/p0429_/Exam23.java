package p0429_;

import java.util.Scanner;

public class Exam23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b,c;
		System.out.print("실수a: ");
		a= scan.nextInt();
		System.out.print("실수b: ");
		b= scan.nextInt();
		c=a-b;
		if(a<0 || b<0) {
			System.out.print("0보다 큰수를 입력하세요.");
		}else if(a>=b) {
			System.out.printf("큰 쪽의 값은 %d입니다.\n",a-b);
		}else if(a<b) {
			System.out.printf("큰 쪽의 값은 %d입니다.\n",b-a);
		}

	}

}
