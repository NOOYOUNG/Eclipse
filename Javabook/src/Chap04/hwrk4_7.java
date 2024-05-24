package Chap04;

import java.util.Scanner;

public class hwrk4_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int choice=1;
		Scanner s=new Scanner(System.in);
		
		while(choice==1) {
	    System.out.println("숫자를 입력하세요.");	
		int num=s.nextInt();
		
		if(num%2==0) System.out.println("짝수입니다.");
		else System.out.println("홀수입니다.");
		
		System.out.println("계속하고 싶다면 예 1, 그만하고 싶다면 아니오 0을 입력하세요.");
		choice=s.nextInt();
		}
		
		System.out.println("모든 숫자를 확인합니다.");

	}

}
