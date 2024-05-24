package practice;

public class re_prac_4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int n=1;
		int m=10;
		
		while(true) { // Java에서 while 문 안의 조건식은 boolean 값을 요구
			for(int i=0; i<m; i++) System.out.print(" ");
			for(int i=0; i<n; i++) System.out.print("*");
			System.out.println("");
			
			m=m-1;
			n=n+2;
			if(m<0) break;
			
		}
		*/
		
		for(int i=0; i<=10; i++) {
			for(int j=0; j<10-i; j++)
				System.out.print(" ");
			for(int j=0; j<(2*i)+1; j++)
				System.out.print("*");
			System.out.println();
		}
		

	}

}
