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
		System.out.print("Á¡ [X= " + this.X + ", Y="+ this.Y +"]À» ±×·ÈÀ¾´Ï´Ù.");
	}
	}