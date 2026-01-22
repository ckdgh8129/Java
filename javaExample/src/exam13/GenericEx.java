package exam13;

import java.nio.channels.Pipe.SourceChannel;

public class GenericEx {

	public static void main(String[] args) {
		Box<String> stringBox = new Box<>();
		stringBox.set("Hello Java");
		String str = stringBox.get();
		System.out.println("str: "+str);
		
		Box<Integer> intBox = new Box<>();
		intBox.set(123);
		int value = intBox.get();
		System.out.println("value : "+value);
		
		stringBox.set("123");
		
		
	}

}
/*
	>>>자주 사용하는 제너릭 기호 (관례)
	이 기호들은 규칙은 아니지만 전 세계 개발자들의 '약속'
	
	<T>: Type (일반적인 타입)
	<E>: Element (리스트 같은 컬랙션의 요소)
	<K>: Key (맵의 키)
	<V>: Value (맵의 값)






*/