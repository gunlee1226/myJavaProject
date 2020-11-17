package day6;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Div div = new Div();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Add add = new Add();
		
		Scanner sc = new Scanner(System.in);
		

		while (true) {
			String text = sc.nextLine();

			if (text.equals("Q") || text.equals("q")) {
				break;
			} else {
				String[] array = text.split(" ");


				if (array[1].equals("+")) {
					add.setValue(Integer.parseInt(array[0], 10), Integer.parseInt(array[2], 10));
					System.out.println(add.calculate());
				} else if (array[1].equals("-")) {
					sub.setValue(Integer.parseInt(array[0], 10), Integer.parseInt(array[2], 10));
					System.out.println(sub.calculate());
				} else if (array[1].equals("*")) {
					mul.setValue(Integer.parseInt(array[0], 10), Integer.parseInt(array[2], 10));
					System.out.println(mul.calculate());
				} else if (array[1].equals("/")) {
					div.setValue(Integer.parseInt(array[0], 10), Integer.parseInt(array[2], 10));
				
					System.out.println(div.calculate());
				} else {
					System.out.println("잘못된 입력입니다.");
				}
			}
			
			
			
		}

//		sub.setValue(a, b);
//		add.setValue(a, b);
//		mul.setValue(a, b);
//		div.setValue(a, b); 
//    	

//    	add.calculate();
//    	sub.calculate();
//    	mul.calculate();
//    	div.calculate();
//    
	}
}
