package helloworld;
import java.util.Scanner;

public class pro_2_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] list = new int[5];
		double sum = 0;
		
		
	
		for(int i=0;i < list.length; i++ ) {
			System.out.println((i+1) + "번째 입력값 ");
			list[i] = sc.nextInt();
			
			sum += list[i];	
		}
		System.out.println("입력하신 숫자의 평균값은 : " +  (sum / 5) + "입니다.");
		sc.close();
	}
 
}
