package com.yesjun.ch12;

class Banana {
	String size;
	public Banana(String size) {
		this.size = size;
	}
	public void info() {
		System.out.println("크기 : " + size);
	}
}
class Apple {
	int sugar;
	public Apple(int sugar) {
		this.sugar = sugar;
	}
	public void info() {
		System.out.println("당도 : " + sugar);
	}
}
// 객체의 데이터 타입에 안전하다.
//	-> 과일 종류별로 모든 클래스를 정의? 비용이 많이 든다.
class BananaBox { Banana banana; }
class AppleBox { Apple apple; }

/*
 *  일반적인 타입 약자
 *  T - DataType (U, ...)
 *  K - Key
 *  V - Value
 *  E - Element
 *  N - Numeric, Number
 */

// Generic(제네릭) 이란?
//	-> 내가 원하는 것으로 제한하겠다라는 개념!
//	-> 박스에는 붙인 스티커에 대한 객체만 담을 수 있도록!
// datatype : 내가 임의로 지은 이름
// Generic Class (제네릭 클래스)
class Box<datatype> {
	// 자료형에 안전하지 않다.
//	Object obj; // 원하지 않는 객체가 담길 수 있다.
	
	private datatype item;
	
	public void store(datatype item) { // Setter
		this.item = item;
	}
	public datatype pullOut() { // Getter
		return item;
	}
}

public class GenericTest {
	public static void main(String[] args) {
		Box<Banana> bBox = new Box<Banana>();
		bBox.store(new Banana("15"));	// 바나나를 생성하여 담은 후,
//		bBox.store(new Apple(5)); // 컴파일 에러!
		Banana banana = bBox.pullOut();	// 상자에서 바나나를 꺼내고,
		banana.info();					// 정보를 확인해라.
		
		Box<Apple> aBox = new Box<Apple>();
		aBox.store(new Apple(10));
		Apple apple = aBox.pullOut();
		apple.info();
	}
}









