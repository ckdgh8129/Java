package excollections;

public class Worker {
	
	private String name = "홍길동";
	private String affiliation = "LG"; 
	private String age = "31";
	private String phone = "010-1111-1111";
	private String work ="사무직";
	private String preferredLocation ="대전";
	private String desiredPosition = "사무직" ;
	
	 public void display() {
	        System.out.printf("[%s] %s | %s | %s | %s\n", affiliation, name, work, preferredLocation, desiredPosition);
	 }
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAffiliation() {
		return affiliation;
	}


	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getWork() {
		return work;
	}


	public void setWork(String work) {
		this.work = work;
	}


	public String getPreferredLocation() {
		return preferredLocation;
	}


	public void setPreferredLocation(String preferredLocation) {
		this.preferredLocation = preferredLocation;
	}


	public String getDesiredPosition() {
		return desiredPosition;
	}


	public void setDesiredPosition(String desiredPosition) {
		this.desiredPosition = desiredPosition;
	}


	public Worker(String name, String affiliation, String age, String phone, String work, String preferredLocation,
			String desiredPosition) {
		
		this.name = name;
		this.affiliation = affiliation;
		this.age = age;
		this.phone = phone;
		this.work = work;
		this.preferredLocation = preferredLocation;
		this.desiredPosition = desiredPosition;
	}
	
}
