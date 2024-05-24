package Chap07_hwrk;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class hwrk7_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int allPerson=200;
		int pagePerPerson=30;
		Grade grd=new Grade();
		
		for(int j=0; j<=allPerson/pagePerPerson; j++) {
				System.out.println("\t\t성적집계표");
				LocalDateTime now=LocalDateTime.now();
				String formatedNow=now.format(DateTimeFormatter.ofPattern("yyyy.MM.dd hh:mm:ss"));
				System.out.println("PAGE: "+(j+1)+"\t\t\t\t"+formatedNow);
				
				System.out.println("=====================================================");
				System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
				System.out.println("=====================================================");
				
				for(int i=0; i<allPerson; i++) {
					String name="홍길"+String.format("%02d", i+1);
					int ko=(int)(Math.random()*100);
					int en=(int)(Math.random()*100);
					int ma=(int)(Math.random()*100);
					grd.setData(i, name, ko, en, ma);
				}
				
				for(int i=0; i<pagePerPerson; i++) {
					System.out.println(String.format("%03d", i+1)+"\t"+grd.name[i]+"\t"+grd.ko[i]+"\t"+grd.en[i]+"\t"+grd.ma[i]+"\t"+grd.sum[i]+"\t"+grd.avg[i]);
					
					if(j==allPerson/pagePerPerson && i==allPerson%pagePerPerson-1) {
						break;
					}
				}
				
				System.out.println("=====================================================");
				
				grd.SUM();
				grd.AVG();	
			}
			

		}
		

}
