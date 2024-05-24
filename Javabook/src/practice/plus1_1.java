package practice;

public class plus1_1 {
	private int num; //10진수로 입력받음
	private int [] output=new int[4]; //2진수 4개 배열로 변환된 결과를 배열로 출력

	plus1_1() {
		num=0;
		/*for(int i=0; i<output.length; i++) {
			output[i]=0;
		}*/
	}
	
	plus1_1(int num) { //생성자 오버로딩
		this.num=num; //클래스 내의 num을 변수로 받음 <<this 사용
	}
	
	void setNum(int num) {
		this.num=num; //매개변수 num을 클래스 내의 변수 num에 저장해 쓰겠다  WHY??? private으로 변수를 선언한 경우 사용하기 위해
	}
	
	int getNum() {
		return num;
	}
	
	void cmvtop() {
		for(int i=0; i<4; i++) {
			output[i]=num%2;
			num=num/2;
		}
	}
	
	int[] getop() {
		return output;
	}
	
}
