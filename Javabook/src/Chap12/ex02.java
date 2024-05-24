package Chap12;

import java.io.File;
import java.io.FileOutputStream;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello! Java Programming ";
		
		try {
			File file=new File("ex02.txt");
			if(!file.exists())
				file.createNewFile();
			
			FileOutputStream fos=new FileOutputStream(file); //파일에 데이터 작성 스트림
			byte[] b=str.getBytes(); // FileOutputStream 사용을 위해 byte로 쪼개서 넣어야함
			fos.write(b);
			fos.close();
			System.out.println("파일 쓰기 성공");
		} catch(Exception e) {
			e.getMessage();
		}

	}

}
