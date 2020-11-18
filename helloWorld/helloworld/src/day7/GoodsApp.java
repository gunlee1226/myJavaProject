package day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import day6.Friend;

public class GoodsApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Goods> list = new ArrayList<Goods>();
		System.out.println("상품 세 가지를 등록해주시오.");
		int count = 0;

		for (int i = 0; i < 3; i++) {
			Goods go = new Goods();
			String Line = sc.nextLine(); // cola 1000 10

			String[] data = Line.split(" ");

			int re = Integer.parseInt(data[1]);
			int re1 = Integer.parseInt(data[2]);

			go.setName(data[0]);
			go.setPrice(re);

			go.setCount(re1);
			
			
			list.add(go);

		}

		sc.close();
		for (int i = 0; i < list.size(); i++) {

			
			list.get(i).showInfo();
		}
		for (int i = 0; i < list.size(); i ++) {
			count = count + list.get(i).getCount();
					System.out.println(count);
		}

	}

}
