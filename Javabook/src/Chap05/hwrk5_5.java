package Chap05;

public class hwrk5_5 {
	public static void calculate(int x, double y) {
		System.out.println(2*x*y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4;
		double pi=3.14;
		System.out.println("원의 둘레 구하는 공식 : 2x반지름x원주율");
		
		System.out.print("2x"+a+"x"+pi+"=");
		calculate(a,pi);

	}

}
