package com.yesjun.ch10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * ��¥  ���� Ŭ����
 * 	1. java.util.Date
 * 	2. java.util.Calendar
 * 	3. java.text.SimpleDateFormat
 */

public class DateTest {
	public static void main(String[] args) {
//		Date d = new Date();
//		System.out.println("d : " + d.toString());
		// ���� �ð��� �ε�!
		
		// Deprecated. �������� �ʴ´�.
//		int year = d.getYear() + 1900;
//		int month = d.getMonth() + 1;
//		int date = d.getDate();
//		System.out.println("������ " + year + "�� " + month + "�� " + date + "��");
		
		Calendar c = Calendar.getInstance();
		System.out.println("c : " + c);
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int date = c.get(Calendar.DATE);
		int day = c.get(Calendar.DAY_OF_WEEK); // 1(��) ~ 7(��)
		
		String[] dayArr = { "", "�Ͽ���", "������", "ȭ����"
					  , "������", "�����", "�ݿ���", "�����"};
		System.out.println("������ " + year + "�� " + month + "�� " 
					  + date + "�� " + dayArr[day]);
		
		int lastDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(month + "���� ������ ���� " + lastDay + "�� �Դϴ�.");
		
		// 2021. 06. 15�� ���� ����?
		c.set(2021, 6, 15); // month�� 0����!
		day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("2021. 06. 15�� " + dayArr[day]);
		
		// 2021. 11. 22�� ���� ����?
		c.set(2021, 11, 22);
		day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("2021. 11. 22�� " + dayArr[day]);
		
		String pattern = "yyyy.MM.dd HH:mm:ss (E)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String str = sdf.format(new Date());
		System.out.println("str : " + str);
		
		pattern = "yyyy�� M��";
		sdf = new SimpleDateFormat(pattern);
		str = sdf.format(new Date());
		System.out.println("str : " + str);
		
		str = sdf.format(c.getTime()); // Date������ ��ȯ!
		System.out.println("str : " + str);
	}
}








