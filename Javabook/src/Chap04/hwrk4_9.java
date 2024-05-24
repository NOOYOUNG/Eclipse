package Chap04;
import java.util.Scanner;
public class hwrk4_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("길이 : ");
		Scanner s=new Scanner(System.in);
		int len=s.nextInt();
		
		for(int i=0; i<len; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<(2*len)-1-(i*2); j++) {
				System.out.print("*");
			}
			System.out.println("");
			
		}

	}

}
