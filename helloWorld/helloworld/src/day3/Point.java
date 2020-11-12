package day3;



public class Point {
	
	
	public int X  ;
	public int Y  ;
	public int getX() {
		return X;
	}
	public void setX(int x) {
		X = x;
	}
	public int getY() {
		return Y;
	}
	public void setY(int y) {
		Y = y;
	}
	
	public void draw() {
		System.out.print("점 [X= " + this.X + ", Y="+ this.Y +"]을 그렸읍니다.");
	}
	}
