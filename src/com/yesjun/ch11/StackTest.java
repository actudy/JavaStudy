package com.yesjun.ch11;

/*
 *  Stack Class
 *  	LIFO (Last In First Out)
 *  	FILO (First In Last Out)
 *  	형태의 임시 버퍼
 *  		: 버퍼에 임시로 데이터를 저장하였다가 필요할 때 꺼내 사용.
 *  		: 요청 시 가장 최근에 보관한 데이터부터 꺼낸다.
 *
 *  public void push(Element data)		: 순차 보관
 *  public Element pop()				: 값을 반환 (추출)
 *  public Element peek()				: 값을 참조 (확인)
 *  public boolean empty(), isEmpty()	: 비어있는지 체크
 *  public int search(Element data)		: 특정 데이터 위치
 */

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
//		Stack<Integer> stack = new Stack<Integer>();
//		Stack stack = new Stack();
        Stack<Integer> stack = new Stack<>();

        stack.push(3); // 3
        stack.push(5); // 3, 5
        stack.push(7); // 3, 5, 7
        System.out.println(stack.pop()); // 7
        System.out.println(stack.pop()); // 5

        stack.push(9);
        stack.push(11);
        System.out.println(stack.peek());	// 11
        System.out.println(stack.pop());	// 11

        // 현재 스택의 상태 : 3, 9
        System.out.println(stack.search(3)); // 2번째
        System.out.println(stack.search(9)); // 1번째

        while(!stack.isEmpty()/* == false*/)
            System.out.println(stack.pop());

        // 현재 스택의 상태 -> 비어있는 상태
        System.out.println(stack.pop());
        // EmptyStackException 발생!
    }
}
