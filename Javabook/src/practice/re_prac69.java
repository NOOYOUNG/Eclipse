package practice;

public class re_prac69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Ko2re4a0Po4ly4te2chn9ic3";		
		char[] ch=new char[str.length()];
		String result="";
		
		for(int i=0; i<str.length(); i++) {
			ch[i]=str.charAt(i);
			
			if(ch[i]=='0' || ch[i]=='1' || ch[i]=='2' || ch[i]=='3' || ch[i]=='4' || ch[i]=='5' || ch[i]=='6' || ch[i]=='7' || ch[i]=='8' || ch[i]=='9') {
				str=str.replace(String.valueOf(ch[i]),"");
				result=str;
			}
			
		}
		
		System.out.println("result: "+result);

	}

}
