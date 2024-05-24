package hwrk;

import java.util.Scanner;

public class hwrk4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("점수를 입력하세요.");
		
		Scanner s=new Scanner(System.in);
		int grade=s.nextInt();
		
		if(grade>=90) System.out.println("A 학점");
		else if(grade>=80) System.out.println("B 학점");
		else if(grade>=70) System.out.println("C 학점");
		else if(grade>=60) System.out.println("D 학점");
		else System.out.println("F 학점");

	}

}
