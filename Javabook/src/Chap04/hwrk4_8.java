package Chap04;
import java.util.Scanner;
public class hwrk4_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("10보다 큰 숫자를 입력하세요.");
		
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		
		int sum=0;
		do {
			sum+=x;
			x--;
		}while(x>=10);
		
		System.out.println("합계 : "+sum);

	}

}
