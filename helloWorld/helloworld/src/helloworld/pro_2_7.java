package helloworld;
import java.util.Scanner;

public class pro_2_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		
		int []money = new int[1]; 
		
		System.out.print("금액 : ");
			
		money[0] = sc.nextInt(); 
		
		
		
		System.out.println("50.000원권 " + (money[0]/50000) + " 장");
		
		System.out.println("10.000원 " + ((money[0]%50000) / 10000 ) + " 장");
		System.out.println("5.000원 " + (((money[0]%50000) % 10000 ) / 5000) + " 장");
		System.out.println("1.000원 " + ((((money[0]%50000) % 10000 ) % 5000) / 1000)+ " 장");
		System.out.println("500원 " + (((((money[0]%50000) % 10000 ) % 5000) % 1000)/500)+ " 장");
		System.out.println("100원 " + ((((((money[0]%50000) % 10000 ) % 5000) % 1000)%500)/100) + " 장");
		System.out.println("50원 " + (((((((money[0]%50000) % 10000 ) % 5000) % 1000)%500)%100)/50) + " 장");
		System.out.println("10원 " + ((((((((money[0]%50000) % 10000 ) % 5000) % 1000)%500)%100)%50)/10) + " 장");
		System.out.println("5원 " + (((((((((money[0]%50000) % 10000 ) % 5000) % 1000)%500)%100)%50)%10)/5) + " 장");
		System.out.println("1원 " + ((((((((((money[0]%50000) % 10000 ) % 5000) % 1000)%500)%100)%50)%10)%5)/1) + " 장");
		
	}
 
}
