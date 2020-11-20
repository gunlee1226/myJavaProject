package day8;

import java.util.List;
import java.util.Scanner;

public class AccountMain {

	public static List<AccountVO> AList;
	public static AccountDAO dao = new AccountDAO();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;

		boolean tf = true;

		AccountVO vo = new AccountVO();
		while (tf) {

			System.out.println("");
			System.out.println("---------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 |4.날짜조회 | 5.종료");
			System.out.println("---------------------------------------");
			System.out.print("선택>");
			int sel = sc.nextInt();

			switch (sel) {
			case 1:
				System.out.print("예금액>");
				input = sc.nextInt();
				vo.setDeposit(input);
				dao.depositAccount(vo);
				printAccount();
				break;

			case 2:
				System.out.print("출금액>");
				input = sc.nextInt();
				vo.setWithdraw(input);
				dao.withdrawAccount(vo);
				printAccount();
				break;
			case 3:

				System.out.print("잔고액>");
				System.out.println(dao.getBalance());
				break;

			case 4:
				System.out.println("기간조회");
				input = sc.nextInt();
				vo.setTr_date(Integer.toString(input));

				
				System.out.println(dao.fordate(vo.getTr_date()));
				break;
				
			case 5:
				System.out.println("*****프로그램을 종료합니다.*****");
				tf = false;
				break;

			default:
				System.out.println("다시입력해주세요");
				break;
			}

		}

	}

	public static void printAccount() {
		System.out.println("*****통장 거래내역 출력 (시작)  *****");

		// 출력코드작성
		List<AccountVO> AList = dao.getListAll();
		for (AccountVO mvo : AList) {
			System.out.println(mvo);
		}

		System.out.println("*****통장 거래내역 출력 (끝)  *****");
	}

}
