package p0429_;

import java.util.Scanner;

public class Exam31 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n,sum = 0;
		System.out.print("1부터 n까지의 합을 구합니다.n의 값: ");
		n = scan.nextInt();
		
		for(int i=1; i<=n; i++){
		sum = sum+i;
		}
		System.out.printf("1부터 %d까지의 합은 %d입니다.\n",n,sum);
		

	}

}
