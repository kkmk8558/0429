package p0429_;
//최솟값 비교
import java.util.Scanner;

public class Exam22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b,c;
		System.out.print("정수a: ");
		a = scan.nextInt();
		System.out.print("정수b: ");
		b = scan.nextInt();
		System.out.print("정수c: ");
		c = scan.nextInt();
		
		if(a<b || a<c){
			System.out.printf("최솟값은 %d입니다.",a);
		}else if(b<a || b<c) {
			System.out.printf("최솟값은 %d입니다.",b);
		}else if(c<a || c<b) {
			System.out.printf("최솟값은 %d입니다.",c);
		}

	}

}
