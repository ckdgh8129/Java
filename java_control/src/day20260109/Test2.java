package day20260109;

public class Test2 {

	public static void main(String[] args) {
		// 문제1. 학원 관리 시스템에서 월별 매출 데이터를 배열로 관리중
		// int[] monthlySales = {1200, 950,
		// 1430,800,1600,1700,900,1100,1550,1800,1300,2000};
		// 1월~12월 순서, 단위: 만원)

		int[] monthlySales = { 1200, 950, 1430, 800, 1600, 1700, 900, 1100, 1550, 1800, 1300, 2000 };
		int add = 0;
		int ave = 0;
		int max = monthlySales[0];
		int min = monthlySales[0];
		int score = 0;
		
		for(int i=0;i<monthlySales.length;i++) {
			
			add+=monthlySales[i];
			
			if(max<monthlySales[i])
				max=monthlySales[i];
			if(min>monthlySales[i])
				min=monthlySales[i];
			else if(ave<=score) {
				
				score++;
				
			}
		
		}
		
		ave=add/monthlySales.length;
			System.out.println("년 총 매출 : "+add+"만원");
			System.out.println("월 평균 매출 : "+ave+"만원");
			System.out.println("월 최고 매출 : "+max+"만원");
			System.out.println("월 최저 매출 : "+min+"만원");
			System.out.println("월 평균이상인 월 개수 : "+score+"개");
			System.out.println("\n----------------\n");
			
			
			
			//문제2 훈련생 출결 정보 숫자 코드를 배열로 관리중
			//코드    의미
			// 1	 출석
			// 2	 지각
			// 3	 결석
			int[] attendance = {1,1,2,1,3,1,2,3,1,1,1,2,3,3,1};
			

			
			
			
			
			
	}

}
