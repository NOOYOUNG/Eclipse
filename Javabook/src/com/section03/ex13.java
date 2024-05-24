package com.section03;
import java.util.Date;
import java.text.DateFormat;
public class ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date cD=new Date();
		System.out.println("현재 날짜는 "+cD);
		
		String dateToStr=DateFormat.getInstance().format(cD);
		System.out.println("DateFormat.getInstance(): "+dateToStr);
		
		dateToStr=DateFormat.getDateInstance().format(cD); // 낧짜만
		System.out.println("DateFormat.getDateInstance(): "+dateToStr);
		
		dateToStr=DateFormat.getTimeInstance().format(cD); // 시간만
		System.out.println("DateFormat.getTimeInstance(): "+dateToStr);
		
		dateToStr=DateFormat.getDateTimeInstance().format(cD);
		System.out.println("DateFormat.getDateTimeInstance(): "+dateToStr);
		
		dateToStr=DateFormat.getTimeInstance(DateFormat.MEDIUM).format(cD);
		System.out.println("DateFormat.getTimeInstance(DateFormat.MEDIUM): "+dateToStr);
		
		dateToStr=DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(cD);
		System.out.println("DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT: "+dateToStr);
		// DateFormat.LONG을 날짜 형식에 적용하고 DateFormat.SHORT을 시간 형식에 적용

	}

}

// DateFormat.LONG은 긴 형식(예: 2024년 4월 30일), DateFormat.SHORT는 짧은 형식(예: 2024. 4. 30.)을 나타냅니다.
