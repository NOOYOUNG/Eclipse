package Chap11;

public class Exception03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30};
		
		try {
			for(int i=0; i<=3; i++) {
				System.out.println("arr["+i+"] : "+arr[i]);
			}
		}
		catch(Exception e) {
			System.out.println("예외 처리입니다..."); //arr[3]
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("예외 발생 여부와 상관없이 실행됩니다.");
		}

	}

}
