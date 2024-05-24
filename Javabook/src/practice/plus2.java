package practice;

public class plus2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		plus1_1 cmvt=new plus1_1();
		plus2_1 ttl7447=new plus2_1();
		plus2_2 segment=new plus2_2();
		plus2_3 ttl7490=new plus2_3();
		
		int[] out=new int[4];
		int[] fnd=new int[8];
		
		for(int i=0; i<20; i++) {
			//cmvt.setNum(i);
			//cmvt.cmvtop();
			//out=cmvt.getop();
			
			ttl7490.clkin(i%2);
			if(i%2==0) {
				out=ttl7490.getOutput();
			
				System.out.println(ttl7490.getCount());
				out=ttl7490.getOutput();
			
				ttl7447.setInput(out);
				fnd=ttl7447.getOutput();
			
			//segment.setInit();
				segment.setFND(fnd);
				segment.dispFND();
			
				System.out.println();
			}
		}
		

	}

}
