package com.member.main;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;

import com.member.domain.Mem;
import com.member.controller.MemController;

public class LogIn {
	Scanner s;
	private Mem members;

	LogIn() {
		s = new Scanner(System.in);
		members=new Mem();
		createAdmin(0);
		memberlogin();
	}

	public void createAdmin(int num) {
		members.setMember(num, "admin", "01011112222", "관리자주소", "admin");
	}

	public void memberlogin() {
		File file=new File("memberList.txt");
		try {
			Scanner scan=new Scanner(file);
			
			while(scan.hasNextLine()) {
				String line=scan.nextLine();
				String[] memberInfo=line.split("\t");
				
				int num=Integer.parseInt(memberInfo[0].split(": ")[1]);
				String name=memberInfo[1].split(": ")[1];
				String phone=memberInfo[2].split(": ")[1];
				String addr=memberInfo[3].split(": ")[1];
				String pwd=memberInfo[4].split(": ")[1];
				
				members.setMember(num, name, phone, addr, pwd);
			}
			scan.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	String scrLogin() {
		boolean logboolean=true;
		int cnt = 0;
		
		while (logboolean) {
			boolean idFound=false;
			
			System.out.println("***************************************");
			System.out.println("\t\t로그인");
			System.out.println("***************************************");

			System.out.print("아이디를 입력하세요: ");
			String adname = s.nextLine();

			for(int i=0; i<100; i++) {
				if (adname.equals(members.getName(i))) {
					idFound=true;
					System.out.print("비밀번호를 입력하세요: ");
					String adpwd = s.nextLine();

					if (adpwd.equals(members.getPwd(i))) {
						System.out.println("로그인 성공");
						logboolean=false;
						
						if(adname.equals(members.getName(0))) {
							return "admin";
						}
						else {
							return adname;
						}
					} else {
						System.out.println("비밀번호가 틀렸습니다.");
						cnt++;
					}
				} 
			}
			
			if(!idFound) {
				System.out.println("일치하는 아이디가 없습니다.");
			}
			
			if (cnt == 3) {
				System.out.println("로그인 횟수 초과");
				break;
			}
			
		}
		
		return "none";
	}

}
