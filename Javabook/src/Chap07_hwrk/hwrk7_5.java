package Chap07_hwrk;

public class hwrk7_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TVRemoteController TVC=new TVRemoteController();
		
		
		for(int i=0; i<10; i++) {
			TVC.channelUp();
		}
		
		for(int i=0; i<10; i++) {
			TVC.channelDn();
		}
		
		for(int i=0; i<5; i++) {
			TVC.volUP();
		}
		
		for(int i=0; i<5; i++) {
			TVC.volDn();
		}


	}

}
