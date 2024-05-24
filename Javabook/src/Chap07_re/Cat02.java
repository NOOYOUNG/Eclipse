package Chap07_re;

public class Cat02 {
	String breed;
	String color;
	
	Cat02() {
		System.out.println("Cat() 생성자 호출합니다");
	}
	
	Cat02(String pBreed) {
		System.out.println("Cat(...) 생성자 호출합니다");
		breed=pBreed;
	}
	
	Cat02(String pBreed, String pColor) {
		System.out.println("Cat(..., ...) 생성자 호출합니다");
		breed=pBreed;
		color=pColor;
	}
	
	void eat() {
		System.out.println("먹이를 먹다");
	}
	
	void scratch() {
		System.out.println("발톱으로 할퀴다");
	}
	
	void meow() {
		System.out.println("야옹 하고 울다");
	}

}
