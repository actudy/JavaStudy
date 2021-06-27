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
			int command = getInput("�׸� ���� (1.Ư������ ��¥ ���� 2.Ư���� ��¥ ���� 3.����) : ");
			
			switch(command) {
			case 1:
				year = getInput("������ �Է� : ");
				util.showDayByYear(year);
				break;
			case 2:
				year = getInput("������ �Է� : ");
				month = getInput("���� �Է� : ");
				util.showDayByMonth(year, month);
				break;
			case 3:
				System.out.println("���α׷� ����");
				System.exit(0);
				break;
			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
			}
		}
	} 
}










