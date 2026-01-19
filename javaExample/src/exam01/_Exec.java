package exam01;

import java.util.Scanner;

public class _Exec {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String strs=" ";
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("주민번호 : ");
		String ssn = sc.nextLine();
		System.out.print("나이 : ");
		String age = sc.nextLine();
		
		strs =strs+"/"+name+","+ssn+","+age;
//		System.out.println("이름 : " + name + " 주민 번호 :" + ssn + " 나이 : " + age+strs);
	
		System.out.print("이름 : ");
		 name = sc.nextLine();
		System.out.print("주민번호 : ");
		 ssn = sc.nextLine();
		System.out.print("나이 : ");
		 age = sc.nextLine();
		strs = strs+"/"+name+","+ssn+","+age;
		
		System.out.println(strs); // /철수,2525002,12/민수,12345555,25
		strs = strs.substring(1); // 문자열 1번부터 나열하라!!(자르는거)
		System.out.println(strs); // 철수,2525002,12/민수,12345555,25
		
		String[] array = strs.split("/"); // /기준으로 배열을 만들어라 ("철수,2525002,12" ,"민수,12345555,25")
		System.out.println(array[0]); 		// "철수,2525002,12"
		System.out.println(array[1]); 		// "민수,12345555,25"
		
		String imsi= array[0];	//"철수,2525002,12"
		String[] array2= imsi.split(",");	//("철수","2525002","12")
		System.out.println(array2[0]+"\t"+array2[1]+"\t"+array2[2]);
	}

}
/*
 * 입력 : 이름 주민 나이 출력 : 이름 주민 나이
 * 
 * 입력 -> 처리 -> 출력
 */