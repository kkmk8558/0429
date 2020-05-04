package p0429_;

import java.util.Scanner;

public class Exam15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b;
		System.out.print("변수a: ");
		a = scan.nextInt();
		System.out.print("변수b: ");
		b = scan.nextInt();
		
		if(a>b){
			System.out.println("a가 크다");
		}else if(a<b){
			System.out.println("b가 크다");
		}
		

	}

}
