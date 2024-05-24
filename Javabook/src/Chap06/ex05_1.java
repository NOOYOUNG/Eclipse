package Chap06;

public class ex05_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Java Programming";
		String s2=new String("Java Programming");
		
		System.out.println(s1);
		System.out.println(s2);
		
		if(s1.equals(s2) || s1==s2) System.out.println("같습니다");
		else System.out.println("다릅니다");

	}

}
