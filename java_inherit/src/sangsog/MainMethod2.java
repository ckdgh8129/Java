package sangsog;

import animals.Bird;
import animals.Cat;
import animals.Dog;
import animals.Rabbit;
import common.Animal;

public class MainMethod2 {

	public static void main(String[] args) {
		
		Animal[] animals = {
				new Dog("토리","리트리버"),
				new Cat("도라에몽"),
				new Rabbit("돌돌이"),
				new Bird("새대갈")
		};
		
		for( Animal a : animals) {
			a.sound();
			a.sleep();
			if( a instanceof Dog)
			((Dog)a).getBreed();
			System.out.println();
		}
		
//		((Dog) animals[0]).getBreed();
//		
//		Dog d = new Dog("a","b");
//				Animal aa= d;
	}

}

//bird 클래스를 만드시오
// 짹짹 소리를 나게 하시오
