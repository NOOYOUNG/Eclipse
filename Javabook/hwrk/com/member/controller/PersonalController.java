package com.member.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;

import com.member.domain.Member;

public class PersonalController {
	Scanner s;
	Member members;
	
	public PersonalController() {
		s=new Scanner(System.in);
		members=new Member();
	}
	
	public int personalInterface() {
		System.out.println("***************************************");
		System.out.println("\t\t이승원님 안녕하세요?");
		System.out.println("***************************************");
		System.out.println("1. 회원 정보 확인하기\t2. 회원 정보 수정하기");
		System.out.println("3. 회원 탈퇴\t4.종료");
		System.out.println("***************************************");
		System.out.print("메뉴 번호를 선택해주세요 ");
		
		int choice=s.nextInt();
		
		return choice;
	}
	
	public void setPersonalInterface() {
		int choice;
		
		while(true) {
			choice=personalInterface();
			switch(choice) {
			case 1:
				checkMemberInfo();
				break;
			case 2:
				modMemberInfo();
				break;
			case 3:
				leaveMember();
				break;
			case 4:
				System.out.println("종료합니다.");
				return;
			}
		}
	}
	
	void checkMemberInfo() {
		File file = new File("memberlist.txt");

		try {
			Scanner input = new Scanner(System.in);

			System.out.print("조회할 회원 이름을 입력해주세요 ");
			String inputname = input.nextLine();

			FileInputStream fis = new FileInputStream(file);
			Scanner scan = new Scanner(fis);
			boolean found = true;

			while (scan.hasNextLine()) {
				String line = scan.nextLine();
				if (line.contains(inputname)) {
					System.out.println(inputname + " 고객 정보 :");
					String[] parts = line.split("\\s+비밀번호:"); // "\s+" 하나 이상의 연속된 공백 문자
					if (parts.length > 1) {
						System.out.println(parts[0]);
						found = true;
						break;
					}

				} else {
					found = false;
				}
			}

			if (!found) {
				System.out.println("해당 이름의 회원이 존재하지 않습니다.");
			}

			scan.close();
			fis.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	void modMemberInfo() {
		File file = new File("memberlist.txt");

		try {
			Scanner input = new Scanner(System.in);
			FileReader fis=new FileReader(file);
			BufferedReader br=new BufferedReader(fis);
			StringBuilder updated=new StringBuilder();
			String line;
			boolean found = false;
			int index=0;

			System.out.print("수정할 회원 이름을 입력해주세요 ");
			String name = input.nextLine();
			
			for(int i=0; i<100; i++) {
				if(name.equals(members.getName(i))) {
					index=i;
					break;
				}
			}
			while ((line=br.readLine())!=null) { // 파일을 한 줄씩 읽어들이면서 특정 이름을 검색하고 해당 행의 이름과 주소를 업데이트
				if (line.contains(name)) {
					found=true;
					System.out.print(name + " 회원의 이름을 수정하세요: ");
					String rename = input.nextLine();
					System.out.print(rename + " 회원의 연락처를 수정하세요: ");
					String rephone = input.nextLine();
					System.out.print(rename + " 회원의 주소를 입력하세요: ");
					String readdr = input.nextLine();
					System.out.print(rename + " 회원의 비밀번호를 입력하세요: ");
					String enterpwd = input.nextLine();

					if (line.contains(enterpwd)) {
						String[] part = line.split(" ");
						part[4]=rename.isEmpty()? part[4]:rename;
						part[6]=rephone.isEmpty()? part[6]:rephone;
						part[8]=readdr.isEmpty()? part[8]:readdr;
						updated.append("회원번호: ").append(index+1).append(" ");
						updated.append("이름: ").append(part[4]).append(" ");
						updated.append("연락처: ").append(part[6]).append(" ");
						updated.append("주소: ").append(part[8]).append(" ");
						updated.append("비밀번호: ").append(enterpwd).append("\n");
						
						members.setNum(index, index+1);
						members.setName(index,  part[4]);
						members.setPhone(index,  part[6]);
						members.setAddr(index,  part[8]);
						members.setPwd(index, enterpwd);
					} else {
						updated.append(line).append("\n");
						System.out.println("비밀번호가 일치하지 않습니다.");
					}
				} else {
					updated.append(line).append("\n");
				}
			}

			if (!found) {
				System.out.println("해당 이름의 회원이 존재하지 않습니다.");
			}
			else {
				fis.close();
				BufferedWriter bw=new BufferedWriter(new FileWriter(file));
				bw.write(updated.toString());
				bw.close();
				System.out.println("수정 완료되었습니다.");
			}
			br.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	void leaveMember() {
		File file = new File("memberlist.txt");

		try {
			Scanner input = new Scanner(System.in);
			FileReader fis=new FileReader(file);
			BufferedReader br=new BufferedReader(fis);
			StringBuilder updated=new StringBuilder();
			String line;
			boolean found = false;
			int index=0;

			System.out.print("삭제할 회원 이름을 입력해주세요 ");
			String name = input.nextLine();
			
			for(int i=0; i<100; i++) {
				if(name.equals(members.getName(i))) {
					index=i;
					break;
				}
			}
			
			while ((line=br.readLine())!=null) {
				if (line.contains(name)) {
					found=true;
					System.out.print(name + " 회원의 비밀번호를 입력하세요: ");
					String enterpwd = input.nextLine();

					if (line.contains(enterpwd)) {
						line=null;
						
						members.setName(index,  null);
						members.setPhone(index,  null);
						members.setAddr(index,  null);
						members.setPwd(index,  null);
					} else {
						updated.append(line).append("\n");
						System.out.println("비밀번호가 일치하지 않습니다.");
					}
				} else { // 회원 삭제 시 남아있는 회원번호 정리
					String[] part=line.split(" ");
					int memnum=Integer.parseInt(part[1]);
					if(memnum>index+1) {
						memnum--;
					}
					line=line.replaceFirst("회원번호: \\d+", "회원번호: "+memnum);
					updated.append(line).append("\n");
				}
			}

			if (!found) {
				System.out.println("해당 이름의 회원이 존재하지 않습니다.");
			}
			else {
				fis.close();
				BufferedWriter bw=new BufferedWriter(new FileWriter(file));
				bw.write(updated.toString());
				bw.close();
				System.out.println("삭제 완료되었습니다.");
			}
			br.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
