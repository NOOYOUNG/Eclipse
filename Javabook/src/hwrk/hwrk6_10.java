package hwrk;

import java.util.Scanner;

public class hwrk6_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr=new int[9][9];
		int max=0, index_row=0, index_col=0, i, j;
		Scanner s=new Scanner(System.in);
		
		for(i=0; i<9; i++) {
			for(j=0; j<9; j++) {
				arr[i][j]=s.nextInt();
			}
			
			for(j=0; j<9; j++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
					index_row=i+1;
					index_col=j+1;
				}
			}
		}
		
		System.out.println("입력된 값 중 최대값은: "+max);
		System.out.println("최대값의 좌표는: "+index_row+"행 "+index_col+"열");

	}

}
