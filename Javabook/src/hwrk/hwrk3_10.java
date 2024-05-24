package hwrk;

public class hwrk3_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2;
		int y = 5;
		char c = 'A';

		System.out.println(1 + x << 33); // 1+x=3. 3을 이진수로 표현했을때 0011을 33비트만큼 왼쪽으로 이동. int 자료형은 32비트. 결과적으로 1비트만큼 왼쪽으로 이동.
									     // 따라서 1100(2)=12가 출력된다.
		System.out.println(y >= 5 || x < 0 && x > 2); // 논리연산자 and가 or보다 우선순위가 높다. 따라서 x<0 && x>2를 먼저 계산하면 false 출력. 
													  // 이때 y<=5 || false 이므로 true가 출력된다.

		System.out.println(y += 10 - x++); // 10 - x++=8. 이후 x는 1이 증가하여 3이 됨. y+=8=5+8=13이므로 13이 출력
		System.out.println(!('A' <= c && c <= 'Z')); // 'A'<='A' && 'A'<='Z' 결과는 true. !true이므로 false가 출력
		System.out.println('C' - c); // ASCII에서 'C'=67. 'C'-'A'=67-65=2이므로 2가 출력
		System.out.println(c + 1); // ASCII에서 'A'=65. 65+1=66이므로 66 출력
		System.out.println(c++); // 'A' 출력 후 c는 1이 증가하여 'B'가 됨
		System.out.println(c); // 직전 증가한 'B'. B 출력
		System.out.println(++c); // 'B'에서 1이 증가하여 'C'가 되고 C를 출력

	}

}
