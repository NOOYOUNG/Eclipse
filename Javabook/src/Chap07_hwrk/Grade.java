package Chap07_hwrk;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Grade {
	public String[] name;
	public int[] ko;
	public int[] en;
	public int[] ma;
	public int[] sum;
	public double[] avg;
	
	int ko_sum=0;
	int en_sum=0;
	int ma_sum=0;
	int s_sum=0;
	double avg_sum=0;
	
	Grade() {
		name=new String[200];
		ko=new int[200];
		en=new int[200];
		ma=new int[200];
		sum=new int[200];
		avg=new double[200];
	}
	
	public void setData(int index, String name, int ko, int en, int ma) {
		this.name[index]=name;
		this.ko[index]=ko;
		this.en[index]=en;
		this.ma[index]=ma;
		this.sum[index]=ko+en+ma;
		this.avg[index]=(double)this.sum[index]/3;
	}
	
	public void SUM() {
		
		for(int i=0; i<30; i++) {
			ko_sum+=ko[i];
			en_sum+=en[i];
			ma_sum+=ma[i];
			s_sum+=sum[i];
			avg_sum+=avg[i];
		}
		
		System.out.println("합계\t\t"+ko_sum+"\t"+en_sum+"\t"+ma_sum+"\t"+s_sum+"\t"+avg_sum);
	}
	
	public void AVG() {
		int ko_avg=ko_sum/30;
		int en_avg=en_sum/30;
		int ma_avg=ma_sum/30;
		int s_avg=s_sum/30;
		double a_avg=avg_sum/30;
		
		System.out.println("평균\t\t"+ko_avg+"\t"+en_avg+"\t"+ma_avg+"\t"+s_avg+"\t"+a_avg);
		
	}
	

}
