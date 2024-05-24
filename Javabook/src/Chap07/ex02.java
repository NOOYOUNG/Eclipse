package Chap07;

public class ex02 {

	static void myMethod1() {
		System.out.println("정적 메서드 호출");
	}
	public void myMethod2() {
		System.out.println("인스턴스 메서드 호출");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myMethod1();
		//myMethod2();
		ex02 myObj=new ex02();
		myObj.myMethod2();

	}

}
