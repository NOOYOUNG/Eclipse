package chap03;

import java.util.Scanner;

public class hwrk3_8 {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("정수 입력: ");
		int n= s1.nextInt();
		
		System.out.println("실수 입력: ");
		double db=s1.nextDouble();
		System.out.println("정수값: "+n);
		System.out.println("실수값: "+db);
	}

}
