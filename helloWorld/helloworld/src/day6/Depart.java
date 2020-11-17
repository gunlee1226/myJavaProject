package day6;

public class Depart extends Employee {
		
	    private String dep;
    
	 
	 public Depart(String name, int salary, String dep) {
	      	super(name, salary);
	        this.dep = dep;
	 }
	    public void getInformation() {
	        System.out.println("이름:" + super.getName() + "  연봉:" + super.getSalary() + "만원  부서 :" + dep);
	    }


}
