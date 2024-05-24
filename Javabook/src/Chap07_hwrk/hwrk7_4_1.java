package Chap07_hwrk;

public class hwrk7_4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElevatorClient MSG=new ElevatorClient();

		MSG.up();
		
		for(int i=0; i<9; i++) {
			MSG.up();
			
			if(MSG.inVal==10) { //클래스내의 변수명을 가져오는 방법
				break;
			}
		}
		
		for(int i=0; i<10; i++) {
			MSG.down();
		}

	}

}
