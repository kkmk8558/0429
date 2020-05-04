package p0429_;

import java.util.Scanner;

public class Exam16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.print("정숫값: ");
		n = scan.nextInt();
		if(n%5==0){
			System.out.println("이 값은 5로 나누어 집니다.");
		}else {
			System.out.println("이 값은 5로 나누어지지 않습니다.");
		}

	}

}
