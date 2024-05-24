package hwrk;

import java.util.Scanner;

public class hwrk4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int choice=1;
		
		while(choice==1) {
		System.out.println("숫자를 입력하세요.");
		int num=s.nextInt();
		
		switch(num%2) {
		case 0:
			System.out.println("짝수입니다.");
			break;
		default:
			System.out.println("홀수입니다");
			break;
		}
		
		System.out.println("계속하고 싶다면 예 1, 그만하고 싶다면 아니오 0을 입력하세요.");
		choice=s.nextInt();
		}
		
		System.out.println("모든 숫자를 확인했습니다.");
		

	}

}
