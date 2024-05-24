package Chap07_re;

public class ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat02 cat1=new Cat02("페르시안");
		Cat02 cat2=new Cat02("샴");
		Cat02 cat3=new Cat02();
		cat3.breed="러시안 블루";
		System.out.println("첫번째 고양이: "+cat1.breed);
		System.out.println("두번째 고양이: "+cat2.breed);
		System.out.println("세번째 고양이: "+cat3.breed);

	}

}
