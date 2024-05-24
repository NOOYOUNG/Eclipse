package practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.text.DecimalFormat;

public class prac4_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("매출전표(카드회사용)");
		System.out.println("맛꼬방치킨\t하준희");
		System.out.println("124-25-54620\t063-632-6614");
		System.out.println("전북 남원시 농고길 11 (도롱동)");
		System.out.println("");
		System.out.println("하나기업카드\t신용승인(1)");
		System.out.print("거래일시:");
		LocalDateTime now=LocalDateTime.now();
		System.out.println(now);
		String formatedNow=now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초"));
		System.out.println(formatedNow);
		System.out.println("4336-9200-****-982*\t일시불");
		System.out.println("TID:***13440  230964317368(0001)");
		System.out.println("가맹점No 00921293692");
		System.out.println("매 입 사 하나카드(다우데이타)");
		System.out.println("승인번호 40860059");
		
		System.out.println("-----------------");
		int price=180000;
		int tax=price/11;
		
		DecimalFormat decimalFormat=new DecimalFormat("###,###");
		
		/*String formattedsoldprice=decimalFormat.format(price-tax);*/
		System.out.println("판매금액: "+decimalFormat.format(price-tax));
		
		String formattedtax=decimalFormat.format(tax);
		System.out.println("부가세: "+formattedtax);
		
		String formattedprice=decimalFormat.format(price);
		System.out.println("합 계: "+formattedprice);
		System.out.println("------------------");
	}

}
