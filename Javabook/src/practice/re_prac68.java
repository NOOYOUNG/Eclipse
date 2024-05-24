package practice;

public class re_prac68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] n1= {"영","일","이","삼","사","오","육","칠","팔","구"};
		String[] n2= {"십","백","천","만","억"};
		int[] num= {1,0,0,1,0,3,4,5,6,7};
		
		System.out.print("==> ");
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]);
		}
		System.out.println("["+num.length+"자리]");
		
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+"["+n1[(num[i]%10)]+"]");
		}
		
		

	}

}
