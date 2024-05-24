package practice;
import java.util.Scanner;
public class re_prac610 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr=new int[9][9];
		Scanner s=new Scanner(System.in);
		
		int max=0, row_index=0, col_index=0;
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				arr[i][j]=s.nextInt();
			}
		}
		
		for(int i=0; i<9; i++) {			
			for(int j=0; j<9; j++) {				
				if(arr[i][j]>max) {
					max=arr[i][j];
					row_index=i+1;
					col_index=j+1;
				}
			}
		}
		
		System.out.println("입력된 값 중 최대값은: "+max);
		System.out.println("최대값의 좌표는: "+row_index+"행 "+col_index+"열");

	}

}
