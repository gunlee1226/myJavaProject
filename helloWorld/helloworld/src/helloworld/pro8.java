package helloworld;
import java.util.Scanner;

public class pro8 {

	public static void main(String[] args) {
	System.out.println("값을 입력하시오.");
	Scanner sc = new Scanner(System.in);
	
	
	int a = sc.nextInt();
	
			
			int sum = 0;
			
//			a = 짝수인경우
			if( a %2  == 0) {
				for (int i = 1 ; i <= a ; i++) {
					if(i % 2 == 0) sum += i;	 {									
					}				
				}
			}
//			a = 홀수인경우
			else if( a %2  == 1) {
				for (int i = 1 ; i <= a ; i++) {
					if(i % 2 == 1) sum += i;	 {				
					}
				}
			}
			System.out.println(sum);
		

	}
}

