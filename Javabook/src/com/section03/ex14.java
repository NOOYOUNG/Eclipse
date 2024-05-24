package com.section03;
import java.util.Date;
import java.text.SimpleDateFormat;
public class ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		SimpleDateFormat formatter=new SimpleDateFormat("MM/dd/yyyy");
		
		String strDate=formatter.format(date);
		System.out.println("MM/dd/yyyy: "+strDate);
		
		formatter=new SimpleDateFormat("dd-M=yyyy hh:mm:ss");
		strDate=formatter.format(date);
		System.out.println("dd-M-yyyy hh:mm:ss "+strDate);
		
		formatter=new SimpleDateFormat("dd MMMM yyyy");
		strDate=formatter.format(date);
		System.out.println("dd MMMM yyyy "+strDate);

		formatter=new SimpleDateFormat("dd MMMM yyyy zzzz");
		strDate=formatter.format(date);
		System.out.println("dd MMMM yyyy zzzz "+strDate);
	}

}


// MMMM은 전체 월 이름을 표현
// zzzz는 해당 지역의 표준 타임존