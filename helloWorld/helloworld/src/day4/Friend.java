package day4;

public class Friend {
	private String name;
	private String hp;
	private String school;

	// 필요한 메소드 작성

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public Friend() {

	}

	public Friend(String n, String hpp, String sch) {
		super();
		this.name = n;
		this.hp = hpp;
		this.school = sch;
	}
	public void showinfo() {
		System.out.println("이름 " + name + "핸폰" + hp + "학교" + school);
	}

}
