package day6;

public class Add implements Operator {
	private int a;
	private int b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public double calculate() {
		int d = (int)a + (int)b;
		return d;
	}

}
