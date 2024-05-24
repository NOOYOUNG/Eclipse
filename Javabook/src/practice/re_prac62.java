package practice;

import java.util.Scanner;

public class re_prac62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score=new int[5][3];
		
		Scanner s=new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			System.out.print((i+1)+"번 학생의 국어 점수: ");
			score[i][0]=s.nextInt();
			
			System.out.print((i+1)+"번 학생의 영어 점수: ");
			score[i][1]=s.nextInt();
			
			System.out.print((i+1)+"번 학생의 수학 점수: ");
			score[i][2]=s.nextInt();
		}
		
		int[] sum=new int[5];
		double[] avg=new double[5];
		for(int i=0; i<5; i++) {
			sum[i]=score[i][0]+score[i][1]+score[i][2];
			avg[i]=(double)sum[i]/3;
			System.out.println((i+1)+"번 학생의 총점: "+sum[i]+", "+(i+1)+"번 학생의 평균"+avg[i]);
		}

	}

}
