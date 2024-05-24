package hwrk;

import java.util.Scanner;

public class hwrk6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grade=new int[5][4];
		Scanner s=new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			System.out.print((i+1)+"번 학생의 국어 점수: ");
			grade[i][0]=s.nextInt();
			System.out.print((i+1)+"번 학생의 영어 점수: ");
			grade[i][1]=s.nextInt();
			System.out.print((i+1)+"번 학생의 수학 점수: ");
			grade[i][2]=s.nextInt();
		}
		
		for(int i=0; i<5; i++) {			
			grade[i][3]=grade[i][0]+grade[i][1]+grade[i][2];
			
			float avg=(float)grade[i][3]/3;
		
			System.out.println((i+1)+"번 학생의 총점: "+grade[i][3]+", "+(i+1)+"번 학생의 평균: "+avg);
		}
		
		
	}

}
