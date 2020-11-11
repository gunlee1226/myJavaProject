package helloworld;
import java.util.Scanner;

public class pro1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int num = sc.nextInt();
	
		if (num%2 == 0  && num > 0) {
			System.out.println("짝수입니다!");
		}
		else if (num < 0) {
			System.out.println("음수입니다.");
		}
		else {
			System.out.println("0입니다.");
		}
		sc.close();
	}
}
