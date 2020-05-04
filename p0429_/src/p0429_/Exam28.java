package p0429_;

import java.util.Scanner;

public class Exam28 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		do{
			System.out.print("정수를 입력: ");
			num=scan.nextInt();
		}while(num<100 || num>=1000);
		System.out.printf("입력한 값은 %d입니다.\n",num);
		}

	}

