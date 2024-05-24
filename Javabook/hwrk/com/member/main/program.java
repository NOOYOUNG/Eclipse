/*package com.member.main;

import java.util.Scanner;
import com.member.main.createMember;
import com.member.main.readMember;

public class program extends ManageMember{
	Scanner s;
	int num;
	String name;
	String phone;
	String addr;
	String pwd, enterpwd;
	
	program(){
		s=new Scanner(System.in);
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
		
		int choice=s.nextInt();
		
		return choice;
	}
	
	void setProgram() {
		int choice=scrProgram();
		
		switch(choice) {
		case 1:
			createMember cM=new createMember();
			break;
		case 2:
			readMember rM=new readMember();
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
			break;
		}
		
	}
	
	void updateMember(int num, String name, String phone) {
		System.out.print("수정할 회원 이름을 입력해주세요 ");
		name=s.nextLine();
		System.out.print(name+" 회원의 이름을 수정하세요: ");
		name=s.nextLine();
		System.out.print(name+" 회원의 연락처를 수정하세요: ");
		phone=s.nextLine();
		System.out.print(name+" 회원의 주소를 입력하세요: ");
		addr=s.nextLine();
		
		while(true) {
			System.out.println(name+" 회원의 비밀번호를 입력하세요: ");
			enterpwd=s.nextLine();
			if(pwd.equals(enterpwd)) {
				//수정 구현
				System.out.println("수정 완료되었습니다.");
				break;
			}
			else {
				System.out.println("비밀번호가 일치하지 않습니다.");
				continue;
			}
		}
	}
	
	void deleteMember(int num) {
		System.out.print("삭제할 회원 이름을 입력해주세요 ");
		name=s.nextLine();
	
		while(true) {
			System.out.println("비밀번호를 입력하세요: ");
			enterpwd=s.nextLine();
			if(pwd.equals(enterpwd)) {
				//지우기 구현
				System.out.println("삭제되었습니다.");
				break;
			}
			else {
				System.out.println("비밀번호가 일치하지 않습니다.");
				continue;
			}
		}
	}
	
}
*/
