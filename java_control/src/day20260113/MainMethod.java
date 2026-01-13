package day20260113;

import java.util.Arrays;

public class MainMethod {

	public static void main(String[] args) {
		
//		int[] a =new int[5];
//		a[0] = 20;
//		a[2] = 50;
//		
//		User[] users= new User[5];
////		users[0].setName("이순신"); 
//////				||		이런거랑 같다...
////		User u;
////		u.setName("이성계");
//		//User 클래스 객체 생성
//		users[0] = new User("감자머리","0909","짱구","01055555555");
//		
//		System.out.println(users[0].getName());
		
		User[] users = {
				new User("감자머리","0909","짱구","01055555555"),
				new User("마마보이","7979","철수","010124551213"),
				new User("배신자","5252","훈이","01055489988"),
				new User("이중인격","5959","유리","0115548889"),
				new User("돌맹이","1919","맹구","010091919887")
				
		};

		UserService us= new UserService();
		us.findid(users);
		us.reset(users);
		us.login(users);
		System.out.println(Arrays.toString(users));
		
	}

}
