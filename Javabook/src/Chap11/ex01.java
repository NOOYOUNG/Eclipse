package Chap11;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=0;
			int b=5/a;
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나눕니다.");
		}
		catch(Exception e) {
			System.out.println("그 밖의 예외 상황");
			//System.out.println(e);
			//e.printStackTrace();
		}
		
		System.out.println("try~catch문의 외부 문장입니다.");

	}

}
