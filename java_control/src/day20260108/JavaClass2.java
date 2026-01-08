package day20260108;

public class JavaClass2 {

	public static void main(String[] args) {
							//()붙어있는것이 메서드!!
							// new Movie() 생성자 메서드 -> 클래스의 정보 초기화시키는 역할
		Movie movie = new Movie();
		System.out.println(movie.title);
		movie.title = "아바타";
		movie.dir = "외국사람";
		movie.limitAge = 12;
		movie.year = 2025;
		
//		System.out.println(movie.title+" "+movie.dir+" "+movie.limitAge+" "+movie.year);
//
//		Movie moive2 = new Movie("굿포츈",2026);
//		
//		System.out.println(moive2.title+' '+moive2.year);
//		
		//Music 클래스와 객체 생성하여
		// 음악제목, 가수, 재생시간(총몇분) 저장되게 하기
		// 매개변수 있는 생성자 메서드로 데이터 저장하고
		//출력
		
//		Music music= new Music("어머님께","god",4);
//		System.out.print(music.musicName);
//		System.out.print("\t"+music.aut);
//		System.out.println("\t"+music.playTime+"분");
//		
//		Music music2 = new Music();
//		music2.aut2 = "gg";
//		music2.aut = "ff";
//		System.out.println(music2.aut2);
//		System.out.println(music2.aut);
//		
		Wildsoul wildsoul = new Wildsoul("꼬리바람","어흥곰",50,4);
		
		System.out.println(wildsoul.tail);
		System.out.println(wildsoul.bear);
		System.out.println(wildsoul.lv);
		System.out.println(wildsoul.sp);
	

		} }
