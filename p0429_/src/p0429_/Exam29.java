package p0429_;

import java.util.Scanner;

public class Exam29 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n,i=1,a=1;
		System.out.print("양의 정숫값: ");
		n = scan.nextInt();
		
		do{
			a=a*i;
			i++;
		}while(i<=n);
		System.out.printf("1부터 5까지의 곱은 %d입니다.",a);

	}

}
