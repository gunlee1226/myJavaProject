package day5;

public class PersonMain   {

	public static void main(String[] args) {
		Person p1 = new Person ("정우성", 45);
		Student s1 = new Student ("서울고등학교" );
		Student s2 = new Student ("정우성", 45 , "서울고등학교");

		
		p1.showInfo();
		s1.showInfo();
		s2.showInfo();
	}
	

}
