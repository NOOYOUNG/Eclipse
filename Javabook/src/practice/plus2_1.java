package practice;

public class plus2_1 {
	private int[] input=new int[4];
	private int[] output=new int[8];
	private int num; //
	private int[][] table= {
			{1,1,1,1,1,1,0,0},
			{0,1,1,0,0,0,0,0},
			{1,1,0,1,1,0,1,0},
			{1,1,1,1,0,0,1,0},
			{0,1,1,0,0,1,1,0},
			{1,0,1,1,0,1,1,0},
			{1,0,1,1,1,1,1,0},
			{1,1,1,0,0,1,0,0},
			{1,1,1,1,1,1,1,0},
			{1,1,1,1,0,1,1,0}
	};
	
	plus2_1(){
		num=0;
		for(int i=0; i<8; i++) {
			output[i]=table[num][i];
		}
	}
	
	void setInput(int[] in) {
		input=in;
		num=input[3]*8+input[2]*4+input[1]*2+input[0];
		for(int i=0; i<8; i++) {
			output[i]=table[num][i];
		}
	}
	
	void setNum(int num) {
		this.num=num;
		for(int i=0; i<4; i++) {
			input[i]=num%2;
			num=num/2;
		}
	}
	
	int getNum() {
		return num;
	}
	
	int[] getInput() {
		return input;
	}
	
	int[] getOutput() {
		return output;
	}
	

}
