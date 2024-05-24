package hwrk;

import java.util.Scanner;

public class hwrk5_5 {
	public static void Loop() {
		Scanner s=new Scanner(System.in);
		
		while(true) {
		System.out.println("숫자를 입력하세요.");
		int x=s.nextInt();
		
		if(x%2==0) System.out.println("짝수입니다.");
		else System.out.println("홀수입니다.");
		
		System.out.println("계속하고 싶으면 예 1, 그만하고 싶다면 아니요 0을 입력하세요.");		
		int y=s.nextInt();
		if(y==1) continue;
		else if(y==0) {
			System.out.println("프로그램을 종료합니다.");
			break;
		}
		else {
			System.out.println("잘못 입력하였습니다. 다시 입력하세요.");
			y=s.nextInt();
		}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loop();

	}

}
