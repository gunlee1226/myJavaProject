package helloworld;
import java.util.Scanner;

public class pro_2_6 {

	public static void main(String[] args) {
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l' };

		
		for(int j : c) {
			System.out.println(c);
			break;
		}
		
		for (int i = 0; i < c.length; i++) {
			
			System.out.print(c[i]);	
			if (c[i] == ' ') {
				System.out.print(c[i] = ',');
				
			}
		
		
		}
	}

}
