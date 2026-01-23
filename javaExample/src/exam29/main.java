package exam29;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exam28.ProductDTO;

public class main {

	public static void main(String[] args) {

		List<Member> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("(회원관리) 1.목록, 2.상세보기, 3.등록, 4.수정, 5.삭제, 0.종료 : ");
			String user = sc.nextLine();
			
			if(user.equals("0")) {
				System.out.println("===프로그램 종료===");
				break;
								
				}else if (user.equals("1")) {
				for(int i=0; i<list.size(); i++ ) {
					list.get(i).display();
				}
			}else if (user.equals("2")) {
					System.out.println("찾는 아이디 입력 : ");
					String id = sc.nextLine();
				for(int i=0; i<list.size(); i++ ) {
					if(list.get(i).getId().equals(id)) {
						System.out.println(list.get(i).toString());
						break;
					}else System.out.println("입력하신 아이디가 없습니다.");break;
				}
				
				
				
			}else if (user.equals("3")) {
				System.out.print("신규 아이디 : ");
				String id = sc.nextLine();
				System.out.print("비밀번호 : ");
				String pw = sc.nextLine();
				System.out.print("이름 : ");
				String name = sc.nextLine();
				System.out.print("전화번호 : ");
				String phone = sc.nextLine();
				System.out.print("주소(대전,서울,충남) : ");
				String address = sc.nextLine();
					
				
				Member member = new Member(id,pw,name,phone,address);
				list.add(member);
				
				
			}else if (user.equals("4")) {
				System.out.print("내용 수정할 닉네임 입력 : ");
				String id = sc.nextLine();
			for(int i=0; i<list.size(); i++ ) {
				if(list.get(i).getId().equals(id)) {
					System.out.println(list.get(i).toString());
					break;
				}else System.out.println("입력하신 아이디가 없습니다.");break;
				
			}
			
			}else if (user.equals("5")) {
				System.out.print("삭제할 닉네임 입력 : ");
			}else {
				System.out.println("없는선택지입니다. 다시 입력해주세요");
			}
				
		}

	}

}
