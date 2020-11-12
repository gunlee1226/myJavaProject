package day3;

public class Point {

	public int X;
	public int Y;

	
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
		System.out.println("좌표 [" + this.X +"."+this.Y+"] 입력합니다");
	
	}
	public void draw(int X, int Y) {
	
		System.out.println("좌표 [" + this.X +"."+this.Y+"] 삭제합니다");
	}
	
	
}
