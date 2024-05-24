package Chap06;
public class ex02_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] gradeArr= {90,70.5,80,79,82.5,50,70,90.2,89.5,89.7};
		double sum=0.0;
		
		for(int i=0; i<gradeArr.length; i++)
			sum+=gradeArr[i];
		
		double avg=sum/gradeArr.length;
		System.out.println("합계: "+sum);
		System.out.println("평균: "+avg);
		System.out.format("평균: %.2f", avg);
		System.out.printf("평균: %.2f", avg);
		System.out.println("평균"+String.format("%.2f", avg));
		System.out.println(Math.round(avg*100)/100.0);
	}

}
