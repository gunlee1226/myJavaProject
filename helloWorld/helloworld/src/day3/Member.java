package day3;

public class Member {
	private String Id;
	private String name;
	private int point;
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public Member(String id, String name, int point) {
		super();
		Id = id;
		this.name = name;
		this.point = point;
	}
	public void MView ( ) {
		System.out.println(" 회원 Id : " + this.getId() + " \n 회원 이름 : "+ this.getName() + "\n 포인트 : "+this.getPoint());
	}
	
}
