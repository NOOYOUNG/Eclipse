package Chap04;

import java.util.Scanner;

public class hwrk4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("숫자를 입력하세요.");
		
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		
		if(num%2==0) System.out.println(num+"은 짝수입니다.");
		else System.out.println(num+"은 홀수입니다.");
		
		System.out.println("이 문장은 if문 외부에 있습니다.");

	}

}
