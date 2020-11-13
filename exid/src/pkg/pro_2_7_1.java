package pkg;

import java.util.Random;
import java.util.Scanner;

public class pro_2_7_1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
		
		
		int []elem = {50000 ,10000, 5000, 1000, 500, 100, 50, 10, 5 , 1};
				
		System.out.print("금액 : ");
			
		int money = sc.nextInt(); 
		
		System.out.println("돈" + money);
		
		for ( int i = 0; i < elem.length; i++) {
			System.out.println(elem[i] + "원" + (money / elem[i]));
			money %= elem[i];
			}
		}
}