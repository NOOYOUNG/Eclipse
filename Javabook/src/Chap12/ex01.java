package Chap12;
import java.io.File;
import java.io.IOException;
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fileoBj=new File("ex01.txt");
		
		try {
			boolean success=fileoBj.createNewFile();
			if(success) {
				System.out.println("파일 생성 성공");
			}
			else {
				System.out.println("파일 생성 실패");
			}
		} catch(IOException e) {
			System.out.println(e);
		}

	}

}
