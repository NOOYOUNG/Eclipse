package Chap12;

import java.io.File;
import java.io.FileWriter;
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file=new File("ex03.txt");
			if(!file.exists())
				file.createNewFile();
			
			FileWriter myWriter=new FileWriter(file);
			myWriter.write("Hello!\n");
			myWriter.write("Java Programming ");
			myWriter.close();
			System.out.println("파일 쓰기 성공");
		} catch(Exception e) {
			System.out.println(e);
		}

	}

}
