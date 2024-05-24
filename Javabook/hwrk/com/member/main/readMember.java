/*package com.member.main;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

import com.member.domain.Member;

public class readMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member members=new Member();
		File file=new File("memberlist.txt");
		
		try {
			
			Scanner input=new Scanner(System.in);
			
			System.out.print("조회할 회원 이름을 입력해주세요 ");
			String inputname=input.nextLine();
			boolean found=false;
			
			
			for(int i=0; i<5; i++) {
				System.out.println("시작1");
				String name=members.getName(i);
				System.out.println(members.getName(i));
					if(name!=null && name.equals(inputname)) {
						System.out.println("시작2");
						found=true;
						System.out.println(inputname+" 고객 정보 :");
						System.out.println("회원번호: "+members.getNum(i)+"\t이름: "+members.getName(i)+"\t연락처: "+members.getPhone(i)+"\t주소: "+members.getAddr(i));
						break;
				}
			}
			System.out.println("시작3");
			
			if(!found) {
				System.out.println("해당 이름의 회원이 존재하지 않습니다.");
			}
			
		} catch(Exception e) {
			System.out.println(e);
		}

	}

}*/
