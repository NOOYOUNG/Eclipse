package Ctest;
import java.util.Scanner;
class pr1 {
    public static void main(String[] args) {
    	int[] answer = {};
        String str;
        Scanner s=new Scanner(System.in);
        str=s.nextLine();
        
        int len=str.length();
        int zero_cnt=0, cnt=0;
        for(i=0; i<len; i++){
            if(s.charAt(i)=='0'){
                s.charAt(i)='';
                zero_cnt++;
            }
            
        }
        
        System.out.println(zero_cnt);
        
        return 0;
    }
}