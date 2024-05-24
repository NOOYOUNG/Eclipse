package hwrk;

public class hwrk6_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Ko2re4a0Po4ly4te2chn9ic3";
		char[] ch=new char[str.length()];
		String result="";
		
		for(int i=0; i<str.length(); i++) {
			ch[i]=str.charAt(i); //문자열의 각 문자를 문자 배열에 저장
		
			if(ch[i]=='0'||ch[i]=='1'||ch[i]=='2'||ch[i]=='3'||ch[i]=='4'||ch[i]=='5'||ch[i]=='6'||ch[i]=='7'||ch[i]=='8'||ch[i]=='9') {
				str=str.replace(String.valueOf(ch[i]), "");
				result=str;
			}

		}

		
		System.out.println("result: "+result);

	}
}


//String.valueOf() 메서드는 다양한 데이터 타입의 값을 문자열로 변환하는 데 사용됩니다.
//이 메서드는 인자로 전달된 값을 문자열로 변환하여 반환합니다.

//Character.toString() 메서드는 주어진 문자를 해당하는 문자열로 변환하는 역할을 합니다. 즉, 문자를 문자열로 변환합니다. 