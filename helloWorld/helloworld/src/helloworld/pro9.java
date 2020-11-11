package helloworld;
import java.util.Scanner;

public class pro9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("임의의 숫자를 입력하세요");
		int input = 0;
		int rNumber = 0;
		rNumber = (int) (Math.random() * 100) + 1;
	
		while(true) {
			String inp = "";
			input = sc.nextInt();
			if (input > rNumber) {
				System.out.println("더 낮게");
			} else if (input < rNumber) {
				System.out.println("더 높게");
			} else {
				System.out.println("정답입니다.");
				System.out.println("정답은" + rNumber);
				System.out.println("프로그램을 종료하시겠습니까? [Y/Anykey]");
				
				inp = sc.next();
				if(inp.equals("y") || inp.equals("Y")) {
					System.out.println("종료합니다");
					break;
				}
				else {
					
					continue;
				}
				
			}
			
		}
		System.out.println();
		sc.close();	
	}

}
