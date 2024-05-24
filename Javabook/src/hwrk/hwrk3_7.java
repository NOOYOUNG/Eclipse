package hwrk;

public class hwrk3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "12345"; // 문자열 변수 s에 "12345"를 할당
		int i = Integer.parseInt(s); // 문자열 s를 정수로 변환. 문자열 "12345"가 정수 12345로 변환
		// parseInt() : 문자열을 정수로 변환
		System.out.printf("문자를 숫자로 %d (%d) \n", i, i + 10); // 첫 번째 %d는 i, 두 번째 %d는 i+10. -> 문자를 숫자로 12345 (12355)

		String a;
		a = String.format("%d", i); // String.format() 메서드를 사용하여 정수 i를 문자열로 변환 -> 변수 a에는 문자열 "12345"가 할당

		System.out.printf("숫자를 문자로 %s (%s) \n", a, a + "abcde"); // 첫 번째 %s는 변수 a, 두 번째 %s는 a + "abcde". -> 숫자를 문자로 12345 (12345abcde)
	}

}
