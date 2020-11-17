package day6;

public class Sub implements Operator {
	private int a;
	private int b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public double calculate() {
		int d = this.a - this.b;
		return d;
	}


}
