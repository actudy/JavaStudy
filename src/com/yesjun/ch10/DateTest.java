package com.yesjun.ch10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * 날짜  관련 클래스
 * 	1. java.util.Date
 * 	2. java.util.Calendar
 * 	3. java.text.SimpleDateFormat
 */

public class DateTest {
	public static void main(String[] args) {
//		Date d = new Date();
//		System.out.println("d : " + d.toString());
		// 현재 시간이 로드!
		
		// Deprecated. 권장하지 않는다.
//		int year = d.getYear() + 1900;
//		int month = d.getMonth() + 1;
//		int date = d.getDate();
//		System.out.println("오늘은 " + year + "년 " + month + "월 " + date + "일");
		
		Calendar c = Calendar.getInstance();
		System.out.println("c : " + c);
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int date = c.get(Calendar.DATE);
		int day = c.get(Calendar.DAY_OF_WEEK); // 1(일) ~ 7(토)
		
		String[] dayArr = { "", "일요일", "월요일", "화요일"
					  , "수요일", "목요일", "금요일", "토요일"};
		System.out.println("오늘은 " + year + "년 " + month + "월 " 
					  + date + "일 " + dayArr[day]);
		
		int lastDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(month + "월의 마지막 날은 " + lastDay + "일 입니다.");
		
		// 2021. 06. 15은 무슨 요일?
		c.set(2021, 6, 15); // month는 0부터!
		day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("2021. 06. 15은 " + dayArr[day]);
		
		// 2021. 11. 22는 무슨 요일?
		c.set(2021, 11, 22);
		day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("2021. 11. 22은 " + dayArr[day]);
		
		String pattern = "yyyy.MM.dd HH:mm:ss (E)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String str = sdf.format(new Date());
		System.out.println("str : " + str);
		
		pattern = "yyyy년 M월";
		sdf = new SimpleDateFormat(pattern);
		str = sdf.format(new Date());
		System.out.println("str : " + str);
		
		str = sdf.format(c.getTime()); // Date형으로 변환!
		System.out.println("str : " + str);
	}
}








