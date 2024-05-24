package com.member.controller;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import com.member.domain.Mem;

public class MemController extends ManageMem{
	Scanner s;
	Mem members;

	public MemController() {
		s = new Scanner(System.in);
		members = new Mem();
	}

	public int scrProgram() {
		System.out.println("***************************************");
		System.out.println("\t\t회원 관리 프로그램");
		System.out.println("***************************************");
		System.out.println("1. 고객 정보 등록하기\t2. 고객 정보 조회하기");
		System.out.println("3. 고객 정보 수정하기\t4. 고객 정보 삭제하기");
		System.out.println("5. 고객 정보 목록보기\t6. 고객 정보 파일출력");
		System.out.println("7. 종료");
		System.out.println("***************************************");
		System.out.print("메뉴 번호를 선택해주세요 ");

		int choice = s.nextInt();

		return choice;
	}

	public void setProgram() {
		int choice;

		while (true) {
			choice = scrProgram();
			switch (choice) {
			case 1:
				createMember();
				break;
			case 2:
				readMember();
				break;
			case 3:
				updateMember();
				break;
			case 4:
				deleteMember();
				break;
			case 5:
				fileMember();
				break;
			case 6:
				listMember();
				break;
			case 7:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}

	@Override
	void createMember() {
		try {
			Scanner input = new Scanner(System.in);

			System.out.print("등록하실 회원의 이름을 입력하세요: ");
			String name = input.nextLine();

			System.out.print("등록하실 회원의 연락처를 입력하세요: ");
			String phone = input.nextLine();

			System.out.print("등록하실 회원의 주소를 입력하세요: ");
			String addr = input.nextLine();

			System.out.print("등록하실 회원의 비밀번호를 입력하세요: ");
			String pwd = input.nextLine();

			members.setMember(members.index+1, name, phone, addr, pwd);
			
			System.out.println("등록 완료되었습니다.");
		} catch (Exception e) {
			e.getMessage();
		}
	}

	@Override
	void readMember() {
		try {
			Scanner input = new Scanner(System.in);
			boolean found = true;
			int point=0;
			
			System.out.print("조회할 회원 이름을 입력해주세요 ");
			String inputname = input.nextLine();

			for(int i=0; i<100; i++) {
				if(inputname.equals(members.getName(i))) {
					point=i;
					found=true;
					break;
				}
				else {
					found=false;
				}
			}
			
			if(found) {
				System.out.println(inputname + " 고객 정보 :");
				System.out.println("회원번호: "+members.getNum(point)+"\t이름: "+members.getName(point)+"\t연락처: "+members.getPhone(point)+"\t주소: "+members.getAddr(point));
			}
			else {
				System.out.println("해당 이름의 회원이 존재하지 않습니다.");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	void updateMember() {
		try {
			Scanner input = new Scanner(System.in);
			boolean found = false;
			int point=0;

			System.out.print("수정할 회원 이름을 입력해주세요 ");
			String name = input.nextLine();
			
			for(int i=0; i<100; i++) {
				if(name.equals(members.getName(i))) {
					point=i;
					found=true;
					break;
				}
				else {
					found=false;
				}
			}
			
			if (found) {
				System.out.print(name + " 회원의 이름을 수정하세요: ");
				String rename = input.nextLine();
				System.out.print(rename + " 회원의 연락처를 수정하세요: ");
				String rephone = input.nextLine();
				System.out.print(rename + " 회원의 주소를 입력하세요: ");
				String readdr = input.nextLine();
				System.out.print(rename + " 회원의 비밀번호를 입력하세요: ");
				String enterpwd = input.nextLine();
				
				if (enterpwd.equals(members.getPwd(point))) {
					members.setName(point, rename);
					members.setPhone(point, rephone);
					members.setAddr(point, readdr);
					System.out.println("수정 완료되었습니다.");
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			} 
			else {
				System.out.println("해당 이름의 회원이 존재하지 않습니다.");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	void deleteMember() {
		try {
			Scanner input = new Scanner(System.in);
			boolean found = false;
			int point=0;

			System.out.print("삭제할 회원 이름을 입력해주세요 ");
			String name = input.nextLine();
			
			for(int i=0; i<100; i++) {
				if(name.equals(members.getName(i))) {
					point=i;
					found=true;
					break;
				}
				else {
					found=false;
				}
			}
			
			if (found) {
				System.out.print(name + " 회원의 비밀번호를 입력하세요: ");
				String enterpwd = input.nextLine();

				if (enterpwd.equals(members.getPwd(point))) {
					members.setName(point,  null);
					members.setPhone(point,  null);
					members.setAddr(point,  null);
					members.setPwd(point,  null);
					
					/*int memnum=members.getNum(index);
					if(memnum> index) {
						members.setNum(index, memnum-1);
					}*/
					
					System.out.println("삭제 완료되었습니다.");
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			} 
			else {
				System.out.println("해당 이름의 회원이 존재하지 않습니다.");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	void fileMember() {
		for(int i=0; i<100; i++) {
			if(members.getNum(i)!=0 && members.getName(i)!=null) {
				System.out.println("회원번호 "+members.getNum(i)+"\t이름 "+members.getName(i)+"\t연락처 "+members.getPhone(i)+"\t주소: "+members.getAddr(i)+"\t비밀번호: "+members.getPwd(i));
			}
		}
	}
	
	@Override
	void listMember() {
		File file=new File("memberList.txt");
		
		try {
			if(!file.exists())
				file.createNewFile();
			
			FileWriter fw=new FileWriter(file, true);
			
			for(int i=0; i<100; i++) {
				if(members.getNum(i)!=0 && members.getName(i)!=null) 
					fw.write("회원번호: "+members.getNum(i)+"\t이름: "+members.getName(i)+"\t연락처: "+members.getPhone(i)+"\t주소: "+members.getAddr(i)+"\t비밀번호: "+members.getPwd(i)+"\n");
			}
			fw.close();
			System.out.println("파일 쓰기 성공");
		} catch(Exception e) {
			e.getMessage();
		}
		
	}

}
