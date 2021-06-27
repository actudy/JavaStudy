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
import java.util.Vector;

public class Manager {
    Scanner s = new Scanner(System.in);
    Vector<User> users = new Vector<>();

    public void process() {
        int key = 0;
        while((key = menu()) != 0) { // key가 0이라면 탈출(종료)
            switch(key) {
                case 1: insertUser(); break;
                case 2: deleteUser(); break;
                case 3: selectUser(); break;
                case 4: selectListUser(); break;
            }
        }
    }

    private int menu() {
        System.out.println("[동적배열(Vector) 연습 프로그램] 메뉴를 선택하세요.");
        return getInputNumber("[1]:추가 [2]:삭제 [3]:검색 [4]:목록 [0]:종료");
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
        int num = getInputNumber("추가할 회원 번호를 입력");
        s.nextLine();
        User user = findByNumber(num);
        if(user != null) {
            System.out.println("해당 번호의 회원이 이미 존재합니다.");
            return;
        }
        String name = getInputString("추가할 회원 이름을 입력");
        user = new User(num, name);
        users.add(user);
        System.out.println(user.toString() + " 회원을 추가하였습니다.");
    }

    private void deleteUser() {
        int num = getInputNumber("삭제할 회원 번호를 입력");
        User user = findByNumber(num);
        if(user == null) {
            System.out.println("해당 번호의 회원이 존재하지 않습니다.");
            return;
        }
        users.remove(user);
        System.out.println(user.toString() + " 회원을 삭제하였습니다.");
    }

    private void selectUser() {
        int num = getInputNumber("검색할 회원 번호를 입력");
        User user = findByNumber(num);
        if(user == null) {
            System.out.println("회원 번호가 존재하지 않습니다.");
            return;
        }
        System.out.println("[검색 결과] : " + user.toString());
    }

    private void selectListUser() {
        System.out.println("[전체 회원 목록] (" + users.size() +")");
        if(users.size() == 0) {
            System.out.println("가입 회원이 존재하지 않습니다.");
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
