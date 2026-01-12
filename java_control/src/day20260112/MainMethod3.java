package day20260112;

public class MainMethod3 {

	public static void main(String[] args) {
		
		Vending orange = new Vending("환타 오렌지맛", 1100, 2); 
		Vending apple = new Vending("아침사과",1500, 3);
		
		System.out.println(orange);
		System.out.println(apple);
		System.out.println();
		
		orange.myMoney(1100);
		System.out.println(orange);
		System.out.println(apple);
		System.out.println();
		apple.myMoney(2000);
		System.out.println(orange);
		System.out.println(apple);
		System.out.println();
		
		apple.number();
		orange.number();
		System.out.println(orange);
		System.out.println(apple);
		
		orange.add(4);
		System.out.println(orange);
		apple.add(2);
		System.out.println(apple);
	}

}
