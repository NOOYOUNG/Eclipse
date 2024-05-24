package Chap07_re;

public class ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat02 cat1=new Cat02();
		Cat02 cat2=new Cat02("샴");
		Cat02 cat3=new Cat02("러시안 블루", "회색");
		
		System.out.println("첫번째 고양이 품종: "+cat1.breed+"\t색상: "+cat1.color);
		System.out.println("두번째 고양이 품종: "+cat2.breed+"\t색상: "+cat2.color);
		System.out.println("세번째 고양이 품종: "+cat3.breed+"\t색상: "+cat3.color);
		

	}

}
