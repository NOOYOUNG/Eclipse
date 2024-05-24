package Chap05;

public class ex03_1 {
	
	public static int max(int x, int y) {
		int result;
		if(x>y) result=x;
		else result=y;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5, b=6;
		int num=max(a,b);
		System.out.println(a+"(와)과 "+b+"의 수 중 "+num+"이 큽니다.");

	}

}
