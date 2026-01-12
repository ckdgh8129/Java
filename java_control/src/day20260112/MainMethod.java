package day20260112;

public class MainMethod {

	public static void main(String[] args) {
	
		Student student = new Student();
		
		student.name = "짱구";
		student.age = "5";
//		student.tall = 50;     -private 접근 제어자
	
		System.out.println(student);
		
		Student student2 = new Student("철수","5",50);
		System.out.println(student2);
		
	}

}
