package practice;

import java.util.Scanner;

public class re_prac_57 {
	
	public static void star(int x) {
		for(int i=0; i<x; i++) {
			for(int j=0; j<x-i-1; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<(2*i)+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요: ");
		int num=s.nextInt();
		
		star(num);
		

	}

}
