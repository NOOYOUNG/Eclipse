package hwrk;

public class hwrk6_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1001034567;
		String Num=String.valueOf(num); // 정수 문자열 전환
		String numvoice=""; // numvoice 문자열 초기화
		System.out.println("==> "+num+"["+Num.length()+"자리]");
		
		String[] units= {"영","일","이","삼","사","오","육","칠","팔","구"};
		String[] unitx= {"","십","백","천","만","십","백","천","억","십"};
		
		int i=0, j=Num.length()-1;
		
		while(true) {
			if(i>=Num.length()) break;
			
			System.out.print(Num.substring(i, i+1)+"["+units[Integer.parseInt(Num.substring(i,i+1))]+"]");
			//Interger.parseInt():문자열로 표현된 숫자를 정수로 변환
			if(Num.substring(i,i+1).equals("0")) { // Num의 i번째 문자가 "0"인지 확인
				if(unitx[j].equals("만") || unitx[j].equals("억")) { //"만"이나 "억"인지 확인
					numvoice=numvoice+""+unitx[j]; // 
				}
				
			}
			else {
				numvoice=numvoice+units[Integer.parseInt(Num.substring(i,i+1))]+unitx[j];
			}
			i++;
			j--;
		}

		System.out.println("\n"+num+"["+numvoice+"]");
	}

}
