package practice;

public class re_prac_4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		
		System.out.println("******************************************");
		System.out.println("구구단 1단\t\t구구단 2단\t\t구구단 3단");
		System.out.println("******************************************");
		
		for(i=1; i<=9; i++) {
			for(j=1; j<=3; j++)
				System.out.print(j+" * "+i+" = "+(j*i)+"\t");
			System.out.println("");
		}
		System.out.println("");
		
		System.out.println("******************************************");
		System.out.println("구구단 4단\t\t구구단 5단\t\t구구단 6단");
		System.out.println("******************************************");		
		
		for(i=1; i<=9; i++) {
			for(j=4; j<=6; j++)
				System.out.print(j+" * "+i+" = "+(j*i)+"\t");
			System.out.println("");
		}
		System.out.println("");
		
		System.out.println("******************************************");
		System.out.println("구구단 7단\t\t구구단 8단\t\t구구단 9단");
		System.out.println("******************************************");				

		for(i=1; i<=9; i++) {
			for(j=7; j<=9; j++)
				System.out.print(j+" * "+i+" = "+(j*i)+"\t");
			System.out.println("");
		}
	}

}
