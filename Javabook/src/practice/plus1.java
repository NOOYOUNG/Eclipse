package practice;

public class plus1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		plus1_1 cmvt1=new plus1_1();
		plus1_1 cmvt2=new plus1_1(3);
		int[] out1=new int[4];
		int[] out2=new int[4];
		int fnd[]=new int[8];
		plus2_1 ttl7447=new plus2_1();
		plus2_2 FNDsegment=new plus2_2();
		
		cmvt1.setNum(9); //num을 0이 아닌 9로 설정
		
		System.out.println(cmvt1.getNum());
		//System.out.println(cmvt1.num); // 클래스 내의 변수 num을 불러올 수 있음  BUT private인 경우는 할 수 없다
		System.out.println(cmvt2.getNum());
		
		
		cmvt1.cmvtop();
		cmvt2.cmvtop();
		
		out1=cmvt1.getop();
		out2=cmvt2.getop();
		
		for(int i=0; i<4; i++) {
			System.out.print(out1[3-i]);
		}
		
		System.out.println();
		
		for(int i=0; i<4; i++) {
			System.out.print(out2[3-i]);
		}
		
		System.out.println("\n");
		
		ttl7447.setInput(out1);
		System.out.println(ttl7447.getNum());
		fnd=ttl7447.getOutput();
		for(int i=0; i<8; i++) {
			System.out.print(fnd[i]);
		}
		
		System.out.println("\n");
		
		FNDsegment.setFND(fnd);
		FNDsegment.dispFND();
		
		
	}

}
