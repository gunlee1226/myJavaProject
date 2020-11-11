package helloworld;
import java.util.Scanner;

public class pro3 {

	public static void main(String[] args) {
		int i = 0, count = 0;
		while (true) {
			i++;
				if (i%6 == 0 && i%14 ==0 ) {
					count++;
					System.out.println(count + "=>" + i);
					if(count==10)
						break;
				}			
			}			
		}		
}
