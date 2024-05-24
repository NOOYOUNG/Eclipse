package Chap07_hwrk;

public class hwrk7_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc c=new Calc();
		
		System.out.println("2개 덧셈이 호출됨: "+c.sum(1, 2));
		System.out.println("3개 덧셈이 호출됨: "+c.sum(1, 2, 3));
		System.out.println("4개 덧셈이 호출됨: "+c.sum(1, 2, 3, 4));
		System.out.println("더블형 덧셈이 호출됨: "+c.sum(1.3, 2.4));

	}

}
