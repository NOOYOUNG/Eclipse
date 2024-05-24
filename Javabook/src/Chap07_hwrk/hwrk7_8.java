package Chap07_hwrk;

public class hwrk7_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int person=30;
		Grade grd=new Grade();
		
		System.out.println("=====================================================");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("=====================================================");
		
		for(int i=0; i<person; i++) {
			String name="홍길"+String.format("%02d", i);
			int ko=(int)(Math.random()*100);
			int en=(int)(Math.random()*100);
			int ma=(int)(Math.random()*100);
			grd.setData(i, name, ko, en, ma);
		}
		
		for(int i=0; i<person; i++) {
			System.out.println(String.format("%02d", i)+"\t"+grd.name[i]+"\t"+grd.ko[i]+"\t"+grd.en[i]+"\t"+grd.ma[i]+"\t"+grd.sum[i]+"\t"+grd.avg[i]);
		}
		
		System.out.println("=====================================================");
		
		grd.SUM();
		grd.AVG();

	}

}
