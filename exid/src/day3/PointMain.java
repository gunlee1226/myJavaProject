package day3;

import java.util.Random;

public class PointMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random Rnum = new Random();
		Point P = new Point();
			
		
		P.X = Rnum.nextInt(45);
		P.Y = Rnum.nextInt(45);
	
		
		P.draw();
		P.draw();
		
		P.draw(P.X , P.Y);
		P.draw(P.X , P.Y);
		
	}

}