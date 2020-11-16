package day4;

import java.util.Scanner;

public class FriendApp {
	private static String[] data;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Friend[] friendArray = new Friend[3];

		System.out.println("친구를 3명 등록해 주세요");
		String input1 = sc.nextLine();
		String input2 = sc.nextLine();
		String input3 = sc.nextLine();

		String[] s1 = new String[3];
		s1[0] = input1;
		s1[1] = input2;
		s1[2] = input3;

		
		Friend F = new Friend();
		F.setName(data[0]);
		F.setHp(data[1]);
		F.setSchool(data[2]);

		
		


		for (int i = 0; i < friendArray.length; i++) {
			
			friendArray[i] = F;
			friendArray[i].showinfo();
		}
		// 친구정보 입력받기
		// 입력받은 친구정보를 공백으로 분리
		// Friend 객체 생성하여 데이터 넣기
		// 배열에 추가하기
		// 친구정보 출력

	}
}
