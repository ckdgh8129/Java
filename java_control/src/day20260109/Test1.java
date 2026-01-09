package day20260109;

public class Test1 {

	public static void main(String[] args) {

		// 문제1. 각각 알맞은 자료형의 변수로 선언하고 값을 저장한뒤 출력

		String item = "값";
		String name = "홍길동";
		int age = 25;
		double stature = 175.5;
		String gender = "남";
		boolean student = true;

		System.out.println("항목 : " + item);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + stature);
		System.out.println("성별 : " + gender);
		System.out.println("학생여부 : " + student);
		System.out.println("-------------------------");

		// 문제 2. 정수형 변수a와 b가 다음과 값이 선언되어있다
		// a = 10, b=20 임시 변수 (temp)를 사용하여 두 변수의 값을 서로 바꾼뒤 출력

		int a = 10, b = 20;

		int temp = 0;

		temp = a;
		a = b;
		b = temp;

		System.out.println(a + " " + b);
		System.out.println("-------------------- ");

		// 문제 3. 가로가 8 세로 5인 사각형의 넓이 구하기

		int height = 5;
		int weight = 8;

		int extent = height * weight;

		System.out.println(extent);
		System.out.println("--------");

		// 문제4. 다음 3과목 평균 총점 구하기
		// 국어 : 80 영어 : 90 수학 : 78

		int kor = 80;
		int eng = 90;
		int math = 78;

		int total = kor + eng + math;
		int ave = total / 3;

		System.out.println("총점 : " + total + " ->" + " 평균 : " + ave);
		System.out.println("------------------------\n");

		// 문제 5
		// 전체 초 가 3.726초로 주어져 있다 이를 다음과 같이 변환하여 출력하시오.
		// 시 분 초

		int seond = 3726;
		int second = seond;
		int minute = seond / 60;
		int hour = minute / 60;

		minute = minute % 60;
		second = seond % 60;

		System.out.println(hour + "시 " + minute + "분 " + second + "초 ");
		System.out.println("-----------------------\n");

		// 문제 6. 정수형 변수 score에 시험 점수가 저장 되있다
		// 점수가 60점 이상이면 합격 그렇지 않으면 불합격을 출력
		int score = 72;
		int pass = 60;

		if (score >= 60) {
			System.out.println("합격");
		} else
			System.out.println("불합격");
		System.out.println("----------\n");

		// 문제 7. 정수형 변수score가 주어진다
		// 점수에 따라 아래 기준으로 학점을 출력
		// 90이상 a 80이상 b 70이상 c 60이상 d 60미만 f

		int score1 = 100;

		if (score1 >= 90)
			System.out.println("A학점");
		else if (score1 >= 80)
			System.out.println("B학점");
		else if (score1 >= 70)
			System.out.println("C학점");
		else if (score1 >= 60)
			System.out.println("D학점");
		else
			System.out.println("F학점");

		System.out.println("---------\n");

		// 문제 8. 정수형 변수 n 값이 저장되있다 1부터 n까지의 합을 계산해 출력

		int n = 10;
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1부터 " + n + " 까지합산 : " + sum);
		System.out.println("------------\n ");

		// 문제 9. 다음 정수 배열이 주어진다
		// arr = {10,20,30,40,50};
		// 배열의 모든 값의 총합을 구하고 평균을 구하여라 (정수)

		int[] arr = { 10, 20, 30, 40, 50 };
		int sum1 = 0;
		int ave1 = 0;

		for (int num : arr) {
			sum1 += num;
			
		}ave1 = sum1 / arr.length;
		System.out.println("합 : " + sum1);
		System.out.println("평균 : " + ave1);
		System.out.println("------------\n");

		// 문제 10. 다음 정수 배열이 주어진다
		// scores = {87,65,92,100,74};
		// 배열에서 최대값 최소값 찾기
		
		int[] scores = {87,65,92,100,74};
		
		int max=scores[0];
		int min=scores[0];
		
		for(int i=0; i<scores.length;i++) {
			if(max < scores[i])
				max=scores[i];
			if(min > scores[i])
				min = scores[i];		
		}
		System.out.println("최대값 : "+max+" 최솟값 : "+min);
		System.out.println("------------------\n");
		
		//문제11. 다음 정수 배열이 주어진다 
		//int [] nums= {3,8,15,22,7,10};
//		배열을 순회하면서 아래 규칙으로 result를 계산하시오
//		값이 짝수면 result에서 더한다
//		값이 혹수면 result에서 뺀다 마지막 result 값을 구하시오
	
		int[] nums= {3,8,15,22,7,10};
		int result = 0;
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i]%2==0) 
				result+=nums[i];
			else 
				result-=nums[i];
			
			
			
		}
		System.out.println(result);
		
		
	
	}

}
