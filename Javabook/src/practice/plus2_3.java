package practice;

public class plus2_3 {
	private int clk;
	private int r0;
	private int count;
	private int[] output=new int[4];
	
	plus2_3() {
		count=0;
		clk=0;
		r0=0;
		for(int i=0; i<4; i++) {
			output[i]=0;
		}
	}
	
	plus2_3(int r0) {
		this.r0=r0;
		if(r0==1) {
			for(int i=0; i<4; i++) {
				output[i]=0;
			}
		}
	}
	
	void resetCount(){
		count=0;
		for(int i=0; i<4; i++) {
			output[i]=0;
		}
	}
	
	void clkin(int clk) {
		if(this.clk==1 && clk==0) {
			if(++count==10) count=0;
		}
		this.clk=clk; // 조건 안맞으면 상태 저장만 하고 나옴
	}
	
	int getCount() {
		return count;
	}
	
	int[] getOutput() {
		int cnt=count;
		for(int i=0; i<4; i++) {
			output[i]=cnt%2;
			cnt=cnt/2;
		}
		return output;
	}
	
	int[] Countup(int clk) {
		if(r0==1) resetCount();
		else clkin(clk);
		return getOutput();
	}
	
}
