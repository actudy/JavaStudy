package com.yesjun.ch10;

import java.util.Scanner;

public class CalendarVw {
	private Scanner sc = new Scanner(System.in);
	
	private int getInput(String msg) {
		System.out.print(msg);
		int no = sc.nextInt();
		return no;
	}
	
	public void process() {
		int year;
		int month;
		
		CalendarUtil util = new CalendarUtil();
		
		while(true) {
			int command = getInput("항목 선택 (1.특정연도 날짜 보기 2.특정월 날짜 보기 3.종료) : ");
			
			switch(command) {
			case 1:
				year = getInput("연도를 입력 : ");
				util.showDayByYear(year);
				break;
			case 2:
				year = getInput("연도를 입력 : ");
				month = getInput("월을 입력 : ");
				util.showDayByMonth(year, month);
				break;
			case 3:
				System.out.println("프로그램 종료");
				System.exit(0);
				break;
			default:
				System.out.println("잘못 입력하였습니다.");
			}
		}
	} 
}










