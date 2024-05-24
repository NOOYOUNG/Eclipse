package Ctest;

import java.util.Scanner;

public class bj_10811 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num=new Scanner(System.in);
		
		int N=num.nextInt();
		int M=num.nextInt();
		
		int temp=0;
		
		int bag[]=new int[N];
		for(int a=0; a<N; a++)
			bag[a]=a+1;
		
		for(int a=0; a<M; a++) {
			int i=num.nextInt()-1;
			int j=num.nextInt()-1;
			
			while(i<j) {
				temp=bag[i];
				bag[i]=bag[j];
				bag[j]=temp;
				i++;
				j--;
				
			}
		}
		
		for(int a=0; a<N; a++) {
			System.out.print(bag[a]+" ");
		}
		
		

	}

}
