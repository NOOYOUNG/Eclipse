package practice;

public class plus2_2 {
	private int[] input=new int[8];
	private int[][] fnd=new int[5][5];
	
	plus2_2() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				fnd[i][j]=' ';
			}
		}
	}
	
	void setInit() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				fnd[i][j]=' ';
			}
		}
	}
	
	void setFND(int[] input) {
		this.input=input;
		setInit();
		
		if(this.input[0]==1) {
			for(int j=0; j<5; j++) fnd[0][j]='#';
			}
		if(this.input[1]==1) {
			for(int j=0; j<3; j++) fnd[j][4]='#';
		}
		if(this.input[2]==1) {
			for(int j=0; j<3; j++) fnd[2+j][4]='#';
		}
		if(this.input[3]==1) {
			for(int j=0; j<5; j++) fnd[4][j]='#';
		}
		if(this.input[4]==1) {
			for(int j=0; j<3; j++) fnd[j+2][0]='#';
		}
		if(this.input[5]==1) {
			for(int j=0; j<3; j++) fnd[j][0]='#';
		}
		if(this.input[6]==1) {
			for(int j=0; j<5; j++) fnd[2][j]='#';
		}
	}
	
	void dispFND() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("%c", fnd[i][j]);
			}
			System.out.println();
		}
	}
	

}
