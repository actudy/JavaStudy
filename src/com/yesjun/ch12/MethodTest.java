package com.yesjun.ch12;

class AAA {
	@Override
	public String toString() { return "Class AAA"; }
}
class BBB {
	@Override
	public String toString() { return "Class BBB"; }
}

class InstInfo {
	// Generic Method (제네릭 메소드)
	public <T> void info(T inst) {
		System.out.println(inst);
		// inst -> inst.toString()
	}
	
	// 2개 이상의 인자를 제네릭 타입으로 정의
	public <T, U> void info(T inst1, U inst2) {
		System.out.println(inst1);
		System.out.println(inst2);
	}
}

public class MethodTest {
	public static void main(String[] args) {
		AAA a = new AAA();
		BBB b = new BBB();
		
		InstInfo i = new InstInfo();
		i.info(a);
		i.info(b);
		// info() 메소드의 인자로 어떤 객체가 전달될지 모른다.
		
		// 제네릭 메소드를 활용해, 전달되는 인자를 제한(설정, 스티커)
		i.<AAA>info(a);
		i.<BBB>info(b);
//		i.<AAA>info(b); // 컴파일 에러!
		// AAA 스티커를 붙이고 BBB 타입의 인자 전달
		
		i.<AAA, BBB>info(a, b);
//		i.<AAA, BBB>info(b, a); // 인자의 위치, 컴파일 에러!
	}
}









