package Chap08;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Babycat catObj=new Babycat();
		System.out.println("품종: "+catObj.breed);
		System.out.println("색상: "+catObj.color);
		
		catObj.eat();
		catObj.meow();

	}

}
