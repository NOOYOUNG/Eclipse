package practice;
import java.util.Scanner;
public class re_prac_4_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요: ");
		int a=s.nextInt();
		System.out.print("사칙연산 기호를 입력하세요: ");
		String op=s.next();
		System.out.print("두번째 숫자를 입력하세요: ");
		int b=s.nextInt();
		
		System.out.println(a+op+b+"="+(a*b));

	}

}

//스위치문을 사용하여 +,-,/,*,%의 경우를 적용
//또는 String 안의 equals 메서드를 사용하여 op 사용