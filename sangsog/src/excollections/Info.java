package excollections;



public class Info {
	
	
	private String company;
	private String area;
	private String work;

	
	
	

	
	
	public Info(String company, String area, String work) {
		this.company = company;
		this.area = area;
		this.work = work;
	
	}
	public void display() {
		System.out.printf("%s\t %s\t %s\n", company, area, work);
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	
	
	

}
