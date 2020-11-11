package helloworld;
import java.util.Scanner;

public class pro4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num > 90) {
			System.out.println("A등급");
	}
		else if( num > 80 && num < 89) {
			System.out.println("B등급");
}
		else if( num > 70 && num < 79) {
			System.out.println("C등급");
}
		else if( num > 60 && num < 69) {
			System.out.println("D등급");
}
		else {
			System.out.println("낙제");
		}
		sc.close();
}
}