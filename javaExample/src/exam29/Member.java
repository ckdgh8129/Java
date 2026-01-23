package exam29;

public class Member {
	
	private String id;
	private String pw;
	private String name;
	private String phone;
	private String address;
	
	
	
	

	@Override
	public String toString() {
		return "Member [아이디=" + id + ", 비밀번호=" + pw + ", 이름=" + name + ", 연락처=" + phone + ", 주소=" + address + "]";
	}

	public Member(String id, String pw, String name, String phone, String address) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	
	public void display() {
		System.out.printf("%s\t %s\t %s\t %s \t%s\n", id, pw, name, phone, address);
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
