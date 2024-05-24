package Chap12;

import java.io.File;
import java.io.FileInputStream;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file=new File("ex03.txt");
			if(!file.exists())
				file.createNewFile();
			
			FileInputStream fis=new FileInputStream(file);
			
			int i=0;
			
			while((i=fis.read())!=-1) { // read() 메서드를 사용하여 파일에서 한 바이트씩 읽어 들입니다. 파일의 끝에 도달하면 -1을 반환합니다.
				System.out.print((char)i);
			}
			fis.close();
			System.out.println("\n파일 읽기 성공");
		} catch(Exception e) {
			System.out.println(e);
		}

	}

}
