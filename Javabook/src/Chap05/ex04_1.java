package Chap05;

public class ex04_1 {
	
	public static void sum() {
		int sum=0;
		for(int i=1; i<=10; i++)
			sum+=i;
		
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("1부터 10까지의 합계: ");
		sum();

	}

}
