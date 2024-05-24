package Chap07_hwrk;

public class InputData {
	public String[] name;
	public int[] ko;
	public int[] en;
	public int[] ma;
	public int[] sum;
	public double[] avg;
	
	public InputData() {
		name=new String[10];
		ko=new int[10];
		en=new int[10];
		ma=new int[10];
		sum=new int[10];
		avg=new double[10];
	}
	
	public void setData(int index, String name, int ko, int en, int ma) {
		this.name[index]=name; //this를 통해 처음 선언한 인스턴스 변수에 접근
		this.ko[index]=ko;
		this.en[index]=en;
		this.ma[index]=ma;
		this.sum[index]=ko+en+ma;
		this.avg[index]=(double)this.sum[index]/3;
	}

}
