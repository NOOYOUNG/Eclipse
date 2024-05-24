package practice;

import java.util.Scanner;

public class prac4_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.print("첫 번째 숫자를 입력하세요: ");
		int num1=s.nextInt();
		System.out.print("사칙연산 기호를 입력하세요: ");
		String op=s.next();
		System.out.print("두 번째 숫자를 입력하세요: ");
		int num2=s.nextInt();
		
		System.out.println(num1+op+num2+"="+(num1*num2));

	}

}
