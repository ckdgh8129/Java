package sangsog;

import products.Aircon;
import products.Refrigerator;
import products.Television;

public class MainMethod {

	public static void main(String[] args) {
		
		Television tv = new Television();
		
		tv.power();
		tv.power();
		
		Refrigerator refrigerator = new Refrigerator();
		Aircon air = new Aircon("LG전자",201);
		System.out.println(air);
	}

}



//자바의 상속 
//오버라이딩
//다향성
//추상화
//protected
//final
//instancepf

// 상속 공부 하기 위해 사용 할만한 주제
// 동물에 대한 상속 
// 직원 급여 계산 시스템 - 직원 부모 - 
// 결제 시스템 - 결제 부모 , 카드 결제 ,현금 ,이체 는 자식
// 게임 케릭터 - 캐릭터 부모, 직업들이 자식
// 교통 수단 시스템 - 교통수단 부모, 버스,기차,차 가 자식

