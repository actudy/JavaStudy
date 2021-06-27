package com.yesjun.ch11.vector;

/*
 * Vector
 * 	: 1.0부터 제공
 * 	: 동기화 (synchronized)
 * 	: 단일 쓰레드에서 단점
 *
 * List
 * 	: 1.2부터 제공
 * 	: 동기화가 필요하다면, sychronizedList를 활용
 */

import java.util.Scanner;

public class User {
    private int num;
    String name;
    public User(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        return String.format("번호:%d, 이름:%s", num, name);
    }
}
