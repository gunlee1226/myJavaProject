package helloworld;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class pro_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input;
		System.out.println("시작하려면 아무키나 누르시오.");
		input = sc.next();

		if (input != " ") {

			while (true) {

				Random rNumber = new Random();

				System.out.println("이번주 로또 예상 번호");

				for (int i = 0; i <= 5; i++) {

					System.out.print(" " + (rNumber.nextInt(45) + 1));

				}
				input = sc.next();

			}

		}
	}

}
