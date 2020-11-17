package day6;

public class Div implements Operator {
	private int a;
	private int b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	@Override
	public double calculate() {		
		double d = (double)a / (double )b;
		return d;
	}
}
