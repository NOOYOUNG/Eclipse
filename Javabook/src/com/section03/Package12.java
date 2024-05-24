package com.section03;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Package12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
		
		String date=formatter.format(d);
		
		System.out.println("현재 날짜는 "+date);
		
		SimpleDateFormat formatter1=new SimpleDateFormat("dd");
		String day=formatter1.format(d);
		System.out.println("일: "+day);
		
		SimpleDateFormat formatter2=new SimpleDateFormat("MMM");
		String month=formatter2.format(d);
		System.out.println("월: "+month);
		
		SimpleDateFormat formatter3=new SimpleDateFormat("yyyy");
		String year=formatter3.format(d);
		System.out.println("년: "+year);

	}

}
