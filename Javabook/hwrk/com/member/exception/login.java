package com.member.exception;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

import com.member.domain.Member;
import com.member.controller.MemberController;

public class login {
	Scanner s;
	private Member members;

	login() {
		s = new Scanner(System.in);
		members=new Member();
		createAdmin(0);
		memberLogin();
	}

	public void createAdmin(int num) {
		members.setMember(num, "admin", "01011112222", "관리자주소", "admin");
	}

	public void memberLogin() {
		if (members != null) {
			for (int i = 1; i < 100; i++) {
				members.setMember(i, members.getName(i), members.getPhone(i), members.getAddr(i),members.getPwd(i));
			}
		}
	}

	void scrLogin() {
		boolean boo = true;
		int cnt = 0;

		while (boo) {
			System.out.println("***************************************");
			System.out.println("\t\t로그인");
			System.out.println("***************************************");

			System.out.print("아이디를 입력하세요: ");
			String adname = s.nextLine();

			if (adname.equals(members.getName(0))) {
				System.out.print("비밀번호를 입력하세요: ");
				String adpwd = s.nextLine();

				if (adpwd.equals(members.getPwd(0))) {
					System.out.println("로그인 성공");
					boo = false;
				} else {
					System.out.println("비밀번호가 틀렸습니다.");
					cnt++;
				}
			} else {
				System.out.println("일치하는 아이디가 없습니다.");
			}

			if (cnt == 3) {
				System.out.println("로그인 횟수 초과");
				break;
			}

		}
	}

}
