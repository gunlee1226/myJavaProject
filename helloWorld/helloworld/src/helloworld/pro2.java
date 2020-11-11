package helloworld;
import java.util.Scanner;

public class pro2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.java 2.C 3.C++ 4.Python");
		System.out.print("선택 : ");
		int num = sc.nextInt();
		
		if(num <=4) {
		switch(num) {
		case 1: System.out.println("R101호입니다.");
		break;
		case 2: System.out.println("R202호입니다.");
		break;
		case 3: System.out.println("R303호입니다.");
		break;
		case 4: System.out.println("R404호입니다.");
		break;
		default:
			break;
		}
		sc.close();
		}
		else {
		System.out.println("상담원에게 문의하세요");	
		}

	}
}
