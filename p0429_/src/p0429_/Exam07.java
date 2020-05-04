package p0429_;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x,y,sum,sum2;
		
		System.out.printf("x값은 %d입니다.");
		x = scan.nextDouble();
		System.out.printf("y값은 %d입니다.");
		y = scan.nextDouble();
		sum=x+y;
		System.out.printf("합계는 %.3f입니다.\n",sum);
		sum2=sum/2;
		System.out.printf("평균은 %.3f입니다.\n",sum2);
		
	}

}
