package day6;

public class Sparrow extends Bird {

	public Sparrow(String name) {
		super(name);

		if ("짹짹이".equals(getName())) {
			sing();
			fly();
			showName();
		}
	}

	public Sparrow() {
		super();
	}

	@Override
	void sing() {
		System.out.println("참새(" + super.getName() +") 가 소리내어 웁니다");

	}

	@Override
	void fly() {
		System.out.println("오리(" + super.getName() +") 가 날아 다닙니다.");

	}

	@Override
	void showName() {
		System.out.println("이름은" + super.getName() + "입니다.");

	}

}