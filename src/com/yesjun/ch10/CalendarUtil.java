package com.yesjun.ch10;

import java.util.Calendar;

public class CalendarUtil {
	public void showDayByYear(int year) {
		for(int month = 1; month <= 12; month++) {
			showDayByMonth(year, month);
		}
	}
	
	public void showDayByMonth(int year, int month) {
		Calendar c = Calendar.getInstance();
		
		c.set(year, month - 1, 1);
		
		int lastDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		int week = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(year + "�� " + month + "��");
		showDay(lastDay, week);
	}
	
	private void showDay(int lastDay, int week) {
		System.out.println("--------------------------");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		System.out.println("--------------------------");
		
		int lineCnt = 0;
		for(int i = 1; i < week; i++) {
			System.out.print("\t");
			lineCnt++;
		}
		for(int day = 1; day <= lastDay; day++) {
			System.out.print(day + "\t");
			if(++lineCnt % 7 == 0)
				System.out.println("");
		}
		System.out.println("");
		System.out.println("--------------------------");
	}
}














