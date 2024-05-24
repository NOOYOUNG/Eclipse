package hwrk;

import java.util.Scanner;

public class hwrk6_11 {
	public static int[] lottoNum() {
		int[] lottonum=new int[7];
		
		System.out.print("로또 당첨 번호 : ");
		for(int i=0; i<7; i++) {
			lottonum[i]=(int)(Math.random()*45)+1;
			
			for(int j=0; j<i; j++) // 난수 중복 방지
				if(lottonum[i]==lottonum[j]) i--; //중복된 난수가 있다면 다시 i번째 난수생성으로 돌아감
		}
		
		for(int i=0; i<6; i++) {
			System.out.print(lottonum[i] + " ");
		}
		System.out.println(" 보너스 번호 "+lottonum[6]);
		
		return lottonum;
	}
	
	public static void lotto(int[] mynum) {
		int[] lottonum=lottoNum();
		
		int cnt=0;
		int bonus=0;
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				if(mynum[i]==lottonum[j])
					cnt++;
				if((mynum[i]!=lottonum[j])&&(mynum[i]==lottonum[6]))
					bonus=1;
			}
		}
		
		if(cnt==6)
			System.out.println("추첨 결과: 1등입니다!");
		else if(cnt==5 && bonus==1)
			System.out.println("추첨 결과: 2등입니다.");
		else if(cnt==5)
			System.out.println("추첨 결과: 3등입니다.");
		else if(cnt==4)
			System.out.println("추첨 결과: 4등입니다.");
		else if(cnt==3)
			System.out.println("추첨 결과: 5등입니다.");
		else
			System.out.println("추첨 결과: 꽝입니다.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mynum=new int[6];
		Scanner s=new Scanner(System.in);
		boolean boo=true;
		
		while(boo) {
			System.out.println("로또 번호를 입력하세요");
			
			boolean boo1=false;
			
			for(int i=0; i<6; i++) {
				mynum[i]=s.nextInt();	
			}
			
			for(int i=0; i<6; i++) {
				for(int j=i+1; j<5; j++) {
					if(mynum[i]==mynum[j]) {
						boo1=true;
						break;
					}
					else {
						boo=false;
					}
				}
				
				if(boo1) {
					System.out.println("중복 값은 입력할 수 없습니다. 다시 입력해주세요.");
					break;
				}
				continue;
			}
			
		}
		
		lotto(mynum);

	}

}
