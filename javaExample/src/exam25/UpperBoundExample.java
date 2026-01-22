package exam25;

import java.util.List;

public class UpperBoundExample {

	public static double sumOfList(List<? extends Number> list) {
		double s = 0.0;
		for (Number n : list) {
			s += n.doubleValue();
		}
		return s;
	}
}
/*
	<?>
비제한 <?> 모든타입 타입에 무관한 단순 기능
목적 : 타입에 상관없이 공통적인 기능 ( 출력, 크기 확인 등)을 수행할 때 사용

<? extends T>
상한제한  <? extends T> T와 그 자식들 데이터 읽기 전용
목적 : 특정 타입의 자식들을 모두 받아 데이터를 안전하게 읽기 (Read) 위해 사용

<? super T>
하한 제한 <? super T> T와 그 부모들 데이터 쓰기 전용
목적: 특정 타입의 부모들을 받아 데이터를 안전하게 저장 해서 사용

*/