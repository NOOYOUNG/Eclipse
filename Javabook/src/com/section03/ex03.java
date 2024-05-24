package com.section03;
import Chap08.Cat;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat1=new Cat();
		Cat cat2=new Cat();
		
		System.out.println(cat1.toString());
		System.out.println(cat2.toString());
		System.out.println(cat1.equals(cat2));
		cat1=cat2;
		System.out.println(cat1.equals(cat2));
	}

}
