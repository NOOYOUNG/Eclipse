package Chap06;

public class ex06_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java Programming";
		String s1="Java";
		String s2=" Programming";
		String s3=s1.concat(s2);
		String s4=s.trim();
		String s5=s1+s2;
		
		System.out.println("s3 "+s3);
		System.out.println("s4 "+s4);
		System.out.println("s3.equals(s4) "+s3.equals(s4));
		System.out.println("s5 "+s5);

	}

}
