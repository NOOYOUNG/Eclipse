package practice;

import java.util.Scanner;

public class re_prac61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score=new int[5];
		
		Scanner s=new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			System.out.print((i+1)+"번 학생의 국어 점수: ");
			score[i]=s.nextInt();
		}
		
		int sum=0;
		for(int i=0; i<5; i++) {
			sum+=score[i];
		}
		
		System.out.println("합계: "+sum);
		
		double avg=(double)sum/5;
		
		System.out.println("평균: "+avg);

	}

}
