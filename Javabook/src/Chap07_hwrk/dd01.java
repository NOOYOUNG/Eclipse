package Chap07_hwrk;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dd01 {
	int allPerson=61;
	int pagePerPerson=30;
	int pPP;
	
	public String[] name;
	public int[] ko;
	public int[] en;
	public int[] ma;
	public int[] sum;
	public int[] avg;
	
	int ko_sum;
	int en_sum;
	int ma_sum;
	int s_sum;
	int avg_sum;
	
	dd01() {
		name=new String[allPerson];
		ko=new int[allPerson];
		en=new int[allPerson];
		ma=new int[allPerson];
		sum=new int[allPerson];
		avg=new int[allPerson];
		
		if(allPerson%pagePerPerson==0) {
			pPP=pagePerPerson;
		}
		else {
			pPP=allPerson%pagePerPerson;
		}
	}
	
	public void setData(int index, String name, int ko, int en, int ma) {
		this.name[index]=name;
		this.ko[index]=ko;
		this.en[index]=en;
		this.ma[index]=ma;
		this.sum[index]=ko+en+ma;
		this.avg[index]=(int)this.sum[index]/3;
	}
	
	public void initial() {
		ko_sum=0;
		en_sum=0;
		ma_sum=0;
		s_sum=0;
		avg_sum=0;
	}
	
	public void SUM() {
		
		for(int i=0; i<pagePerPerson; i++) {
			ko_sum+=ko[i];
			en_sum+=en[i];
			ma_sum+=ma[i];
			s_sum+=sum[i];
			avg_sum+=avg[i];
		}
		
		System.out.println("합계\t\t"+ko_sum+"\t"+en_sum+"\t"+ma_sum+"\t"+s_sum+"\t"+avg_sum);
	}
	
	public void AVG() {
		int ko_avg=ko_sum/pagePerPerson;
		int en_avg=en_sum/pagePerPerson;
		int ma_avg=ma_sum/pagePerPerson;
		int s_avg=s_sum/pagePerPerson;
		int a_avg=avg_sum/pagePerPerson;
		
		System.out.println("평균\t\t"+ko_avg+"\t"+en_avg+"\t"+ma_avg+"\t"+s_avg+"\t"+a_avg);
	}
	
	public void last_SUM() {
		for(int i=0; i<pPP; i++) {
			ko_sum+=ko[i];
			en_sum+=en[i];
			ma_sum+=ma[i];
			s_sum+=sum[i];
			avg_sum+=avg[i];
		}
		
		System.out.println("합계\t\t"+ko_sum+"\t"+en_sum+"\t"+ma_sum+"\t"+s_sum+"\t"+avg_sum);
	}
	
	public void last_AVG() {
		int ko_avg=ko_sum/pPP;
		int en_avg=en_sum/pPP;
		int ma_avg=ma_sum/pPP;
		int s_avg=s_sum/pPP;
		int a_avg=avg_sum/pPP;
		
		System.out.println("평균\t\t"+ko_avg+"\t"+en_avg+"\t"+ma_avg+"\t"+s_avg+"\t"+a_avg);
	}

}
