package excollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
	static List<Info> list = new ArrayList<>();
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		while(true) {
			System.out.print("1:매칭, 2:회사조회, 3:정보수정, 4:종료");
			String user = sc.nextLine();
			
			if(user.equals("1")) {
				System.out.println("찾는 이름 입력 : ");
				String company = sc.nextLine();
			for(int i=0; i<list.size(); i++ ) {
				if(list.get(i).getCompany().equals(company)) {
					System.out.println(list.get(i).toString());
					break;
				}else System.out.println("입력하신 이름 없습니다.");
			}
					
				
				
		}else if(user.equals("2")) {
			for(int i=0; i<list.size(); i++ ) {
				list.get(i).display();
				}
		}else if(user.equals("3")) {
			System.out.println("수정할 회사 이름 입력: ");
			String company = sc.nextLine();
			
			for(int i=0; i<list.size(); i++ ) {
				if(list.get(i).getCompany().equals(company)) {
					System.out.println("기존정보 : ");
					list.get(i).display();
					System.out.println("--------------------");
					 list.get(i).setArea(newArea);
			         list.get(i).setWork(newWork);
			         System.out.println("수정이 완료되었습니다.");
			         break;
				}else {
					System.out.println("없는 회사입니다");
				}
			}
			
			
			
			
		}else if(user.equals("5")){
			
			System.out.print("신규 이름 : ");
			String company = sc.nextLine();
			System.out.print("소속 : ");
			String area = sc.nextLine();
			System.out.print("나이 : ");
			String work = sc.nextLine();
			
			
			Info info = new Info(company,area,work);
			list.add(info);
		}else{
			System.out.println("<<<시스템 종료>>>");
			break;
		}
	}

	}
}