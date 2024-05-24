package Chap11;

public class MyException extends Exception {
	String str1;
	MyException(String str2){
		str1=str2;
	}
	public String toString() {
		return ("My Exception 발생: "+str1);
	}

}
