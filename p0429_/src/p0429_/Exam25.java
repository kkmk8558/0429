package p0429_;

import java.util.Scanner;

public class Exam25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.print("몇 개의 *를 표시할까요?: ");
		n = scan.nextInt();
		
		if(n>=1)
		
		for(int i=0; i<1; i++) {//한개의 줄생성
			for(int j=0; j<n; j++) {//한 줄에 n번씩 실행
			System.out.print("*");
		}
			System.out.println();
			
		}else{
		System.out.print("1미만이면 줄 바꿈 문자를 표시해서는 안된다");
		}
		scan.close();
	}
	}
