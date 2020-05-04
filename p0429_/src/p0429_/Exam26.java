package p0429_;

import java.util.Scanner;

public class Exam26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.print("몇 개의 *를 표시할까요?: ");
		n = scan.nextInt();
		int i=1;
		
		if(n>=1) {
		while(i<=n){
		System.out.print("*");
				i=i+1;
			
			}
		System.out.print("\n");
			}
		
		
	}
}
		

