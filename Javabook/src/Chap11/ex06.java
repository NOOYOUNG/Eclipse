package Chap11;

public class ex06 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("try블록입니다.");
			throw new MyException("My Exception 클래스 호출합니다.");
		}
		catch(MyException e) {
			System.out.println("catch 블록입니다.");
			System.out.println(e);
		}

	}

}
