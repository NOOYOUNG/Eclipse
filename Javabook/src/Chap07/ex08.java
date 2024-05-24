package Chap07;

public class ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat1=new Cat();
		Cat cat2=new Cat("샴");
		Cat cat3=new Cat("러시안블루", "회색");
		System.out.println("첫번째 고양이 품종: "+cat1.breed+"\t색상: "+cat1.color);
		System.out.println("두번째 고양이 품종: "+cat2.breed+"\t색상: "+cat2.color);
		System.out.println("세번째 고양이 품종: "+cat3.breed+"\t색상: "+cat3.color);

	}

}
