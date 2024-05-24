package hwrk;

public class hwrk5_4 {
	public static void star() {
		System.out.print("*");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++) {
			for(int j=0; j<i; j++)
				star();			
			System.out.println(" ");
		}

	}

}
