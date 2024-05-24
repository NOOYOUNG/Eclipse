package com.section03;

public class Package04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="www.google.com";
		
		String[] arrStr1;
		arrStr1=str1.split("\\."); // .의 특수성으로 인해 앞에 escape 문자 두개 \\가 필요
		
		for(int i=0; i<arrStr1.length; i++) {
			System.out.println(arrStr1[i]);
		}

	}

}
