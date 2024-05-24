package Chap04;

import java.util.Scanner;

public class exa6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		System.out.println("5개의 숫자를 입력하세요.");
		
		for(int i=0; i<5; i++) {
			Scanner s=new Scanner(System.in);
			int num=s.nextInt();
			sum+=num;
		}
		
		System.out.println("합계: "+sum);


	}

}
