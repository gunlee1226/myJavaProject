package helloworld;

public class pro_2_4 {

	public static void main(String[] args) {

		int sum = 0;
		int count = 0;
		
		int[] data = new int[] { 1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 31, 33 };

		
		System.out.print("주어진 배열에서 3의 배수의 개수 =>");

		for (int i = 0; i < data.length; i++) {


			if (data[i] % 3 == 0) {
				sum += data[i];
				count ++;
			}
		}	
		System.out.println(count);
		System.out.println("3의 배수의 합 =>" + sum);
	}

}
