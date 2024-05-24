package Chap06;

public class ex07_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("Java");
		String s2=new String("Java");
		String s3=s1;
		
		if(s1==s2) System.out.println("s1과 s2는 같다."); //값이 동일한지 여부가 아니라 메모리에서 정확히 동일한 객체를 참조하는지 확인
		else System.out.println("s1과 s2는 같지 않다.");
		
		if(s1==s3) System.out.println("s1과 s3은 같다.");
		else System.out.println("s1과 s3은 같지 않다.");
		
		if(s1.equals(s2)) System.out.println("s1과 s2의 값은 같다.");
		else System.out.println("s1과 s2의 값은 같지 않다.");

	}

}
