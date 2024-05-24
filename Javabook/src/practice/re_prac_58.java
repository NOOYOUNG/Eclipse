package practice;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DecimalFormat;

public class re_prac_58 {
	public static void titlePrint() {
		System.out.println("\t\t\"국민가게, 다이소\"");
		System.out.println("(주)아성다이소 분당서현점");
		System.out.println("전화:031-702-6016");
		System.out.println("본사:서울 강남구 남부순환로 2748 (도곡동)");
		System.out.println("대표:박정부,신호섭 213-81-52063");
		System.out.println("매장:경기도 성남시 분당구 분당로53번길 11 (서현동)");
		System.out.println("=======================================");
		System.out.println("\t소비자중심경영(CCM) 인증기업");
		System.out.println("\tISO 9001 품징경영시스템 인증기업");
		System.out.println("=======================================");
		System.out.println("\t교환/환불 14일(3월12일)이내,");
		System.out.println("(전자)영수증, 결제카드 지참 후 구입매장에서 가능");
		System.out.println("\t포장/가격 택 훼손시 교환/환불 불가");
		System.out.println("\t체크카드 취소 시 최대 7일 소요");
		System.out.println("======================================");
	}
	
	public static void HeaderPrint() {
		System.out.println("======================================");

	}
	
	public static void timeStamp() {
		Date date=new Date();
		SimpleDateFormat formatter=new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
		String fulldate=formatter.format(date);
		System.out.println("[POS 1058231]\t"+fulldate);
	}
	
	public static int itemPrint() {
		String[] item_name= {"퓨어에어 비말차단용마스크(최고급형)","슬라이드식명찰(가로형)(100호)","매직흡착 인테리어후크(알루미늄타입)"};
		String[] item_code= {"[1031615]","[1008152]","[1020800]"};
		int[] item_price= {3000,1000,1000};
		int[] item_amount= {1,1,1};
		int[] total_price=new int[3];
		
		for(int i=0; i<3; i++) {
			total_price[i]=item_price[i]*item_amount[i];
		}

		for(int i=0; i<3; i++) {
			System.out.println(item_name[i]+" "+String.format("%,d",item_price[i])+" "+item_amount[i]+" "+total_price[i]);
			System.out.println(item_code[i]);
		}
		
		int sum=0;
		for(int i=0; i<3; i++)
			sum+=total_price[i];
		return sum;
		
		/*String item_name1="퓨어에어 비말차단용마스크(최고급형)";
		String item_code1="[1031615]";
		int item_price1=3000;
		int item_amount1=1;
		
		String item_name2="슬라이드식명찰(가로형)(100호)";
		String item_code2="[1008152]";
		int item_price2=1000;
		int item_amount2=1;
		
		String item_name3="매직흡착 인테리어후크(알루미늄타입)";
		String item_code3="[1020800]";
		int item_price3=1000;
		int item_amount3=1;*/
	}
	
	public static void totalPrint(int sum) {
		int tax=sum/11;
		
		DecimalFormat formatter=new DecimalFormat("###,###");
		System.out.println("\t\t과세합계\t\t"+formatter.format(sum-tax));
		System.out.println("\t\t부가세\t\t"+formatter.format(tax));
		System.out.println("--------------------------------------");
		System.out.println("판매합계\t\t\t\t"+formatter.format(sum));
		System.out.println("======================================");
		System.out.println("신용카드\t\t\t\t"+formatter.format(sum));
		System.out.println("--------------------------------------");
		System.out.println("우리카드\t\t\t538720**********");
		System.out.println("승인번호 77982843(0)\t승인금액 "+formatter.format(sum));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int itemCount=3;
		titlePrint();
		timeStamp();
		HeaderPrint();
		
		int sum = itemPrint();

		totalPrint(sum);
		

	}

}
