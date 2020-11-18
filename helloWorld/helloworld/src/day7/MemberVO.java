package day7;

public class MemberVO {
	 private int id;
	   private String name;
	   private String email;
	   private String password;
	   private String gender;
	   public int getId() {
	      return id;
	   }
	   public String getName() {
	      return name;
	   }
	   public String getEmail() {
	      return email;
	   }
	   public String getPassworkd() {
	      return password;
	   }
	   @Override
	   public String toString() {
	      return "MemberVo [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", gender="
	            + gender + "]";
	   }
	   /**
	    * @param id
	    * @param name
	    * @param email
	    * @param password
	    * @param gender
	    */
	   public MemberVO(int id, String name, String email, String password, String gender) {
	      super();
	      this.id = id;
	      this.name = name;
	      this.email = email;
	      this.password = password;
	      this.gender = gender;
	   }
	   public MemberVO() {
		// TODO Auto-generated constructor stub
	}
	public String getGender() {
	      return gender;
	   }
	   public void setId(int id) {
	      this.id = id;
	   }
	   public void setName(String name) {
	      this.name = name;
	   }
	   public void setEmail(String email) {
	      this.email = email;
	   }
	   public void setPassworkd(String password) {
	      this.password = password;
	   }
	   public void setGender(String gender) {
	      this.gender = gender;
	   }

	
}
