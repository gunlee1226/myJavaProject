package day6;

public abstract class Bird {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Bird(String name) {
		super();
		this.name = name;
	}
	
	public Bird() {
		
	}

	abstract void sing();
	abstract void fly(); 
	abstract void showName(); 
	

}
