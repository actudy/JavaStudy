package com.yesjun.ch11;

/*
 *  Queue
 *  	FIFO (First In First Out)
 *  	LILO (Last In Last Out)
 *  	형태의 임시 버퍼
 *  		: 요청 시 가장 먼저 보관한 것을 꺼낸다.
 *
 *  public void offer(Element data)		: 데이터 보관
 *  public Element poll()				: 값을 반환 (추출)
 *  public Element peek()				: 값을 참조 (확인)
 *  public boolean isEmpty()			: 비어있는지 체크
 */

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.offer("카페");
        queue.offer("라떼");
        queue.offer("아리");

        System.out.println(queue.peek());	// 카페
        System.out.println(queue.poll());	// 카페
        System.out.println(queue.poll());	// 라떼

        queue.offer("동구");

        while(queue.isEmpty() == false)
            System.out.println(queue.poll()); // 아리, 동구

        // 현재 큐의 상태 -> 비어있는 상태
        System.out.println(queue.poll()); // null
        System.out.println(queue.peek()); // null
    }
}
