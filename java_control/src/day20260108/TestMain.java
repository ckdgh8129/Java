package day20260108;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestMain {

	public static void main(String[] args) {
		// 이정도 까지는 해야 된다 - 배열 실습

		// 문제 1. 10개의 무작위 정수 값 지정하기(배열에)
		// 랜덤 범위는 1~50

//		
//		int[] num = new int[10];
//		for (int i=0; i<num.length; i++) {
//			num[i]= ((int)Math.floor(Math.random()*50 ))+1 ;
//		
//		 }
//		for(int n :num)
//			System.out.print(n+" ");
//			
//		System.out.println(Arrays.toString(num));

		// 문제2.
		// int[] score = { 99,66,77,56,78,98,83};
		// 1학년 3반 학생들의 성적을 배열에 저장하였다.
		// 3반 학생들 성적의 평균값을 구하시오
		// 반복문 이용 하여 하세요 반듯이!

//		int[] score = {99,66,77,56,78,98,83};
//		int sum=0;		//성정 총 합을 저장 할 변수
//		int average = 0;
//		for(int i=0;i<score.length;i++) {
//			for(int n : score) {
//				sum+=n;
//				average=sum/score.length;
//				System.out.print(n+" ");}
//		System.out.println("\n"+sum);
//		System.out.println(average);
//			
//	}

		// 문제3. 정수 10개를 저장할수 있는 배열을 선언
		// 1~50의 무작위값 저장 하기
		// 배열의 첫번째 값과 마지막 값 출력

//		int[] num = new int[10];
//		
//		for(int i=0; i<num.length; i++) {
//			num[i] =(int)(Math.random()* 50)+1;
//				System.out.print(" "+num[i]);
//		}
////		if(num[0]%2==0 && num[num.length-1]%2==0)
//			System.out.println(" 처음"+num[0]+" 마지막"+num[num.length-1]);
//		//문제 4. 문제3번의 배열에 저장된 무작위 정수 중 짝수에 해당하는 정수만 출력
//			for(int n:num) {
//				if(n%2==0) {
//					System.out.print(n+" ");
//				}
//				
//			}
		// 문제 5. 마지막
		// int[] temp = {6, 0, 5, -2, 0, 4, 8, 0}
		// tmp 배열은 일별 최고 기온을 저장 한것이다
		// 배열에 저장된 기록중 가장 높은 기록과 가장 낮은 기록을 찾으세요
		// 0 번 인덱스의 기온은 12월 11일 데이터 값이다
		// 가장 높은 기온의 날짜와 가장 낮은 기온의 날짜 도 출력하세요
		// 가장높은 기온, 가장 낮은기온만 찾아서 출력 하는것만 해도 성공!!
		// 힌트 int max=temp[0];
		// 힌트 int min=temp[0];
		//

		int[] temp = { 6, 0, 5, -2, 0, 4, 8, 0 };
		int max = temp[0];
		int min = temp[0];
		for (int i = 0; i < temp.length; i++) {

			if (max < temp[i])
				max = temp[i];
			if (min > temp[i])
				min = temp[i];


		}
		System.out.println("가장높은온도 : " + max+ "도");
		System.out.println("가장낮은온도 : " + min+ "도");
		// 0번 인덱스의 기온은 12월 11일 이다.
		//가장 높은 기온이 몇번째 인덱스에 있는지 찾아야 한다.
		// 
		for(int i=0; i< temp.length; i++) {
			if(temp[i]==max) {
				System.out.println("가장높은기온 : "+max+" 날짜는 : 12월 "+(i+11)+"일");
			}
			
			if(temp[i]==min) {
				System.out.println("가장낮은기온 : "+min+" 날짜는 : 12월 "+(i+11)+"일");
			}
		}
		
		
		int maxDay = Arrays.asList(temp).indexOf(max);
		int minDay = Arrays.asList(temp).indexOf(min);
		System.out.println("가장높은기온 : "+max+" 날짜는 : 12월 "+maxDay+11+"일");
		System.out.println("가장낮은기온 : "+min+" 날짜는 : 12월 "+minDay+11+"일");
				
	}

}
	




