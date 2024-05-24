/*package com.member.main;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import com.member.domain.Member;

public class createMember {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("memberlist.txt");
		Member members=new Member();
		
		try {
			if(!file.exists())
				file.createNewFile();
			
			FileWriter fw=new FileWriter(file, true);
			Scanner input=new Scanner(System.in);

			System.out.print("회원번호: ");
			int num=input.nextInt();
			input.nextLine();
			fw.write("회원번호: "+num);
			
			System.out.print("등록하실 회원의 이름을 입력하세요: ");
			String name=input.nextLine();
			fw.write("\t이름: "+name);
			
			System.out.print("등록하실 회원의 연락처를 입력하세요: ");
			String phone=input.nextLine();
			fw.write("\t연락처: "+phone);
			
			System.out.print("등록하실 회원의 주소를 입력하세요: ");
			String addr=input.nextLine();
			fw.write("\t주소: "+addr+"\n");
			
			members.setMember(num, name, phone, addr);
			
			fw.close();
			System.out.println("등록 완료되었습니다.");
		}
		
		catch(Exception e) {
			e.getMessage();
		}

	}

}*/
