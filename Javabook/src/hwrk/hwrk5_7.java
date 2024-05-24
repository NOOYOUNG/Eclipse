package hwrk;

import java.util.Scanner;

public class hwrk5_7 {
	public static void star(int num) {
		for(int i=0; i<num; i++) {
			for(int j=0; j<num-i-1; j++)
				System.out.print(" ");
			for(int j=0; j<(2*i)+1; j++)
				System.out.print("*");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("숫자를 입력하세요: ");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		
		star(num);

	}

}
