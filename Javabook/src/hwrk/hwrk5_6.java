package hwrk;

import java.util.Scanner;

public class hwrk5_6 {
	public static int max(int a, int b, int c) {
		int result;
		if(a>b && a>c) result=a;
		else if(b>a && b>c) result=b;
		else result=c;
		
		return result;
	}
	public static int min(int a, int b, int c) {
		int result;
		if(a>b && b>c) result=c;
		else if(a>c && c>b) result=b;
		else result=a;
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("3개의 숫자를 입력하세요.");
		Scanner s=new Scanner(System.in);
		
		int x=s.nextInt();
		int y=s.nextInt();
		int z=s.nextInt();
		
		int max_v=max(x,y,z);
		int min_v=min(x,y,z);

		System.out.println(max_v+"는 가장 큰 정수입니다.");
		System.out.println(min_v+"는 가장 작은 정수입니다.");
	}

}
