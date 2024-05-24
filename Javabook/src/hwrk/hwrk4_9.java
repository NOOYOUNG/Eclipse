package hwrk;

public class hwrk4_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0; // 변수 sum을 0으로 초기화
		
		for(int i=0; i<10; i++) {
			sum=sum+i; // 0부터 9까지의 합을 구함
		}
		
		System.out.println("sum: "+sum); // sum값 출력
		
		for(int i=1; i<10; i++) {
			System.out.println("*********");
			System.out.println("구구단 "+i+"단"); // 구구단 1단부터 9단까지 출력
			System.out.println("*********");
			
			for(int j=1; j<10; j++) {
				System.out.println(i+" * "+j+" = "+(i*j)); // 중첩 반복문을 통해 각 단을 출력
			}
		}

	}

}
