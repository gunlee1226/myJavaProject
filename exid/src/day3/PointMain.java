package day3;

import java.util.ArrayList;
import java.util.Random;

public class PointMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Random rnum = new Random();
		Point p = new Point();
		

		p.X = rnum.nextInt(45);
		p.Y = rnum.nextInt(45);
		p.draw();
		p.draw(p.X , p.Y);
	
		p.X = rnum.nextInt(45);
		p.Y = rnum.nextInt(45);
		p.draw();
		p.draw(p.X , p.Y);
		
	}

}