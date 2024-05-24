package Chap09;

public class Abs01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1=new Circle("빨간색", 2.2); //Circle 생성자 호출
		Shape s2=new Rectangle("노란색", 2, 4); //Rectangle 생성자 호출
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());

	}

}
