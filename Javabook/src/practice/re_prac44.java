package practice;

public class re_prac44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*********\t*********\t*********");
		System.out.println("구구단 1단\t\t구구단 4단\t\t구구단 7단");
		System.out.println("*********\t*********\t*********");
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j+=3) {
				System.out.print(j+" * "+i+" = "+(i*j)+"\t");
			}
			System.out.println();
		}
		
		System.out.println("*********\t*********\t*********");
		System.out.println("구구단 2단\t\t구구단 5단\t\t구구단 8단");
		System.out.println("*********\t*********\t*********");
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j+=3) {
				System.out.print(j+" * "+i+" = "+(i*j)+"\t");
			}
			System.out.println();
		}
		
		System.out.println("*********\t*********\t*********");
		System.out.println("구구단 3단\t\t구구단 6단\t\t구구단 9단");
		System.out.println("*********\t*********\t*********");
		for(int i=1; i<=9; i++) {
			for(int j=3; j<=9; j+=3) {
				System.out.print(j+" * "+i+" = "+(i*j)+"\t");
			}
			System.out.println();
		}

	}

}
