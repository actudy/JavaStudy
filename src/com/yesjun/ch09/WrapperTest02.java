package com.yesjun.ch09;

public class WrapperTest02 {
	public static void main(String[] args) {
		int i = Integer.parseInt("12345");
		// parseInt(...) : 해당 데이터 타입으로 변환 (파싱)
		System.out.println(i);
		
		Integer i2 = Integer.parseInt("12345");
		String s = String.valueOf(i2);
		double d = Double.parseDouble("3.14");
		
		System.out.println(i2);
		System.out.println(s);
		System.out.println(d);
		
		// A:10, B:11, ... , F:15
		int num = Character.getNumericValue('A');
		System.out.println(num);
		
		// "f"를 16진수 숫자로 표현
		int i3 = Integer.parseInt("f", 16);
//		int i3 = Integer.parseInt("f", 12);
		// NumberFormatException 발생!
		System.out.println(i3);
		
		// 15를 2진수 문자열로 반환
		String s2 = Integer.toBinaryString(15);
		System.out.println(s2);
		
		// 비트 단위 1의 개수
		int bitCount = Integer.bitCount(15);
		System.out.println(bitCount);
		
		// 255의 16진수 표현
		String hexStr = Integer.toHexString(255);
		System.out.println(hexStr);
	}
}













