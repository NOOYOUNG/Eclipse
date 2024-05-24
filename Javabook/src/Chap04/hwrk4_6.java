package Chap04;

import java.util.Scanner;

public class hwrk4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("5개의 숫자를 입력하세요.");
		
		int sum=0;
		for(int i=0; i<5; i++) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		sum+=num;
		}
		
		System.out.println("합계: " + sum);
		

	}

}
