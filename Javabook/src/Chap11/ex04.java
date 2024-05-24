package Chap11;

public class ex04 {

	static void check() throws ArithmeticException{ // 오류나면 ArithmeticException로 던져짐
		System.out.println("내부 메서드");
		int div=5/0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			check();
		}
		catch(ArithmeticException e) {
			System.out.println("예외 발생 "+e);
		}
		

	}

}
