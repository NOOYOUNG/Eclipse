package Chap07_hwrk;

public class TVRemoteController {
	int Ch=0;
	int vol=0;
	
	public void channelUp() {
		Ch++;
		System.out.println("MSG: 현재 채널: "+Ch);
	}

	public void channelDn() {
		Ch--;
		System.out.println("MSG: 현재 채널: "+Ch);
	}
	
	public void volUP() {
		vol++;
		System.out.println("MSG: 현재 음량: "+vol);
	}
	
	public void volDn() {
		vol--;
		System.out.println("MSG: 현재 음량: "+vol);
	}
}
