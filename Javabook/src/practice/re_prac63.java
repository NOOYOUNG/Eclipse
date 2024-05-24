package practice;

public class re_prac63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<13; i++) {
			System.out.print(i+"월=> ");
			for(int j=1;j<=31; j++) {
				System.out.print(j+",");
				
				if((i==2||i==4||i==6||i==9||i==11)&&j==30)
					break;
				if(i==2 && j==28)
					break;
			}
			System.out.println();
		}

	}

}
