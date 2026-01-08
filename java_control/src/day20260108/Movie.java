package day20260108;

public class Movie  {
	String title;//영화 제목
	String dir; //영화감독
	int limitAge; //관람 연령
	int year; //개봉년도
	
	//생성자 메서드 생략되어있는거임!! 있는거임!!!
	Movie(){
		title = "주토피아2";
		
		
	}
	// 매개 변수가 있는 생성자 메서드
	Movie(String title,int year){
		//오버로딩↑ 메서드는 이름이 같이도 되지만 뒤에 형식이 달라야한다! Movie.movie.title에 귀속
		title = title;
		//Movie title에 귀속
		this.title = title;
		this.year = year;
		// 지역변수, 클래스 변수,매개 변수
	
	}
	
	
	
}
