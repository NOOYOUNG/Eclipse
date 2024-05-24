package Chap04;

import java.util.Scanner;

public class hwrk4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("3개의 숫자를 입력하세요.");
		
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		
		if(a>b) {
			if(a>c) System.out.println(a+"는 가장 큰 정수입니다.");
			else System.out.println(a+"는 가장 큰 정수가 아닙니다.");
		}
		else System.out.println(a+"는 가장 큰 정수가 아닙니다.");

	}

}
