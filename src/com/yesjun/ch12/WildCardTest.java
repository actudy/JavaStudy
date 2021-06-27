package com.yesjun.ch12;

class Animal {
	public void eat() { }
}
class Cat extends Animal {
	@Override
	public void eat() {
		System.out.println("냥냥냥~");
	}
}
class Dog extends Animal {
	@Override
	public void eat() {
		System.out.println("와구와구!");
	}
}

class House<datatype> {
	datatype animal;
	public void store(datatype animal) { // Setter
		this.animal = animal;
	}
	public datatype pullOut() { // Getter
		return animal;
	}
}

// WildCard (와일드 카드) : 무엇이 들어올지 모르지만, 모두 받아주는 개념!
//	-> 보통 ? 를 활용하여 표현
public class WildCardTest {
	// Animal을 포함하고, 상속받는 모든 자식을 스티커로 붙이겠다. (Animal, Cat, Dog)
//	public static void open(House<? extends Animal> house) {
//		Animal animal = house.pullOut();
//		animal.eat();
//	}
	
	// Cat을 포함하고, 상속하는 부모를 스티커로 붙이겠다. (Cat, Animal)
	public static void open(House<? super Cat> house) {
		Animal animal = (Animal)house.pullOut();
		animal.eat();
	}
	public static void main(String[] args) {
		House<Animal> h = new House<Animal>();
		House<Cat> c = new House<Cat>();
		House<Dog> d = new House<Dog>();
		h.store(new Cat());
		h.store(new Dog());
		
		c.store(new Cat());
		d.store(new Dog());
//		d.store(new Cat()); // 컴파일 에러!
		
		open(h);
		open(c);
//		open(d);
	}
}












