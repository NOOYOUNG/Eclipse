package Chap12;

import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file=new File("ex03.txt");
			if(!file.exists())
				file.createNewFile();
			FileReader fis=new FileReader(file);
			BufferedReader br=new BufferedReader(fis);
			String str;
			while((str=br.readLine())!=null) {
				System.out.println(str);
			}
			fis.close();
			System.out.println("파일 읽기 성공");
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
