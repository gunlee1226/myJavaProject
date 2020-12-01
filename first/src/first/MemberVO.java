package first;

public class MemberVO {
	private String Mem_id;
	private String Mem_name;
	private String Mem_pwd;
	
	
	
	public MemberVO(String mem_id, String mem_name, String mem_pwd) {
		super();
		Mem_id = mem_id;
		Mem_name = mem_name;
		Mem_pwd = mem_pwd;
	}
	public String getMem_id() {
		return Mem_id;
	}
	public void setMem_id(String mem_id) {
		Mem_id = mem_id;
	}
	public String getMem_name() {
		return Mem_name;
	}
	public void setMem_name(String mem_name) {
		Mem_name = mem_name;
	}
	public String getMem_pwd() {
		return Mem_pwd;
	}
	public void setMem_pwd(String mem_pwd) {
		Mem_pwd = mem_pwd;
	}
}
