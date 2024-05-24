package hwrk;
import java.util.Scanner;

public class hwrk6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grade=new int [2][5];
		Scanner s=new Scanner(System.in);
		
		int sum=0;
		for(int i=0; i<5; i++) {
			System.out.print((i+1)+"번 학생의 국어 점수: ");
			grade[0][i]=s.nextInt();
			sum+=grade[0][i];
		}
		
		double avg=(double)sum/5; // sum의 형변환
		System.out.println("합계: "+sum);
		System.out.println("평균: "+avg);

	}

}
