package com.bs.practice.leap.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class LeapController {
	
	// 윤년 체크
	public boolean isLeapYear(int year) {
		if(year % 4 == 0 && !(year % 100 == 0)) {
			return true;
		} return false;
	}
	
	// 1년 1월 1일 부터 오늘까지의 총 날 수를 계산
	public long leapDate(Calendar c) {
		LocalDate clerk = LocalDate.of(1, 1, 1);
		
		long today = ChronoUnit.DAYS.between(clerk,LocalDateTime.now());
		
		for(int i=clerk.getYear(); i<=c.get(Calendar.YEAR); i++) {
			if(i % 4 == 0 && !(i % 100 == 0)) {
				today++;
			}
		}
		
		return today;
	}
}
