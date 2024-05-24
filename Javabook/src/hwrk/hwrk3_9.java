package hwrk;

public class hwrk3_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f=9.123456789f;
		double d=9.123456789;
		double d2=(double)f;
		
		System.out.println("f="+f); // float는 유효 자릿수가 7자리이므로 소수점 이하에서 반올림되어 f=9.123457 출력
		System.out.println("d="+d); // double은 float보다 많은 유효한 자릿수를 가지므로 d=9.123456789
		System.out.println("d2="+d2); // float 형식의 f를 double로 변환하며 d2=9.123456954956055 출력
		

	}

}
