package helloworld;
import java.util.Scanner;

public class pro10 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in); 
	      int sel = 0;
	      int money = 0;
	      int total = 0;
	      
	      
	      while(true) {
	         
	         System.out.println("================================");
	         System.out.println("1.입금하기  2.출금하기  3.잔액조회  4.종료하기");
	         System.out.println("================================");
	         System.out.print("입력 :");
	         sel = sc.nextInt();
	      
	      if(sel == 1) {
	         System.out.print("입금 금액:");
	         money = sc.nextInt();
	         total += money;
	         System.out.println("입금하신 금액은" + money + "원," + "잔액은" + total +"원 입니다.");
	      }
	      else if(sel ==2) {
	         System.out.print("출금 금액:");
	         money = sc.nextInt();
	         if(money <= total) {
	         total -= money;
	         System.out.println("출금하신 금액은" + money + "원, 잔액은" + total + "원 입니다.");
	         }
	         else if (money > total) {
	            System.out.println("출금불가! 현재 계좌 잔액은" + total + "원 입니다.");
	         }
	      }
	      else if (sel == 3) {
	         System.out.println("잔액은 " + total + "원 입니다.");
	      }
	      else if (sel == 4) {
	         System.out.println("프로그램을 종료합니다.");
	         break;
	      }
	      else {
	         System.out.println("잘못입력하셨습니다");
	         sc.close();
	      }

	      }
	   }

	}


