package Chap06;

public class hwrk6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] gradeArr= {90,70.5,80,79,82.5,50,70,90.2,89.5,89.7};
		double sum=0;
		
		for(int i=0; i<gradeArr.length; i++)
			sum+=gradeArr[i];
		
		double avg=sum/gradeArr.length;
		System.out.println("합계: "+sum);
		System.out.format("평균: %.2f", avg);

	}

}
