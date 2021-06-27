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
import java.util.Vector;

public class Manager {
    Scanner s = new Scanner(System.in);
    Vector<User> users = new Vector<>();

    public void process() {
        int key = 0;
        while((key = menu()) != 0) { // key�� 0�̶�� Ż��(����)
            switch(key) {
                case 1: insertUser(); break;
                case 2: deleteUser(); break;
                case 3: selectUser(); break;
                case 4: selectListUser(); break;
            }
        }
    }

    private int menu() {
        System.out.println("[�����迭(Vector) ���� ���α׷�] �޴��� �����ϼ���.");
        return getInputNumber("[1]:�߰� [2]:���� [3]:�˻� [4]:��� [0]:����");
    }

    private int getInputNumber(String msg) {
        System.out.println(msg);
        return s.nextInt();
    }

    private String getInputString(String msg) {
        System.out.println(msg);
        return s.nextLine();
    }

    private void insertUser() {
        int num = getInputNumber("�߰��� ȸ�� ��ȣ�� �Է�");
        s.nextLine();
        User user = findByNumber(num);
        if(user != null) {
            System.out.println("�ش� ��ȣ�� ȸ���� �̹� �����մϴ�.");
            return;
        }
        String name = getInputString("�߰��� ȸ�� �̸��� �Է�");
        user = new User(num, name);
        users.add(user);
        System.out.println(user.toString() + " ȸ���� �߰��Ͽ����ϴ�.");
    }

    private void deleteUser() {
        int num = getInputNumber("������ ȸ�� ��ȣ�� �Է�");
        User user = findByNumber(num);
        if(user == null) {
            System.out.println("�ش� ��ȣ�� ȸ���� �������� �ʽ��ϴ�.");
            return;
        }
        users.remove(user);
        System.out.println(user.toString() + " ȸ���� �����Ͽ����ϴ�.");
    }

    private void selectUser() {
        int num = getInputNumber("�˻��� ȸ�� ��ȣ�� �Է�");
        User user = findByNumber(num);
        if(user == null) {
            System.out.println("ȸ�� ��ȣ�� �������� �ʽ��ϴ�.");
            return;
        }
        System.out.println("[�˻� ���] : " + user.toString());
    }

    private void selectListUser() {
        System.out.println("[��ü ȸ�� ���] (" + users.size() +")");
        if(users.size() == 0) {
            System.out.println("���� ȸ���� �������� �ʽ��ϴ�.");
            return;
        }
        for(User user : users) {
            System.out.println(user.toString());
        }
    }

    private User findByNumber(int num) {
        for(User user : users) {
            if(user.getNum() == num) {
                return user;
            }
        }
        return null;
    }
}
