package hwrk;

public class hwrk42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		for(int i=0; i<10; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		int i=0;
		
		while(i<10) {
			int j=0;
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			
			System.out.println();
			i++;
		}

	}

}
