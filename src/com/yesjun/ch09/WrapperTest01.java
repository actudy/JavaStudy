package com.yesjun.ch09;

import java.math.BigDecimal;

public class WrapperTest01 {
	public static void main(String[] args) {
		/*
		 *  Wrapper Class
		 *  Integer
		 *  Double
		 *  ...
		 *  	-> 기본 데이터 타입을 객체로 사용하고 싶을 때!
		 *  
		 *  int
		 *  double
		 *  ...
		 *  	-> 기본 데이터 타입이지 객체가 아니다!
		 *  
		 *  Boxing		: 기본 데이터 타입을 객체로
		 *  UnBoxing	: 객체를 기본 데이터 타입으로
		 */
		Integer iVal = new Integer(10);
		// int형 리터럴 상수 10을 Interger 클래스의 인자로 전달!
		//	-> 예전의 Swap 예제에서 본 Value 클래스를 생각!
		// int형 상수 10을 Interger로 Boxing
		System.out.println(iVal);
		
		double dNum = 3.14; // 기본 데이터 타입
		Double dVal = new Double(dNum);
		// doube형 변수 dNum을 Double로 Boxing
		System.out.println(dVal);
		
		double subNum = dVal.doubleValue(); // UnBoxing
		System.out.println(subNum);
		
		Integer num1 = 10; // 리터럴 상수 10이 클래스 타입 Integer로 대입!
		Integer num2 = 20; // Auto-Boxing : 자동으로 객체 타입으로 감싼다.
		num1++; // 1. Auto-UnBoxing -> 2. Auto-Boxing
		num2++; // num1 = new Integer(num1.intValue() + 1);
		// num1.intValue()	: UnBoxing
		// new Integer(...)	: Boxing
		System.out.println(num1);
		System.out.println(num2);
		
		// 실수는 오차가 존재
		double d1 = 1.6;
		double d2 = 0.1;
		System.out.println(d1 + d2); // 1.7000000000000002
		
		// 기본 데이터 타입은 오차가있다?
		//	-> 오차가 없도록 문자열 형태로!
		BigDecimal e1 = new BigDecimal("1.6");
		BigDecimal e2 = new BigDecimal("0.1");
		System.out.println(e1.add(e2));
		
		BigDecimal e3 = new BigDecimal(1.6);
		BigDecimal e4 = new BigDecimal(0.1);
		System.out.println(e3.add(e4));
		
		@SuppressWarnings("unused")
		BigDecimal e5 = new BigDecimal("1.6.1");
		// 실수 형식이 아닌 이상한 형식을 전달하면,
		//	-> NumberFormatException 발생!
	}
}











