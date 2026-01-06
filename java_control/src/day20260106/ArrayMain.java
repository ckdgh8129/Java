package day20260106;

public class ArrayMain {

	public static void main(String[] args) {
		
//		int[] arr = new int[5]; //<<--참조 변수 : 메모리주소를 지정할수 있는 변수이다.
//[0][1][2][3][4]  배열의 인덱스는 0부터 시작이다.
//		System.out.println(arr);
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 55;
//		arr[3] = 11;
//		arr[4] = 99;
//		System.out.println(arr[4]);
//		
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		for(int num : arr ) {
//			if(num >50)
//				System.out.println(num);
//		}
//		
//		int[] arr2 = {10,20,30};
//		
		String a = "good";
		String aa = new String("member"); //new 사용하면 다 *참조변수 : .을 사용해 다른것을 참조할수있다 
		int b ;
		System.out.println(aa+"   "+a);
		String word = "I like banana";
		System.out.println(word);
		System.out.println(word.charAt(4));
		System.out.println(word.indexOf('b'));
		System.out.println(word.substring(2));
		
		String name = "이순신-김유신-김춘추-이성계-박문수-박팽년";
		System.out.println(name);
		String[] names = name.split("-");
		// String[] names = {"이순신","김유신","김춘추","이성계","박문수","박팽년"}; 이거랑 같다
		
		
		System.out.println(names[2]);
		//문자열도 배열이기때문에 인덱스가 있다 따라서 위와 같이 단어 하나만 뽑을수있다.
		
		//반복문으로 이름을 전부 출력하세요 (한줄에 하나씩)
		for (String n : names) {
//			if(n.charAt(0) == '김')
//		 	if(n.indexOf('신')!=-1)
			if(n.substring(1)=="유")
			System.out.println(n);
		}
		
		String[] fruits = {"사과","딸기","배","수박","바나나","복숭아","파인애플","아보카도","오렌지","감","한라봉","망고"};
				//문제 1. fruits 배열에서 과일이름이 3자 이상인것만 출력하세요 (length())
//				for (String fruit : fruits) {
//					if(fruit.length()>=3)
//						System.out.println(fruit);
				//}
		//문제 2. fruits 배열에서 딸기와 수박은 제외하고 출력하시오
				for(String fruit : fruits) {
//					if(fruit.indexOf('딸')==-1 && fruit.indexOf('수')==-1)
//						System.out.println(fruit);
//				}
					if(!fruit.equals("딸기") && !fruit.equals("수박"))
						System.out.println(fruit);
				}
				System.out.println("\n\n\n");
		//문제 3. 과일을 한줄에 4개씩 세줄로 출력할 것이다 
				for(int i=0; i<fruits.length; i++) {
						if(i%4==0) //4의배수 4 8 12 
							System.out.println();
					System.out.print(fruits[i]+",");
				}
				//규칙을 찾는게 우선!!
				
				
				
				
//		char c='a';
//		char[] temp = new char[5];
//		
//		temp[0] = 'g'; temp[1] = 'o'; temp[2]='o'; temp[3]='d';
//		System.out.println(temp);
//		
		
	}

}



/*
  배열- 동일한 데이터타입의 데이터 저장공간이 연속적으로 나열되어있는 구조
  
 









*/