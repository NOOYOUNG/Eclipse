package com.section03;

import java.util.Calendar;

public class Package09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar obj1=Calendar.getInstance();
		Calendar obj2=Calendar.getInstance();
		
		obj2.add(Calendar.YEAR, 10); // obj2에 10년 추가
		
		System.out.println("obj1: "+obj1.getTime());
		System.out.println("obj2: "+obj2.getTime());
		
		int comp=obj1.compareTo(obj2);
		
		System.out.println("obj1.compareTp(obj2): "+comp);

	}

}

// compareTo() 메서드는 두 Calendar 객체의 날짜와 시간을 비교하며, 그 결과를 정수로 반환
// 동일한 시간이면 0, 첫 번째 시간이 두 번째 시간보다 이전이면 음수, 첫 번째 시간이 두 번째 시간보다 이후이면 양수를 반환
