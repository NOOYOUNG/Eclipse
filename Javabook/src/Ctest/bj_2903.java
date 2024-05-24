package Ctest;

import java.util.Scanner;

public class bj_2903 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		
		int num=2;
		for(int i=0; i<N-1; i++) {
			num=(num+(num-1));
		}
		
		System.out.println(num*num);
		
	}

}
