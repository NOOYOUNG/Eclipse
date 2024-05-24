package hwrk;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class hwrk5_8 {
	
	public static void titlePrint() {
		System.out.println("\"국민가게, 다이소\"");
		System.out.println("(주)아성다이소_분당서현점");
		System.out.println("전화:031-702-6016");
		System.out.println("본사:서울 강남구 남부순환로 2748(도곡동)");
		System.out.println("대표:박정부, 신호섭 213-81-52063");
		System.out.println("매장:경기도 성남시 분당구 분당로53번길 11(서현동)");
		System.out.println("===========================");
		System.out.println("소비자중심경영(CCM) 안증기업");
		System.out.println("130 9001 품질경영시스템 인증기업");
		System.out.println("===========================");
		System.out.println("교환/환불 14일(03월12일)이내,");
		System.out.println("(전자)영수증, 결제카드 지참 후 구입매장에서 가능");
		System.out.println("포장/가격 택 훼손시 교환/환불 불가");
		System.out.println("체크카드 취소 시 최대 7일 소요");
		System.out.println("===========================");
	}
	
	public static void timeStamp() {
		LocalDateTime now=LocalDateTime.now();
		String formatedNow=now.format(DateTimeFormatter.ofPattern("yyyy.MM.dd hh:mm:ss"));
		System.out.println("[POS 1058231]\t"+formatedNow);
	}
	
	public static int itemPrint(int itemNum) {
		String item_name1="퓨어에어 비말차단용마스크(최고급형)";
		int item_price1=3000;
		int item_amount1=1;
		int sum1=item_price1*item_amount1;
		String item_code1="1031615";
		
		String item_name2="슬라이드식명찰(가로형)(100호)";
		int item_price2=1000;
		int item_amount2=1;
		int sum2=item_price2*item_amount2;
		String item_code2="11008152";
		
		String item_name3="매직흡착 인테리어후크(알루미늄타입)";
		int item_price3=1000;
		int item_amount3=1;
		int sum3=item_price3*item_amount3;
		String item_code3="1020800";
		
		/* String tap="item name"+(i+1); */
		
		switch(itemNum) {
		case 1:
			System.out.println(item_name1+"\t"+item_price1+"\t"+item_amount1+"\t");
			System.out.println(item_code1);
			break;
		case 2:
			System.out.println(item_name2+"\t\t"+item_price2+"\t"+item_amount2+"\t");
			System.out.println(item_code2);
			break;
		case 3:
			System.out.println(item_name3+"\t"+item_price3+"\t"+item_amount3+"\t");
			System.out.println(item_code3);
			break;
		}
		
		int sum=sum1+sum2+sum3;
		return sum;
	}
	
	public static void HeaderPrint() {
		System.out.println("상품명\t단가\t수량\t금액");
	}
	
	public static void totalPrint() {
		int sum = itemPrint(100); //itemPrint함수의 return값을 가져오기 위해
		
		DecimalFormat formatter=new DecimalFormat("###,###");
		
		int tax=sum/11;
		
		System.out.println("\t\t과세합계\t"+formatter.format(sum-tax));
		System.out.println("\t\t부가세\t"+formatter.format(tax));
		
		System.out.println("-------------------------");
		System.out.println("판매합계\t\t"+formatter.format(sum));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int itemCount=3; // 항목이 몇 개인지
		titlePrint(); // 영수증 맨 위 타이틀 인쇄
		timeStamp(); // 출력시간 인쇄
		HeaderPrint();
		
		for(int i=1; i<=itemCount; i++) {
			itemPrint(i);
		}
		
		
		totalPrint(); // 합계 세액 인쇄

	}

}
