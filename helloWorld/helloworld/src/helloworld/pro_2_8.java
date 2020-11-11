package helloworld;
import java.util.Random;
import java.util.Scanner;

public class pro_2_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Random lotto = new Random();
		String input;
		int[] num = new int[6];	
		System.out.print("시작하려면 아무키나 누르세용!");
		input = sc.nextLine();

		while (true) {

			for (int i = 0; i < num.length; i++) {

				num[i] = ((lotto.nextInt(45)) + 1);

				for (int j = 0; j < i; j++) {
					if (num[i] == num[j]) {
						i--;
					}
				}
			}
			for (int i = 0; i < num.length; i++) {
				System.out.print(num[i] + " ");
			}
			System.out.println("종료하려면 n/N키를 누르시오");
			 input = sc.nextLine();
			if (input.equals("n")||input.equals("N")) {
				System.out.println("종료합니다.");
				break;
			}

		}

	}

}
