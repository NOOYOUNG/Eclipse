package Chap07_hwrk;

public class ElevatorClient {
	public static int inVal=1;
	
	ElevatorClient() {
		System.out.println("그냥 메서드 "+inVal);
	}
	
	public static void up() {
		inVal++;
		System.out.println("MSG: "+inVal+"층입니다.");
		
		if(inVal==10) {
			System.out.println("MSG: 마지막층입니다.");
		}
	}
	
	public static void down() {
		inVal--;
		System.out.println("MSG: "+inVal+"층입니다.");
	}
	
	public void printInfo() {
		System.out.println("MSG: "+ inVal+ "층입니다.");
	}

}
