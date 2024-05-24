package Chap05;

public class ex06_1 {
	public static int sum(int x, int y) {
		return x+y;
	}
	
	public static double sum(int x, int y, int z) {
		return x+y+z;
	}
	
	public static double sum(double x, double y) {
		return x+y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("sum(10,20)의 값: "+sum(10,20));
		System.out.println("sum(10,20,30)의 값: "+sum(10,20,30));
		System.out.println("sum(10.5,20.5)의 값: "+sum(10.5, 20.5));

	}

}
