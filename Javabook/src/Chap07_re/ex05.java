package Chap07_re;

public class ex05 {

	static void myMethod1() {
		System.out.println("정적 메서드 호출");
	}
	public void myMethod2() {
		System.out.println("인스턴스 메서드 호출");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myMethod1(); // 정적 메서드는 객체 없이 사용 (static)
		//myMethod2();
		
		//ex05 myObj=new ex05();
		//myObj.myMethod1();
		
		ex05 myObj=new ex05();
		myObj.myMethod2(); // 인스턴스 메서드는 객체 필요 (public)

	}

}
