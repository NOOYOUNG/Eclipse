package practice;

import java.util.Scanner;

public class re_prac41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요: ");
		int num1=s.nextInt();
		System.out.print("두번째 숫자를 입력하세요: ");
		int num2=s.nextInt();
		
		int sum=0;
		
		for(int i=num1; i<=num2; i++) {
			sum+=i;
		}
		
		System.out.println("합계: "+sum);

	}

}
