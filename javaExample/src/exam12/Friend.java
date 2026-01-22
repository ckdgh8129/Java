package exam12;

public class Friend {
	String name; //내 이름 (Data)
	Friend next; // 내 뒤에 있는 친구 (Address)
	
	Friend(String name){
		this.name = name;
		this.next = null; // 처음엔 뒤에 아무도 없음
		
		
	}
	
}
