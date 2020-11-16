package day4;

import java.util.Scanner;

public class FriendApp_T {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");

        for (int i = 0; i < friendArray.length; i++) {
            // 친구정보 입력받기
            String line = sc.nextLine();

            // 입력받은 친구정보를 공백으로 분리
            String[] data = line.split(" ");

            // Friend 객체 생성하여 데이터 넣기
            Friend friend = new Friend();
            friend.setName(data[0]);
            friend.setHp(data[1]);
            friend.setSchool(data[2]);

            // 배열에 추가하기
            friendArray[i] = friend;
        }

        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
            friendArray[i].showinfo();
        }

        sc.close();
    }

}
