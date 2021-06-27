package com.yesjun.ch11.vector;

/*
 * Vector
 * 	: 1.0���� ����
 * 	: ����ȭ (synchronized)
 * 	: ���� �����忡�� ����
 *
 * List
 * 	: 1.2���� ����
 * 	: ����ȭ�� �ʿ��ϴٸ�, sychronizedList�� Ȱ��
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
        return String.format("��ȣ:%d, �̸�:%s", num, name);
    }
}
