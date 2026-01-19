package exam04;

public class Student {
	String name;
	int score;
	
	 Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	@Override
	public String toString() {
		return name + ", score=" + score + ")";
	}
	
	
}
