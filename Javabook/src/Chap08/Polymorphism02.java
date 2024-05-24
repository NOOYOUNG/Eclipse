package Chap08;

public class Polymorphism02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal myanimal=new Animal();
		Animal mypig=new Pig();
		Animal mydog=new Dog();
		
		myanimal.animalSound();
		mypig.animalSound();
		mydog.animalSound();
		

	}

}
