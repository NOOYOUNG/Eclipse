package Chap04;

public class ex11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1; i<=4; i++) {
			for(int j=1; j<=3; j++) {
				if(i==3&&j==2) continue;
				System.out.println(i+" * "+j);
			}
		}
	}

}
