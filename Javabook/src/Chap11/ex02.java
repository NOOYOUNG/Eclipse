package Chap11;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Integer in=new Integer("abc");
			in.intValue();
		}
		catch(ArithmeticException e) {
			System.out.println("예외 발생 ArithmeticException "+e);
		}
		catch(NumberFormatException e) {
			System.out.println("예외 발생 NumberFormatException "+e);
		}
		System.out.println("try~catch 문의 외부 문장입니다.");

	}

}
