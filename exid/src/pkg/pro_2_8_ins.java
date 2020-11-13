package pkg;

import java.util.Random;
import java.util.Scanner;

public class pro_2_8_ins {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Random lotto = new Random();
		int[] num = new int[6];

		String input;
		System.out.println("시작! 아무키나 입력하세요");
		input = sc.nextLine();
		while (true) {
			for (int i = 0; i < num.length; i++) {

				num[i] = (lotto.nextInt(45) + 1);

				for (int j = 0; j < i; j++) {
					if (num[i] == num[j]) {
						i--;
						break;
					}
				}
			}
			for (int i = 0; i < num.length; i++) {
				System.out.print(num[i] + " ");
			}
			System.out.println("종료하려면 n/N키를 누르시오");
			input = sc.nextLine();
			if (input.equals("n") || input.equals("N")) {
				System.out.println("종료합니다");
			break;
			}
		}

	}

}
