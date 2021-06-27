package com.yesjun.ch11;

/*
 *  Set 주요 메소드
 *  	add			: 데이터 입력
 *  	remove		: 특정 데이터 삭제
 *  	clear		: 모든 데이터 삭제
 *  	size		: 집합 객체의 크기 반환
 *  	contains	: 특정 요소의 존재 여부
 *  	isEmpty		: 비어있는지
 *  	toArray		: 배열로 반환
 *  	iterator	: 반복자
 *
 *  Set에서 모든 요소를 출력하는 3가지
 *  	- foreach
 *  	- iterator
 *  	- toArray
 */

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        // #성공적 #우울 와 같은 해시태그라는 것을 사용한다!
        //	-> 해시(Hash)는 해당 데이터를 빠르게 찾기위해 활용하는 개념!
        Set<String> set = new HashSet<>();

        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");

        // 1. 중복을 허용하지 않는다.
        System.out.println("입력 여부 : " + set.add("two"));
        System.out.println("입력 여부 : " + set.add("six"));

        // 2. 저장 순서가 없다.
        // foreach 순회
        for(String s : set)
            System.out.print(s + " ");
        System.out.println("");

        set = new TreeSet<String>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");

        // iterator 순회
        // 사전식 정렬
        Iterator<String> ite = set.iterator();
        while(ite.hasNext())
            System.out.print(ite.next() + " ");
        System.out.println("");

        // toArray 순회
        Object[] obj = set.toArray();
        System.out.println(Arrays.toString(obj));

        // String[] 타입으로 강제 형변환해도 예외 발생!
        //	-> ClassCastException
//		String[] strArr = (String[])set.toArray();
//		System.out.println(Arrays.toString(strArr));
    }
}
