package Ctest;

import java.util.Scanner;

public class bj2720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		int[] Testcase=new int[T];
		
		for(int i=0; i<T; i++) {
			Testcase[i]=s.nextInt();
		}
		
		int Q=25, D=10, N=5, P=1;
		
		int Q_cnt=0, D_cnt=0, N_cnt=0, P_cnt=0;
				
		for(int i=0; i<T; i++) {
			Q_cnt=Testcase[i]/Q;
			D_cnt=(Testcase[i]%Q)/D;
			N_cnt=((Testcase[i]%Q)%D)/N;
			P_cnt=(Testcase[i]%N)/P;
			
			System.out.println(Q_cnt+" "+D_cnt+" "+N_cnt+" "+P_cnt);
		}
		
	}
}
