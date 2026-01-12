package day20260112;

public class Information {
//이름 아이디 비밀번호 전화번호
	
	private String name; //이름
	private String id; //아이디
	private String password; //비밀번호
	private String number; //전화번호
	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getId() {
//		return id;
//	}
//	public void setId(String id) {
//		this.id = id;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	public String getNumber() {
//		return number;
//	}
//	public void setNumber(String number) {
//		this.number = number;
//	}
	@Override
	public String toString() {
		return "내정보 [이름=" + name + ", 아이디=" + id + ", 비밀번호=" + password + ", 전화번호=" + number + "]";
	}
	public Information(String name, String id, String password, String number) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		this.number = number;
	}
	

	
	
}
