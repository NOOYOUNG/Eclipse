package Chap08_re;

public class Polymorphism01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculateSquare myArea=new CalculateSquare();
		System.out.println("가로:10, 세로:5 사각형의 넓이는 "+myArea.square(10,5));
		System.out.println("가로:2.5, 세로:4.5 사각형의 넓이는 "+myArea.square(2.5,4.5));

	}

}
