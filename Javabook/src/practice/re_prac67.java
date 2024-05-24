package practice;

public class re_prac67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] n1= {"일","이","삼","사","오","육","칠","팔","구"};
		
		
		for(int i=1; i<=100; i++) {
			if(i<10) {
				System.out.println("일의자리: "+n1[i-1]);
			}
			else if(i<100) {
				if(i%10==0) {
					System.out.println("십의자리: "+n1[(i/10)-1]+"십");
				} 
				else {
					System.out.println("십의자리: "+n1[(i/10)-1]+"십"+n1[(i%10)-1]);
				}
			}
			else {
				System.out.println("==> 100");
			}
			
		}

	}

}
