package day3;

import java.util.Random;

public class drawMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random Rnum = new Random();
		Point P = new Point();
			
		
		P.X = Rnum.nextInt(45);
		P.Y = Rnum.nextInt(45);
		
		
		P.draw();
		System.out.println();
		
	}

}
