package com.member.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import com.member.domain.Mem;

public class initialController implements ManageLogin{
	Scanner s;
	Mem members;
	
	public initialController() {
		s=new Scanner(System.in);
		members=new Mem();
	}
	
	public int scrProgram() {
		System.out.println("***************************************");
		System.out.println("1. 회원 정보 확인하기\t2.회원 정보 수정하기");
		System.out.println("3. 회원 탈퇴\t\t4. 종료");
		System.out.println("***************************************");
		System.out.print("메뉴 번호를 선택해주세요.");
		
		int choice=s.nextInt();
		
		return choice;
	}
	
	public void setProgram(String id) {
		int choice;
		
		while(true) {
			choice=scrProgram();
			
			switch(choice) {
			case 1:
				readMember(id);
				break;
			case 2:
				id=updateMember(id);
				break;
			case 3:
				deleteMember(id);
				return;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}
	
	@Override
	public void readMember(String id) {
		File file=new File("memberList.txt");
		
		try {
			FileReader fis=new FileReader(file);
			BufferedReader br=new BufferedReader(fis);
			String line;
			
			while((line=br.readLine())!=null) {
				if(line.contains(id)) {
					System.out.println(id+" 고객 정보 : ");
					String[] part=line.split("\\s+비밀번호:");
					System.out.println(part[0]);
				}
			}
			br.close();
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Override
	public String updateMember(String id) {
		File file=new File("memberList.txt");
		
		try {
			Scanner input=new Scanner(System.in);
			FileReader fis=new FileReader(file);
			BufferedReader br=new BufferedReader(fis);
			StringBuilder updated=new StringBuilder();
			String line;
			
			while((line=br.readLine())!=null) {
				if(line.contains(id)) {
					System.out.print(id+" 회원의 이름을 수정하세요: ");
					String rename=input.nextLine();
					System.out.print(rename+" 회원의 연락처를 수정하세요: ");
					String rephone=input.nextLine();
					System.out.print(rename+" 회원의 주소를 입력하세요: ");
					String readdr=input.nextLine();
					System.out.print(rename+" 회원의 비밀번호를 입력하세요: ");
					String enterpwd=input.nextLine();
					
					if(line.contains(enterpwd)) {
						String[] part=line.split("\t");
						part[1]=rename.isEmpty()? part[1]:rename;
						part[2]=rephone.isEmpty()? part[2]:rephone;
						part[3]=readdr.isEmpty()? part[3]:readdr;
						updated.append(part[0]).append("\t");
						updated.append("이름: ").append(part[1]).append("\t");
						updated.append("연락처: ").append(part[2]).append("\t");
						updated.append("주소: ").append(part[3]).append("\t");
						updated.append("비밀번호: ").append(enterpwd).append("\n");
						
						int num=Integer.parseInt(part[0].split(": ")[1]);
						members.setMember(num, part[1], part[2], part[3], enterpwd);
						id=part[1];
					} else {
						updated.append(line).append("\n");
						System.out.println("비밀번호가 일치하지 않습니다.");
					}
				} else {
					updated.append(line).append("\n");
				}
			}
			fis.close();
			BufferedWriter bw=new BufferedWriter(new FileWriter(file));
			bw.write(updated.toString());
			bw.close();
			System.out.println("수정 완료되었습니다.");
		} catch(Exception e) {
			System.out.println(e);
		}
		
		return id;
	}
	
	@Override
	public void deleteMember(String id) {
		File file=new File("memberList.txt");
		
		try {
			Scanner input=new Scanner(System.in);
			FileReader fis=new FileReader(file);
			BufferedReader br=new BufferedReader(fis);
			StringBuilder updated=new StringBuilder();
			String line;
			
			while((line=br.readLine())!=null) {
				if(line.contains(id)) {
					System.out.print("비밀번호를 입력하세요: ");
					String enterpwd=s.nextLine();
					s.nextLine();
					
					if(line.contains(enterpwd)) {
						line=null;
					} else {
						updated.append(line).append("\n");
						System.out.println("비밀번호가 일치하지 않습니다.");
					}
				} else {
					updated.append(line).append("\n");
				}
			}
			
			fis.close();
			BufferedWriter bw=new BufferedWriter(new FileWriter(file));
			bw.write(updated.toString());
			bw.close();
			System.out.println("탈퇴되었습니다.");
			System.out.println("로그인 프로그램을 종료합니다.");
		} catch(Exception e) {
			System.out.println(e);
		}
		
	}


}
