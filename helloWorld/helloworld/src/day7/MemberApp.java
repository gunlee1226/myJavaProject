package day7;

import java.util.List;
import java.util.Scanner;

public class MemberApp {

	public static void main(String[] args) {
		printAuthors();

	}

	private static void printAuthors() {
		MemberDAO dao = new MemberDAO();
		List<MemberVO> list = dao.getList();

		System.out.println("===== 회원 목록(start) =====");
		for (MemberVO memberVO : list) {
			System.out.println(memberVO);
		}
		System.out.println("===== 회원 목록(end) =====");
	}

}
